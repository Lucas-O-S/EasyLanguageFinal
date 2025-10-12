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
	import java.util.ArrayList;
	import java.util.Stack;
}

@members{
	private int _tipo;
	private String _varName;
	private String _varValue;
	private SymbolTable symbolTable = new SymbolTable();
	private Symbol symbol;
	private Program program = new Program();
	private ArrayList<AbstractCommand> curThread;
	private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
	private String _readID;
	private String _writeID;
	private String _exprID;
	private String _exprContent;
	private String _exprDecision;
	private ArrayList<AbstractCommand> listaTrue;
	private ArrayList<AbstractCommand> listaFalse;
	
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

prog	: 'programa' decl bloco 'fimprog;'
           {  program.setVarTable(symbolTable);
              program.setComandos(stack.pop());
           	 
           } 
	;
		
decl    :  (declaravar)+
        ;
        
        
declaravar :  tipo ID  {
	                  _varName = _input.LT(-1).getText();
	                  _varValue = null;
	                  symbol = new Variable(_varName, _tipo, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                     symbolTable.add(symbol);	
	                  }
	                  else{
	                  	 throw new SemanticException("Symbol "+_varName+" already declared");
	                  }
                    } 
              (  VIR 
              	 ID {
	                  _varName = _input.LT(-1).getText();
	                  _varValue = null;
	                  symbol = new Variable(_varName, _tipo, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                     symbolTable.add(symbol);	
	                  }
	                  else{
	                  	 throw new SemanticException("Symbol "+_varName+" already declared");
	                  }
                    }
              )* 
               SC
           ;
           
tipo       : 'numero' { _tipo = Variable.NUMBER;  }
           | 'texto'  { _tipo = Variable.TEXT;  }
           ;
        
bloco	: { curThread = new ArrayList<AbstractCommand>(); 
	        stack.push(curThread);  
          }
          (cmd)+
		;
		

cmd		:  cmdleitura  
 		|  cmdescrita 
 		|  cmdattrib
 		|  cmdselecao  
		|  cmdwhile
		|  cmdfor 
		;
		
cmdleitura	: 'leia' AP
                     ID { verificaID(_input.LT(-1).getText());
                     	  _readID = _input.LT(-1).getText();
                        } 
                     FP 
                     SC 
                     
              {
              	Variable var = (Variable)symbolTable.get(_readID);
              	CommandLeitura cmd = new CommandLeitura(_readID, var);
              	stack.peek().add(cmd);
              }   
			;
			
cmdescrita	: 'escreva' 
                 AP 
                 ID { verificaID(_input.LT(-1).getText());
	                  _writeID = _input.LT(-1).getText();
                     } 
                 FP 
                 SC
               {
               	  CommandEscrita cmd = new CommandEscrita(_writeID);
               	  stack.peek().add(cmd);
               }
			;
			
cmdattrib	:  ID { verificaID(_input.LT(-1).getText());
                    _exprID = _input.LT(-1).getText();
                   } 
               ATTR 
               e=expr 
               SC
               {
               	 _exprContent = $e.text;
               	 CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
               	 stack.peek().add(cmd);
               }
			;

			
			
cmdselecao  :  'se' AP
                    ID    { _exprDecision = _input.LT(-1).getText(); }
                    OPREL { _exprDecision += _input.LT(-1).getText(); }
                    (ID | NUMBER) {_exprDecision += _input.LT(-1).getText(); }
                    FP 
                    ACH 
                    { curThread = new ArrayList<AbstractCommand>(); 
                        stack.push(curThread);
                    }
                    (cmd)+ 
                    FCH
                    {
                       listaTrue = stack.pop();	
                    } 
                   ('senao' 
                   	ACH
                   	{
                   	 	curThread = new ArrayList<AbstractCommand>();
                   	 	stack.push(curThread);
                   	} 
                   	(cmd+) 
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
    : 'para' ID 'de' e1=expr op=OPREL e2=expr ('passo' e3=expr { $stepExpr = $e3.text; })? 'faca' ACH
        {
            curThread = new ArrayList<AbstractCommand>();
            stack.push(curThread);
        }
        (cmd)+
      FCH
        {
            ArrayList<AbstractCommand> listaFor = stack.pop();
            String varName = $ID.text;
            String startExpr = $e1.text;
            String operator = $op.text;
            String endExpr = $e2.text;

            CommandFor cmd = new CommandFor(varName, startExpr, operator, endExpr, $stepExpr, listaFor);
            stack.peek().add(cmd);
        }
    ;


cmdwhile :
    'enquanto' AP 
        c=comp { _exprDecision = $c.text; } 
    FP ACH
        {
            curThread = new ArrayList<AbstractCommand>();
            stack.push(curThread);
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
    : t1=termo { $text = $t1.text; }
      ( op=OPREL t2=termo { $text += $op.text + $t2.text; } )*
    ;

expr returns [String text]
    : t1=termo { $text = $t1.text; }
      ( op=OP t2=termo { $text += $op.text + $t2.text; } )*
    ;

termo returns [String text]
    : ID { verificaID($ID.text); $text = $ID.text; }
    | NUMBER { $text = $NUMBER.text; }
    ;

			
	
AP	: '('
	;
	
FP	: ')'
	;
	
SC	: ';'
	;
	
OP	: '+' | '-' | '*' | '/'
	;
	
ATTR : '='
     ;
	 
VIR  : ','
     ;
     
ACH  : '{'
     ;
     
FCH  : '}'
     ;
	 
	 
OPREL : '>=' | '<=' | '==' | '!=' | '>' | '<' 
      ;
      
ID	: [a-z] ([a-z] | [A-Z] | [0-9])*
	;
	
NUMBER	: [0-9]+ ('.' [0-9]+)?
	;
		
WS	: (' ' | '\t' | '\n' | '\r') -> skip;

