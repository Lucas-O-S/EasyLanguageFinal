grammar EasyLanguage;

@header{
    import br.edu.cefsa.compiler.datastructures.Symbol;
    import br.edu.cefsa.compiler.datastructures.Variable;
    import br.edu.cefsa.compiler.datastructures.SymbolTable;
    import br.edu.cefsa.compiler.datastructures.Function;
    import br.edu.cefsa.compiler.exceptions.SemanticException;
    import br.edu.cefsa.compiler.abstractsyntaxtree.Program;
    import br.edu.cefsa.compiler.abstractsyntaxtree.AbstractCommand;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandLeitura;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandEscrita;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandAtribuicao;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandAtribuicaoArrayItem;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandDecisao;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandFor;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandWhile;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandArrayInit;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandFunction;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandReturn;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandCallFunction;
    import java.util.ArrayList;
    import java.util.Stack;
}

@members{
    private Variable.Type _tipo;
    private Variable.Type _funcTipo;
    private SymbolTable symbolTable = new SymbolTable();
    private Symbol symbol;
    private Program program = new Program();
    private ArrayList<AbstractCommand> curThread;
    private Stack<ArrayList<AbstractCommand>> stack = new Stack<>();
    private String _readID;
    private String _exprID;
    private String _exprContent;
    private String _exprDecision;
    private ArrayList<AbstractCommand> listaTrue;
    private ArrayList<AbstractCommand> listaFalse;
    private String _position;
    private int _arraySize = -1; 
    private ArrayList<Variable> _parameters;
    private ArrayList<CommandFunction> _functions = new ArrayList<>();
    private boolean _insideFunction = false;
    private SymbolTable prevTable = new SymbolTable();
    private ArrayList<String> _callArgs = new ArrayList<>();
    private java.util.ArrayList<String> _callArgsTemp = new java.util.ArrayList<>();




    
    
    public void verificaID(String id){
        if (!symbolTable.exists(id)){
            throw new SemanticException("Symbol "+id+" not declared");
        }
    }

    public void exibeComandos(){
        for (AbstractCommand c: program.getComandos()){
            System.out.println(c);
        }
    }
    
    public void generateCode(){
        program.generateTarget();
    }
}

prog
    : (cmdfuncao)* 'programa'
      {
        curThread = new ArrayList<>();
        stack.push(curThread);
      }
      bloco
      'fimprog;'
      {
        program.setVarTable(symbolTable);
        program.setComandos(stack.pop());
        program.setFunctions(_functions);
      }
    ;

decl
    : tipo idList SC
    ;

idList
    : declareItem (VIR declareItem)*
    ;


declareItem returns [String exprText]
    : ID (ATTR e=expr { $exprText = $e.text; })?
    {
        String varName = $ID.getText();
        String value = $exprText;

        // Tipo da variável
        Variable.Type varType = _tipo;

        // Criação do símbolo
        symbol = new Variable(varName, varType, value);
        if (!symbolTable.exists(varName)){
            symbolTable.add(symbol);
        } else {
            throw new SemanticException("Symbol " + varName + " already declared");
        }

        // Criação do comando de atribuição
        if (value != null) {
            CommandAtribuicao cmd;
            if (_insideFunction) {
                // variável local da função: passa o tipo
                cmd = new CommandAtribuicao(varName, value, varType);
            } else {
                // variável global: apenas atribuição
                cmd = new CommandAtribuicao(varName, value);
            }
            stack.peek().add(cmd);
        }
    }
;


           
tipo
    : DECIMAL   { _tipo = Variable.Type.NUMBER; }
    | TEXTO    { _tipo = Variable.Type.TEXT; }
    | BOOLEANO { _tipo = Variable.Type.BOOLEAN; }
    | INTEIRO  { _tipo = Variable.Type.INTEGER; }
    | CARACTERE{ _tipo = Variable.Type.CHAR; }
    | VAZIO    { _tipo = Variable.Type.VOID; }
    ;
        
bloco
    : ACH
      {
        curThread = new ArrayList<>();
        stack.push(curThread);
      }
      (cmd | decl)+
      FCH
      ;
		

cmd
    : cmdleitura
    | cmdescrita
    | cmdattribarrayitem
    | cmdattrib
    | cmdselecao
    | cmdwhile
    | cmdfor
    | cmdarray
    | cmdChamadaFuncao
    ;
		
cmdleitura
    : 'leia' AP
        id=ID { verificaID($id.getText()); _readID = $id.getText(); }
      FP SC
      {
        Variable var = (Variable)symbolTable.get(_readID);
        CommandLeitura cmd = new CommandLeitura(_readID, var);
        stack.peek().add(cmd);
      }
    ;
			
