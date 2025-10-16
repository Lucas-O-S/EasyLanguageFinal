grammar EasyLanguage;

@header{
    import br.edu.cefsa.compiler.datastructures.Symbol;
    import br.edu.cefsa.compiler.datastructures.Variable;
    import br.edu.cefsa.compiler.datastructures.SymbolTable;
    import br.edu.cefsa.compiler.exceptions.SemanticException;
    import br.edu.cefsa.compiler.abstractsyntaxtree.Program;
    import br.edu.cefsa.compiler.abstractsyntaxtree.AbstractCommand;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandLeitura;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandEscrita;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandAtribuicao;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandDecisao;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandFor;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandWhile;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandArrayInit;
    import java.util.ArrayList;
    import java.util.Stack;
}

@members{
    private Variable.Type _tipo;
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
    private int _arraySize = -1; 

    
    
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
    : 'programa'
      {
        curThread = new ArrayList<>();
        stack.push(curThread);
      }
      (decl)*
      bloco
      'fimprog;'
      {
        program.setVarTable(symbolTable);
        program.setComandos(stack.pop());
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

        symbol = new Variable(varName, _tipo, value);
        if (!symbolTable.exists(varName)){
            symbolTable.add(symbol);
        } else {
            throw new SemanticException("Symbol " + varName + " already declared");
        }

        if (value != null) {
            CommandAtribuicao cmd = new CommandAtribuicao(varName, value);
            stack.peek().add(cmd);
        }
    }
    ;
           
tipo
    : NUMERO   { _tipo = Variable.Type.NUMBER; }
    | TEXTO    { _tipo = Variable.Type.TEXT; }
    | BOOLEANO { _tipo = Variable.Type.BOOLEAN; }
    | INTEIRO  { _tipo = Variable.Type.INTEGER; }
    | CARACTERE{ _tipo = Variable.Type.CHAR; }
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
    | cmdattrib
    | cmdselecao
    | cmdwhile
    | cmdfor
    | cmdarray
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
        String varName = $ID.getText();                 // variável local para evitar conflito
        int arraySize = ($size != null) ? Integer.parseInt($size.getText()) : 0;

        Variable var = new Variable(varName, _tipo, arraySize); // construtor correto
        if (!symbolTable.exists(varName)) {
            symbolTable.add(var);
        } else {
            throw new SemanticException("Array " + varName + " already declared");
        }

        CommandArrayInit cmd = new CommandArrayInit(varName, var); // se seu CommandArrayInit aceitar apenas (nome, Variable)
        stack.peek().add(cmd);
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
    | CHAR { $text = $CHAR.getText(); }  
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

WS : (' ' | '\t' | '\n' | '\r') -> skip;

NUMERO   : 'numero';

BOOLEANO : 'booleano';

TEXTO    : 'texto';

INTEIRO  : 'inteiro';

CARACTERE: 'caractere';

ID   : [a-z] ([a-zA-Z0-9])* ;

VIR  : ',';

ATTR : '=';

SC   : ';';

AC : '[';

FC : ']';
 