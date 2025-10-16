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

arraySpec returns [int sizeVal]
  : '[' e=INTEGER { $sizeVal = Integer.parseInt($e.getText()); }
  | '[' ']' { $sizeVal = 0; }
  ;

declareItem returns [String exprText, int arraySize]
  : varNameToken=ID arrSpec=arraySpec? (ATTR e=expr { $exprText = $e.text; })?
    {
        $arraySize = -1;
        if ($arrSpec.text != null) {
            $arraySize = $arrSpec.sizeVal;
        }

        Variable symbol;
        if ($arraySize >= 0) {
            symbol = new Variable($varNameToken.getText(), _tipo, $arraySize);
        } else {
            symbol = new Variable($varNameToken.getText(), _tipo, $exprText);
        }

        if (!symbolTable.exists($varNameToken.getText())) {
            symbolTable.add(symbol);
        } else {
            throw new SemanticException("Symbol " + $varNameToken.getText() + " already declared");
        }

        if ($exprText != null) {
            CommandAtribuicao cmd = new CommandAtribuicao($varNameToken.getText(), $exprText);
            stack.peek().add(cmd);
        }
    }
;




           
tipo
    : NUMERO   (AC size=INTEGER? FC { _tipo = Variable.Type.NUMBER; _arraySize = ($size != null) ? Integer.parseInt($size.getText()) : 0; })
    | TEXTO    (AC size=INTEGER? FC { _tipo = Variable.Type.TEXT;   _arraySize = ($size != null) ? Integer.parseInt($size.getText()) : 0; })
    | BOOLEANO (AC size=INTEGER? FC { _tipo = Variable.Type.BOOLEAN;_arraySize = ($size != null) ? Integer.parseInt($size.getText()) : 0; })
    | INTEIRO  (AC size=INTEGER? FC { _tipo = Variable.Type.INTEGER;_arraySize = ($size != null) ? Integer.parseInt($size.getText()) : 0; })
    | CARACTERE(AC size=INTEGER? FC { _tipo = Variable.Type.CHAR;   _arraySize = ($size != null) ? Integer.parseInt($size.getText()) : 0; })
    ;

        
bloco
    : ACH
      {
        curThread = new ArrayList<>();
        stack.push(curThread);
      }
      (cmd | decl)+
      FCH
      {
        ArrayList<AbstractCommand> commands = stack.pop();
        if (commands != null) {
          curThread = new ArrayList<>();
        }
      }
    ;
		

cmd
    : cmdleitura
    | cmdescrita
    | cmdattrib
    | cmdselecao
    | cmdwhile
    | cmdfor
    | cmdArrayInit
    ;

cmdArrayInit
  : arrayNameToken=ID ACH valores+=expr (VIR valores+=expr)* FCH SC?
  {
    ArrayList<String> vals = new ArrayList<String>();
    for (int i = 0; i < $valores.size(); i++) {
      vals.add($valores.get(i).text);
    }
    String arrName = $arrayNameToken.getText();
    Variable var = null;
    if (symbolTable.exists(arrName)) {
      var = (Variable) symbolTable.get(arrName);
      if (!var.isArray()) {
        throw new SemanticException("Symbol " + arrName + " is not an array");
      }
    }

    CommandArrayInit cmd = new CommandArrayInit(arrName, vals, var);
    stack.peek().add(cmd);
  }
  ;
		
cmdleitura
    : 'leia' AP
        idToken=ID { verificaID($idToken.getText()); _readID = $idToken.getText(); }
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
  : indexedVar=idIndexed ATTR e=expr SC
  {
      CommandAtribuicao cmd = new CommandAtribuicao($indexedVar.name, $e.text, $indexedVar.index);
      stack.peek().add(cmd);
  }
  | simpleVar=ID ATTR e=expr SC
  {
      CommandAtribuicao cmd = new CommandAtribuicao($simpleVar.getText(), $e.text);
      stack.peek().add(cmd);
  }
;

idIndexed returns [String name, String index]
  : indexVar=ID '[' e=expr ']' { $name = $indexVar.getText(); $index = $e.text; }
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
    :ID AC eIdx=expr FC { $text = $ID.getText() + "[" + $eIdx.text + "]"; }
    | ID { $text = $ID.getText(); }
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

AC : '[';

FC : ']';

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