cmdescrita
    : 'escreva' AP e=expr FP SC
      {
        CommandEscrita cmd = new CommandEscrita($e.text);
        stack.peek().add(cmd);
      }
    ;
			
cmdattrib
    : id=ID { verificaID($id.getText()); _exprID = $id.getText(); }
      ATTR e=expr SC
      {
        _exprContent = $e.text;
        CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
        stack.peek().add(cmd);
      }
    ;

cmdattribarrayitem
    : id=ID AC idx=expr FC ATTR e=expr SC
      {
        verificaID($id.getText());
        _exprID = $id.getText();
        _position = $idx.text;
        _exprContent = $e.text;
        CommandAtribuicaoArrayItem cmd = new CommandAtribuicaoArrayItem(_exprID, _exprContent, _position);
        stack.peek().add(cmd);
      }
    ;

cmdselecao
    : 'se' AP c=comp FP ACH
        {
            curThread = new ArrayList<>();
            stack.push(curThread);
            _exprDecision = $c.text;
        }
        (cmd)+
      FCH
      {
        listaTrue = stack.pop();
      }
    ('senao' ACH
        {
            curThread = new ArrayList<>();
            stack.push(curThread);
        }
        (cmd)+
      FCH
      {
        listaFalse = stack.pop();
        CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
        stack.peek().add(cmd);
      }
    )?
    ;

cmdfor
locals [String stepExpr = "1"]
    : 'para' AP ID 'de' e1=expr op=OPREL e2=expr ('passo' e3=expr { $stepExpr = $e3.text; })? FP 'faca' ACH
        {
            curThread = new ArrayList<>();
            stack.push(curThread);
        }
        (cmd)+
      FCH
      {
        ArrayList<AbstractCommand> listaFor = stack.pop();
        String varName = $ID.getText();
        String startExpr = $e1.text;
        String operator = $op.getText();
        String endExpr = $e2.text;

        CommandFor cmd = new CommandFor(varName, startExpr, operator, endExpr, $stepExpr, listaFor);
        stack.peek().add(cmd);
      }
    ;

cmdwhile
    : 'enquanto' AP c=comp FP ACH
        {
            curThread = new ArrayList<>();
            stack.push(curThread);
            _exprDecision = $c.text;
        }
        (cmd)+
      FCH
      {
        ArrayList<AbstractCommand> listaWhile = stack.pop();
        CommandWhile cmd = new CommandWhile(_exprDecision, listaWhile);
        stack.peek().add(cmd);
      }
    ;

cmdarray
    : 'vetor' tipoVar=tipo ID AC (size=INTEGER)? FC SC
    {
        String varName = $ID.getText();                 
        int arraySize = ($size != null) ? Integer.parseInt($size.getText()) : 0;

  
        Variable.Type arrayType = _tipo;

        Variable var = new Variable(varName, arrayType, arraySize);
        if (!symbolTable.exists(varName)) {
            symbolTable.add(var);
        } else {
            throw new SemanticException("Array " + varName + " already declared");
        }

    }
;

cmdfuncao
    : 'funcao' t=tipo id=ID
      AP
        {
            // Inicializa lista de parâmetros e contexto da função
            _parameters = new ArrayList<>();
            _funcTipo = _tipo;  // tipo de retorno da função
            _insideFunction = true;

            // Salva contexto da tabela de símbolos
            prevTable = symbolTable;
            symbolTable = new SymbolTable();

            // Prepara novo bloco de comandos
            curThread = new ArrayList<>();
            stack.push(curThread);
        }
        (listaParametros)?
      FP
      ACH
        (decl | cmd)*
        (retorno)?
      FCH
        {
            // Recupera comandos da função
            ArrayList<AbstractCommand> listaFunc = stack.pop();

            // Cria lista de parâmetros
            ArrayList<Variable> paramList = _parameters;

            // Cria função com parâmetros, tabela local e comandos
            Function func = new Function($id.getText(), _funcTipo, paramList, symbolTable, listaFunc);

            // Adiciona função à lista de funções
            _functions.add(new CommandFunction(func));

            // Restaura contexto global
            symbolTable = prevTable;
            prevTable = null;
            _parameters = null;
            _insideFunction = false;
        }
    ;

listaParametros
    : parametro (VIR parametro)*
    ;

parametro
    : t=tipo id=ID
      {
          // Cria variável de parâmetro usando o tipo atualizado por 'tipo'
          Variable v = new Variable($id.getText(), _tipo, null);
          _parameters.add(v);
      }
    ;

retorno
    : 'retorne' e=expr SC
      {
        CommandReturn cmd = new CommandReturn($e.text);
        stack.peek().add(cmd);
      }
    ;
cmdChamadaFuncao
    : id=ID AP (args=listaArgumentos { _callArgsTemp = $args.argsList; })? FP SC
      {
          // Garante que _callArgsTemp nunca seja nula
          java.util.ArrayList<String> callArgs = (_callArgsTemp != null)
              ? _callArgsTemp
              : new java.util.ArrayList<String>();

          // Verifica se a função existe: busca em _functions
          boolean funcFound = false;
          for (CommandFunction cf : _functions) {
              try {
                  Function f = cf.getFunction();
                  if (f.getName().equals($id.getText())) {
                      funcFound = true;
                      break;
                  }
              } catch (Exception ex) {
                  // ignora e continua
              }
          }
          if (!funcFound && !symbolTable.exists($id.getText())) {
              throw new SemanticException("Function " + $id.getText() + " not declared");
          }

          // Cria o comando de chamada
          CommandCallFunction cmd = new CommandCallFunction($id.getText(), callArgs);
          stack.peek().add(cmd);

          // Limpa variável temporária
          _callArgsTemp = new java.util.ArrayList<>();
      }
    ;


listaArgumentos returns [java.util.ArrayList<String> argsList]
    : e=expr
      {
          $argsList = new java.util.ArrayList<String>();
          $argsList.add($e.text);
      }
      (VIR e2=expr { $argsList.add($e2.text); })*
      {
          // guarda em variável membro para uso por regras externas
          _callArgsTemp = $argsList;
      }
    ;


    // chamada de função como expressão (retornará um String com "nome(arg1, arg2, ...)")
funcCall returns [String text]
    : id=ID AP (args=listaArgumentos { _callArgsTemp = $args.argsList; })? FP
      {
          String name = $id.getText();
          java.util.ArrayList<String> argsList = (_callArgsTemp != null)
              ? _callArgsTemp
              : new java.util.ArrayList<String>();

          StringBuilder sb = new StringBuilder();
          for (int i = 0; i < argsList.size(); i++) {
              if (i > 0) sb.append(", ");
              sb.append(argsList.get(i));
          }

          $text = name + "(" + sb.toString() + ")";
          _callArgsTemp = new java.util.ArrayList<>(); // limpa
      }
    ;





comp returns [String text]
    : c1=condicao {$text = $c1.text;}
      ( op=(AND|OR) c2=condicao {
            String opJava = $op.getText().equals("ou") ? "||" : "&&";
            $text += " " + opJava + " " + $c2.text;
        }
      )*
    ;

condicao returns [String text]
    : t1=termo op=OPREL t2=termo { $text = $t1.text + $op.getText() + $t2.text; }
    | NOT c=condicao { $text = "!" + $c.text; }
    ;

expr returns [String text]
    : termo1=termo { $text = $termo1.text; }
      (OP termo2=termo { $text += " " + $OP.getText() + " " + $termo2.text; })*
    ;

termo returns [String text]
    : ID { $text = $ID.getText(); }
    | NUMBER { $text = $NUMBER.getText(); }
    | BOOL
      {
        String val = $BOOL.getText();
        if(val.equals("verdadeiro")) val = "true";
        else if(val.equals("falso")) val = "false";
        $text = val;
      }
    | INTEGER { $text = $INTEGER.getText(); }
    | STRING   { $text = $STRING.getText(); }
    | CHAR { $text = $CHAR.getText(); }
    | f=funcCall { $text = $f.text; }             
    | AP e=expr FP { $text = "(" + $e.text + ")"; }
    ;


AP : '(';

FP : ')';

OP : '+' | '-' | '*' | '/';

ACH : '{';

FCH : '}';

AND  : 'e';

OR : 'ou';

NOT : 'nao';

OPREL : '>=' | '<=' | '==' | '!=' | '>' | '<' ;

BOOL : 'verdadeiro' | 'falso' | 'true' | 'false' ;

CHAR : '\'' ( ~['\\] | '\\' . ) '\'' ;

NUMBER : [0-9]+ '.' [0-9]+;

INTEGER : [0-9]+;

STRING : '"' (~["\\] | '\\' .)* '"';

WS : (' ' | '\t' | '\n' | '\r') -> skip;

DECIMAL   : 'decimal';

BOOLEANO : 'booleano';

TEXTO    : 'texto';

INTEIRO  : 'inteiro';

CARACTERE: 'caractere';

VAZIO : 'vazio';


ID   : [a-z] ([a-zA-Z0-9])* ;

VIR  : ',';

ATTR : '=';

SC   : ';';

AC : '[';

FC : ']';
 