// Generated from EasyLanguage.g4 by ANTLR 4.12.0
package br.edu.cefsa.compiler.parser;

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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EasyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, AP=12, FP=13, AC=14, FC=15, OP=16, ACH=17, FCH=18, 
		AND=19, OR=20, NOT=21, OPREL=22, BOOL=23, CHAR=24, NUMBER=25, INTEGER=26, 
		WS=27, NUMERO=28, BOOLEANO=29, TEXTO=30, INTEIRO=31, CARACTERE=32, ID=33, 
		VIR=34, ATTR=35, SC=36;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_idList = 2, RULE_arraySpec = 3, RULE_declareItem = 4, 
		RULE_tipo = 5, RULE_bloco = 6, RULE_cmd = 7, RULE_cmdArrayInit = 8, RULE_cmdleitura = 9, 
		RULE_cmdescrita = 10, RULE_cmdattrib = 11, RULE_idIndexed = 12, RULE_cmdselecao = 13, 
		RULE_cmdfor = 14, RULE_cmdwhile = 15, RULE_comp = 16, RULE_condicao = 17, 
		RULE_expr = 18, RULE_termo = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "idList", "arraySpec", "declareItem", "tipo", "bloco", 
			"cmd", "cmdArrayInit", "cmdleitura", "cmdescrita", "cmdattrib", "idIndexed", 
			"cmdselecao", "cmdfor", "cmdwhile", "comp", "condicao", "expr", "termo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'leia'", "'escreva'", "'se'", "'senao'", 
			"'para'", "'de'", "'passo'", "'faca'", "'enquanto'", "'('", "')'", "'['", 
			"']'", null, "'{'", "'}'", "'e'", "'ou'", "'nao'", null, null, null, 
			null, null, null, "'numero'", "'booleano'", "'texto'", "'inteiro'", "'caractere'", 
			null, "','", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"AP", "FP", "AC", "FC", "OP", "ACH", "FCH", "AND", "OR", "NOT", "OPREL", 
			"BOOL", "CHAR", "NUMBER", "INTEGER", "WS", "NUMERO", "BOOLEANO", "TEXTO", 
			"INTEIRO", "CARACTERE", "ID", "VIR", "ATTR", "SC"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EasyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public EasyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);

			        curThread = new ArrayList<>();
			        stack.push(curThread);
			      
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8321499136L) != 0)) {
				{
				{
				setState(42);
				decl();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			bloco();
			setState(49);
			match(T__1);

			        program.setVarTable(symbolTable);
			        program.setComandos(stack.pop());
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			tipo();
			setState(53);
			idList();
			setState(54);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdListContext extends ParserRuleContext {
		public List<DeclareItemContext> declareItem() {
			return getRuleContexts(DeclareItemContext.class);
		}
		public DeclareItemContext declareItem(int i) {
			return getRuleContext(DeclareItemContext.class,i);
		}
		public List<TerminalNode> VIR() { return getTokens(EasyLanguageParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(EasyLanguageParser.VIR, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitIdList(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			declareItem();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(57);
				match(VIR);
				setState(58);
				declareItem();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArraySpecContext extends ParserRuleContext {
		public int sizeVal;
		public Token e;
		public TerminalNode AC() { return getToken(EasyLanguageParser.AC, 0); }
		public TerminalNode INTEGER() { return getToken(EasyLanguageParser.INTEGER, 0); }
		public TerminalNode FC() { return getToken(EasyLanguageParser.FC, 0); }
		public ArraySpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterArraySpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitArraySpec(this);
		}
	}

	public final ArraySpecContext arraySpec() throws RecognitionException {
		ArraySpecContext _localctx = new ArraySpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arraySpec);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(AC);
				setState(65);
				((ArraySpecContext)_localctx).e = match(INTEGER);
				 ((ArraySpecContext)_localctx).sizeVal =  Integer.parseInt(((ArraySpecContext)_localctx).e.getText()); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(AC);
				setState(68);
				match(FC);
				 ((ArraySpecContext)_localctx).sizeVal =  0; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareItemContext extends ParserRuleContext {
		public String exprText;
		public int arraySize;
		public Token varNameToken;
		public ArraySpecContext arrSpec;
		public ExprContext e;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(EasyLanguageParser.ATTR, 0); }
		public ArraySpecContext arraySpec() {
			return getRuleContext(ArraySpecContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclareItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterDeclareItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitDeclareItem(this);
		}
	}

	public final DeclareItemContext declareItem() throws RecognitionException {
		DeclareItemContext _localctx = new DeclareItemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declareItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((DeclareItemContext)_localctx).varNameToken = match(ID);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AC) {
				{
				setState(73);
				((DeclareItemContext)_localctx).arrSpec = arraySpec();
				}
			}

			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTR) {
				{
				setState(76);
				match(ATTR);
				setState(77);
				((DeclareItemContext)_localctx).e = expr();
				 ((DeclareItemContext)_localctx).exprText =  ((DeclareItemContext)_localctx).e.text; 
				}
			}


			        ((DeclareItemContext)_localctx).arraySize =  -1;
			        if ((((DeclareItemContext)_localctx).arrSpec!=null?_input.getText(((DeclareItemContext)_localctx).arrSpec.start,((DeclareItemContext)_localctx).arrSpec.stop):null) != null) {
			            ((DeclareItemContext)_localctx).arraySize =  ((DeclareItemContext)_localctx).arrSpec.sizeVal;
			        }

			        Variable symbol;
			        if (_localctx.arraySize >= 0) {
			            symbol = new Variable(((DeclareItemContext)_localctx).varNameToken.getText(), _tipo, _localctx.arraySize);
			        } else {
			            symbol = new Variable(((DeclareItemContext)_localctx).varNameToken.getText(), _tipo, _localctx.exprText);
			        }

			        if (!symbolTable.exists(((DeclareItemContext)_localctx).varNameToken.getText())) {
			            symbolTable.add(symbol);
			        } else {
			            throw new SemanticException("Symbol " + ((DeclareItemContext)_localctx).varNameToken.getText() + " already declared");
			        }

			        if (_localctx.exprText != null) {
			            CommandAtribuicao cmd = new CommandAtribuicao(((DeclareItemContext)_localctx).varNameToken.getText(), _localctx.exprText);
			            stack.peek().add(cmd);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public Token size;
		public TerminalNode NUMERO() { return getToken(EasyLanguageParser.NUMERO, 0); }
		public TerminalNode AC() { return getToken(EasyLanguageParser.AC, 0); }
		public TerminalNode FC() { return getToken(EasyLanguageParser.FC, 0); }
		public TerminalNode INTEGER() { return getToken(EasyLanguageParser.INTEGER, 0); }
		public TerminalNode TEXTO() { return getToken(EasyLanguageParser.TEXTO, 0); }
		public TerminalNode BOOLEANO() { return getToken(EasyLanguageParser.BOOLEANO, 0); }
		public TerminalNode INTEIRO() { return getToken(EasyLanguageParser.INTEIRO, 0); }
		public TerminalNode CARACTERE() { return getToken(EasyLanguageParser.CARACTERE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(NUMERO);
				{
				setState(85);
				match(AC);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(86);
					((TipoContext)_localctx).size = match(INTEGER);
					}
				}

				setState(89);
				match(FC);
				 _tipo = Variable.Type.NUMBER; _arraySize = (((TipoContext)_localctx).size != null) ? Integer.parseInt(((TipoContext)_localctx).size.getText()) : 0; 
				}
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(TEXTO);
				{
				setState(92);
				match(AC);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(93);
					((TipoContext)_localctx).size = match(INTEGER);
					}
				}

				setState(96);
				match(FC);
				 _tipo = Variable.Type.TEXT;   _arraySize = (((TipoContext)_localctx).size != null) ? Integer.parseInt(((TipoContext)_localctx).size.getText()) : 0; 
				}
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(BOOLEANO);
				{
				setState(99);
				match(AC);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(100);
					((TipoContext)_localctx).size = match(INTEGER);
					}
				}

				setState(103);
				match(FC);
				 _tipo = Variable.Type.BOOLEAN;_arraySize = (((TipoContext)_localctx).size != null) ? Integer.parseInt(((TipoContext)_localctx).size.getText()) : 0; 
				}
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(INTEIRO);
				{
				setState(106);
				match(AC);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(107);
					((TipoContext)_localctx).size = match(INTEGER);
					}
				}

				setState(110);
				match(FC);
				 _tipo = Variable.Type.INTEGER;_arraySize = (((TipoContext)_localctx).size != null) ? Integer.parseInt(((TipoContext)_localctx).size.getText()) : 0; 
				}
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(CARACTERE);
				{
				setState(113);
				match(AC);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(114);
					((TipoContext)_localctx).size = match(INTEGER);
					}
				}

				setState(117);
				match(FC);
				 _tipo = Variable.Type.CHAR;   _arraySize = (((TipoContext)_localctx).size != null) ? Integer.parseInt(((TipoContext)_localctx).size.getText()) : 0; 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode ACH() { return getToken(EasyLanguageParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(EasyLanguageParser.FCH, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ACH);

			        curThread = new ArrayList<>();
			        stack.push(curThread);
			      
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__3:
				case T__4:
				case T__6:
				case T__10:
				case ID:
					{
					setState(123);
					cmd();
					}
					break;
				case NUMERO:
				case BOOLEANO:
				case TEXTO:
				case INTEIRO:
				case CARACTERE:
					{
					setState(124);
					decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16911435960L) != 0) );
			setState(129);
			match(FCH);

			        ArrayList<AbstractCommand> commands = stack.pop();
			        if (commands != null) {
			          curThread = new ArrayList<>();
			        }
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdselecaoContext cmdselecao() {
			return getRuleContext(CmdselecaoContext.class,0);
		}
		public CmdwhileContext cmdwhile() {
			return getRuleContext(CmdwhileContext.class,0);
		}
		public CmdforContext cmdfor() {
			return getRuleContext(CmdforContext.class,0);
		}
		public CmdArrayInitContext cmdArrayInit() {
			return getRuleContext(CmdArrayInitContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				cmdleitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				cmdescrita();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				cmdattrib();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				cmdselecao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				cmdwhile();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				cmdfor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				cmdArrayInit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdArrayInitContext extends ParserRuleContext {
		public Token arrayNameToken;
		public ExprContext expr;
		public List<ExprContext> valores = new ArrayList<ExprContext>();
		public TerminalNode ACH() { return getToken(EasyLanguageParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(EasyLanguageParser.FCH, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> VIR() { return getTokens(EasyLanguageParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(EasyLanguageParser.VIR, i);
		}
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public CmdArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdArrayInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdArrayInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdArrayInit(this);
		}
	}

	public final CmdArrayInitContext cmdArrayInit() throws RecognitionException {
		CmdArrayInitContext _localctx = new CmdArrayInitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdArrayInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((CmdArrayInitContext)_localctx).arrayNameToken = match(ID);
			setState(142);
			match(ACH);
			setState(143);
			((CmdArrayInitContext)_localctx).expr = expr();
			((CmdArrayInitContext)_localctx).valores.add(((CmdArrayInitContext)_localctx).expr);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(144);
				match(VIR);
				setState(145);
				((CmdArrayInitContext)_localctx).expr = expr();
				((CmdArrayInitContext)_localctx).valores.add(((CmdArrayInitContext)_localctx).expr);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(FCH);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(152);
				match(SC);
				}
			}


			    ArrayList<String> vals = new ArrayList<String>();
			    for (int i = 0; i < ((CmdArrayInitContext)_localctx).valores.size(); i++) {
			      vals.add(((CmdArrayInitContext)_localctx).valores.get(i).text);
			    }
			    String arrName = ((CmdArrayInitContext)_localctx).arrayNameToken.getText();
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdleituraContext extends ParserRuleContext {
		public Token idToken;
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__2);
			setState(158);
			match(AP);
			setState(159);
			((CmdleituraContext)_localctx).idToken = match(ID);
			 verificaID(((CmdleituraContext)_localctx).idToken.getText()); _readID = ((CmdleituraContext)_localctx).idToken.getText(); 
			setState(161);
			match(FP);
			setState(162);
			match(SC);

			        Variable var = (Variable)symbolTable.get(_readID);
			        CommandLeitura cmd = new CommandLeitura(_readID, var);
			        stack.peek().add(cmd);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdescritaContext extends ParserRuleContext {
		public ExprContext e;
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__3);
			setState(166);
			match(AP);
			setState(167);
			((CmdescritaContext)_localctx).e = expr();
			setState(168);
			match(FP);
			setState(169);
			match(SC);

			        CommandEscrita cmd = new CommandEscrita(((CmdescritaContext)_localctx).e.text);
			        stack.peek().add(cmd);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdattribContext extends ParserRuleContext {
		public IdIndexedContext indexedVar;
		public ExprContext e;
		public Token simpleVar;
		public TerminalNode ATTR() { return getToken(EasyLanguageParser.ATTR, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public IdIndexedContext idIndexed() {
			return getRuleContext(IdIndexedContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdattrib(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdattrib);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				((CmdattribContext)_localctx).indexedVar = idIndexed();
				setState(173);
				match(ATTR);
				setState(174);
				((CmdattribContext)_localctx).e = expr();
				setState(175);
				match(SC);

				      CommandAtribuicao cmd = new CommandAtribuicao(((CmdattribContext)_localctx).indexedVar.name, ((CmdattribContext)_localctx).e.text, ((CmdattribContext)_localctx).indexedVar.index);
				      stack.peek().add(cmd);
				  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((CmdattribContext)_localctx).simpleVar = match(ID);
				setState(179);
				match(ATTR);
				setState(180);
				((CmdattribContext)_localctx).e = expr();
				setState(181);
				match(SC);

				      CommandAtribuicao cmd = new CommandAtribuicao(((CmdattribContext)_localctx).simpleVar.getText(), ((CmdattribContext)_localctx).e.text);
				      stack.peek().add(cmd);
				  
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdIndexedContext extends ParserRuleContext {
		public String name;
		public String index;
		public Token indexVar;
		public ExprContext e;
		public TerminalNode AC() { return getToken(EasyLanguageParser.AC, 0); }
		public TerminalNode FC() { return getToken(EasyLanguageParser.FC, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdIndexedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idIndexed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterIdIndexed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitIdIndexed(this);
		}
	}

	public final IdIndexedContext idIndexed() throws RecognitionException {
		IdIndexedContext _localctx = new IdIndexedContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_idIndexed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((IdIndexedContext)_localctx).indexVar = match(ID);
			setState(187);
			match(AC);
			setState(188);
			((IdIndexedContext)_localctx).e = expr();
			setState(189);
			match(FC);
			 ((IdIndexedContext)_localctx).name =  ((IdIndexedContext)_localctx).indexVar.getText(); ((IdIndexedContext)_localctx).index =  ((IdIndexedContext)_localctx).e.text; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdselecaoContext extends ParserRuleContext {
		public CompContext c;
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(EasyLanguageParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(EasyLanguageParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(EasyLanguageParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(EasyLanguageParser.FCH, i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdselecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdselecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdselecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdselecao(this);
		}
	}

	public final CmdselecaoContext cmdselecao() throws RecognitionException {
		CmdselecaoContext _localctx = new CmdselecaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__4);
			setState(193);
			match(AP);
			setState(194);
			((CmdselecaoContext)_localctx).c = comp();
			setState(195);
			match(FP);
			setState(196);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			            _exprDecision = ((CmdselecaoContext)_localctx).c.text;
			        
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				cmd();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8589936824L) != 0) );
			setState(203);
			match(FCH);

			        listaTrue = stack.pop();
			      
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(205);
				match(T__5);
				setState(206);
				match(ACH);

				            curThread = new ArrayList<>();
				            stack.push(curThread);
				        
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(208);
					cmd();
					}
					}
					setState(211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8589936824L) != 0) );
				setState(213);
				match(FCH);

				        listaFalse = stack.pop();
				        CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
				        stack.peek().add(cmd);
				      
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdforContext extends ParserRuleContext {
		public String stepExpr = "1";
		public Token ID;
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public ExprContext e3;
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode ACH() { return getToken(EasyLanguageParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(EasyLanguageParser.FCH, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(EasyLanguageParser.OPREL, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdfor(this);
		}
	}

	public final CmdforContext cmdfor() throws RecognitionException {
		CmdforContext _localctx = new CmdforContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__6);
			setState(219);
			match(AP);
			setState(220);
			((CmdforContext)_localctx).ID = match(ID);
			setState(221);
			match(T__7);
			setState(222);
			((CmdforContext)_localctx).e1 = expr();
			setState(223);
			((CmdforContext)_localctx).op = match(OPREL);
			setState(224);
			((CmdforContext)_localctx).e2 = expr();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(225);
				match(T__8);
				setState(226);
				((CmdforContext)_localctx).e3 = expr();
				 ((CmdforContext)_localctx).stepExpr =  ((CmdforContext)_localctx).e3.text; 
				}
			}

			setState(231);
			match(FP);
			setState(232);
			match(T__9);
			setState(233);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			        
			setState(236); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(235);
				cmd();
				}
				}
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8589936824L) != 0) );
			setState(240);
			match(FCH);

			        ArrayList<AbstractCommand> listaFor = stack.pop();
			        String varName = ((CmdforContext)_localctx).ID.getText();
			        String startExpr = ((CmdforContext)_localctx).e1.text;
			        String operator = ((CmdforContext)_localctx).op.getText();
			        String endExpr = ((CmdforContext)_localctx).e2.text;

			        CommandFor cmd = new CommandFor(varName, startExpr, operator, endExpr, _localctx.stepExpr, listaFor);
			        stack.peek().add(cmd);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdwhileContext extends ParserRuleContext {
		public CompContext c;
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode ACH() { return getToken(EasyLanguageParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(EasyLanguageParser.FCH, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdwhile(this);
		}
	}

	public final CmdwhileContext cmdwhile() throws RecognitionException {
		CmdwhileContext _localctx = new CmdwhileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__10);
			setState(244);
			match(AP);
			setState(245);
			((CmdwhileContext)_localctx).c = comp();
			setState(246);
			match(FP);
			setState(247);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			            _exprDecision = ((CmdwhileContext)_localctx).c.text;
			        
			setState(250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(249);
				cmd();
				}
				}
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8589936824L) != 0) );
			setState(254);
			match(FCH);

			        ArrayList<AbstractCommand> listaWhile = stack.pop();
			        CommandWhile cmd = new CommandWhile(_exprDecision, listaWhile);
			        stack.peek().add(cmd);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompContext extends ParserRuleContext {
		public String text;
		public CondicaoContext c1;
		public Token op;
		public CondicaoContext c2;
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(EasyLanguageParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(EasyLanguageParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(EasyLanguageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(EasyLanguageParser.OR, i);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			((CompContext)_localctx).c1 = condicao();
			((CompContext)_localctx).text =  ((CompContext)_localctx).c1.text;
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(259);
				((CompContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((CompContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(260);
				((CompContext)_localctx).c2 = condicao();

				            String opJava = ((CompContext)_localctx).op.getText().equals("ou") ? "||" : "&&";
				            _localctx.text += " " + opJava + " " + ((CompContext)_localctx).c2.text;
				        
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public String text;
		public TermoContext t1;
		public Token op;
		public TermoContext t2;
		public CondicaoContext c;
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(EasyLanguageParser.OPREL, 0); }
		public TerminalNode NOT() { return getToken(EasyLanguageParser.NOT, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condicao);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
			case BOOL:
			case CHAR:
			case NUMBER:
			case INTEGER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				((CondicaoContext)_localctx).t1 = termo();
				setState(269);
				((CondicaoContext)_localctx).op = match(OPREL);
				setState(270);
				((CondicaoContext)_localctx).t2 = termo();
				 ((CondicaoContext)_localctx).text =  ((CondicaoContext)_localctx).t1.text + ((CondicaoContext)_localctx).op.getText() + ((CondicaoContext)_localctx).t2.text; 
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(NOT);
				setState(274);
				((CondicaoContext)_localctx).c = condicao();
				 ((CondicaoContext)_localctx).text =  "!" + ((CondicaoContext)_localctx).c.text; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public String text;
		public TermoContext termo1;
		public Token OP;
		public TermoContext termo2;
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(EasyLanguageParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(EasyLanguageParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			((ExprContext)_localctx).termo1 = termo();
			 ((ExprContext)_localctx).text =  ((ExprContext)_localctx).termo1.text; 
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(281);
				((ExprContext)_localctx).OP = match(OP);
				setState(282);
				((ExprContext)_localctx).termo2 = termo();
				 _localctx.text += " " + ((ExprContext)_localctx).OP.getText() + " " + ((ExprContext)_localctx).termo2.text; 
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public String text;
		public Token ID;
		public ExprContext eIdx;
		public Token NUMBER;
		public Token BOOL;
		public Token INTEGER;
		public Token CHAR;
		public ExprContext e;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode AC() { return getToken(EasyLanguageParser.AC, 0); }
		public TerminalNode FC() { return getToken(EasyLanguageParser.FC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(EasyLanguageParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(EasyLanguageParser.BOOL, 0); }
		public TerminalNode INTEGER() { return getToken(EasyLanguageParser.INTEGER, 0); }
		public TerminalNode CHAR() { return getToken(EasyLanguageParser.CHAR, 0); }
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_termo);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				((TermoContext)_localctx).ID = match(ID);
				setState(291);
				match(AC);
				setState(292);
				((TermoContext)_localctx).eIdx = expr();
				setState(293);
				match(FC);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).ID.getText() + "[" + ((TermoContext)_localctx).eIdx.text + "]"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				((TermoContext)_localctx).ID = match(ID);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).ID.getText(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				((TermoContext)_localctx).NUMBER = match(NUMBER);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).NUMBER.getText(); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				((TermoContext)_localctx).BOOL = match(BOOL);

				        String val = ((TermoContext)_localctx).BOOL.getText(); 
				        if(val.equals("verdadeiro")) val = "true";
				        else if(val.equals("falso")) val = "false";
				        ((TermoContext)_localctx).text =  val;
				      
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				((TermoContext)_localctx).INTEGER = match(INTEGER);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).INTEGER.getText(); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(304);
				((TermoContext)_localctx).CHAR = match(CHAR);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).CHAR.getText(); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(306);
				match(AP);
				setState(307);
				((TermoContext)_localctx).e = expr();
				setState(308);
				match(FP);
				 ((TermoContext)_localctx).text =  "(" + ((TermoContext)_localctx).e.text + ")"; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u013a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		",\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002<\b\u0002\n\u0002\f\u0002?\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003G\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004K\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005X\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005_\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005m\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005t\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005x\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0004\u0006~\b\u0006\u000b\u0006\f\u0006\u007f\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008c\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0093\b\b\n\b\f\b\u0096\t\b\u0001\b"+
		"\u0001\b\u0003\b\u009a\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00b9\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0004\r\u00c8\b\r\u000b\r\f\r\u00c9\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0004\r\u00d2\b\r\u000b\r\f\r\u00d3\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00d9\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00e6\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u00ed\b\u000e\u000b\u000e\f\u000e\u00ee"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00fb\b\u000f"+
		"\u000b\u000f\f\u000f\u00fc\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0108\b\u0010\n\u0010\f\u0010\u010b\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0116\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u011e\b\u0012\n\u0012\f\u0012"+
		"\u0121\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0138\b\u0013"+
		"\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0001\u0001\u0000"+
		"\u0013\u0014\u014d\u0000(\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000"+
		"\u0000\u00048\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\b"+
		"H\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000"+
		"\u0000\u000e\u008b\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000"+
		"\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u00a5\u0001\u0000\u0000"+
		"\u0000\u0016\u00b8\u0001\u0000\u0000\u0000\u0018\u00ba\u0001\u0000\u0000"+
		"\u0000\u001a\u00c0\u0001\u0000\u0000\u0000\u001c\u00da\u0001\u0000\u0000"+
		"\u0000\u001e\u00f3\u0001\u0000\u0000\u0000 \u0101\u0001\u0000\u0000\u0000"+
		"\"\u0115\u0001\u0000\u0000\u0000$\u0117\u0001\u0000\u0000\u0000&\u0137"+
		"\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000)-\u0006\u0000\uffff"+
		"\uffff\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000\u0000\u0000,/\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0003\f\u0006\u0000"+
		"12\u0005\u0002\u0000\u000023\u0006\u0000\uffff\uffff\u00003\u0001\u0001"+
		"\u0000\u0000\u000045\u0003\n\u0005\u000056\u0003\u0004\u0002\u000067\u0005"+
		"$\u0000\u00007\u0003\u0001\u0000\u0000\u00008=\u0003\b\u0004\u00009:\u0005"+
		"\"\u0000\u0000:<\u0003\b\u0004\u0000;9\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">\u0005\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u000e"+
		"\u0000\u0000AB\u0005\u001a\u0000\u0000BG\u0006\u0003\uffff\uffff\u0000"+
		"CD\u0005\u000e\u0000\u0000DE\u0005\u000f\u0000\u0000EG\u0006\u0003\uffff"+
		"\uffff\u0000F@\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000G\u0007"+
		"\u0001\u0000\u0000\u0000HJ\u0005!\u0000\u0000IK\u0003\u0006\u0003\u0000"+
		"JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KP\u0001\u0000\u0000"+
		"\u0000LM\u0005#\u0000\u0000MN\u0003$\u0012\u0000NO\u0006\u0004\uffff\uffff"+
		"\u0000OQ\u0001\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0006\u0004\uffff\uffff\u0000"+
		"S\t\u0001\u0000\u0000\u0000TU\u0005\u001c\u0000\u0000UW\u0005\u000e\u0000"+
		"\u0000VX\u0005\u001a\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0005\u000f\u0000\u0000Zx\u0006"+
		"\u0005\uffff\uffff\u0000[\\\u0005\u001e\u0000\u0000\\^\u0005\u000e\u0000"+
		"\u0000]_\u0005\u001a\u0000\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005\u000f\u0000\u0000ax\u0006"+
		"\u0005\uffff\uffff\u0000bc\u0005\u001d\u0000\u0000ce\u0005\u000e\u0000"+
		"\u0000df\u0005\u001a\u0000\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005\u000f\u0000\u0000hx\u0006"+
		"\u0005\uffff\uffff\u0000ij\u0005\u001f\u0000\u0000jl\u0005\u000e\u0000"+
		"\u0000km\u0005\u001a\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\u000f\u0000\u0000ox\u0006"+
		"\u0005\uffff\uffff\u0000pq\u0005 \u0000\u0000qs\u0005\u000e\u0000\u0000"+
		"rt\u0005\u001a\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u000f\u0000\u0000vx\u0006\u0005"+
		"\uffff\uffff\u0000wT\u0001\u0000\u0000\u0000w[\u0001\u0000\u0000\u0000"+
		"wb\u0001\u0000\u0000\u0000wi\u0001\u0000\u0000\u0000wp\u0001\u0000\u0000"+
		"\u0000x\u000b\u0001\u0000\u0000\u0000yz\u0005\u0011\u0000\u0000z}\u0006"+
		"\u0006\uffff\uffff\u0000{~\u0003\u000e\u0007\u0000|~\u0003\u0002\u0001"+
		"\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0012"+
		"\u0000\u0000\u0082\u0083\u0006\u0006\uffff\uffff\u0000\u0083\r\u0001\u0000"+
		"\u0000\u0000\u0084\u008c\u0003\u0012\t\u0000\u0085\u008c\u0003\u0014\n"+
		"\u0000\u0086\u008c\u0003\u0016\u000b\u0000\u0087\u008c\u0003\u001a\r\u0000"+
		"\u0088\u008c\u0003\u001e\u000f\u0000\u0089\u008c\u0003\u001c\u000e\u0000"+
		"\u008a\u008c\u0003\u0010\b\u0000\u008b\u0084\u0001\u0000\u0000\u0000\u008b"+
		"\u0085\u0001\u0000\u0000\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b"+
		"\u0087\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u000f\u0001\u0000\u0000\u0000\u008d\u008e\u0005!\u0000\u0000\u008e\u008f"+
		"\u0005\u0011\u0000\u0000\u008f\u0094\u0003$\u0012\u0000\u0090\u0091\u0005"+
		"\"\u0000\u0000\u0091\u0093\u0003$\u0012\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0099\u0005\u0012"+
		"\u0000\u0000\u0098\u009a\u0005$\u0000\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0006\b\uffff\uffff\u0000\u009c\u0011\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\u0003\u0000\u0000\u009e\u009f\u0005\f\u0000\u0000"+
		"\u009f\u00a0\u0005!\u0000\u0000\u00a0\u00a1\u0006\t\uffff\uffff\u0000"+
		"\u00a1\u00a2\u0005\r\u0000\u0000\u00a2\u00a3\u0005$\u0000\u0000\u00a3"+
		"\u00a4\u0006\t\uffff\uffff\u0000\u00a4\u0013\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0004\u0000\u0000\u00a6\u00a7\u0005\f\u0000\u0000\u00a7\u00a8"+
		"\u0003$\u0012\u0000\u00a8\u00a9\u0005\r\u0000\u0000\u00a9\u00aa\u0005"+
		"$\u0000\u0000\u00aa\u00ab\u0006\n\uffff\uffff\u0000\u00ab\u0015\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0003\u0018\f\u0000\u00ad\u00ae\u0005#"+
		"\u0000\u0000\u00ae\u00af\u0003$\u0012\u0000\u00af\u00b0\u0005$\u0000\u0000"+
		"\u00b0\u00b1\u0006\u000b\uffff\uffff\u0000\u00b1\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005!\u0000\u0000\u00b3\u00b4\u0005#\u0000\u0000\u00b4"+
		"\u00b5\u0003$\u0012\u0000\u00b5\u00b6\u0005$\u0000\u0000\u00b6\u00b7\u0006"+
		"\u000b\uffff\uffff\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b2\u0001\u0000\u0000\u0000\u00b9\u0017"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005!\u0000\u0000\u00bb\u00bc\u0005"+
		"\u000e\u0000\u0000\u00bc\u00bd\u0003$\u0012\u0000\u00bd\u00be\u0005\u000f"+
		"\u0000\u0000\u00be\u00bf\u0006\f\uffff\uffff\u0000\u00bf\u0019\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\u0005\u0000\u0000\u00c1\u00c2\u0005\f\u0000"+
		"\u0000\u00c2\u00c3\u0003 \u0010\u0000\u00c3\u00c4\u0005\r\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0011\u0000\u0000\u00c5\u00c7\u0006\r\uffff\uffff\u0000"+
		"\u00c6\u00c8\u0003\u000e\u0007\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0005\u0012\u0000\u0000\u00cc\u00d8\u0006\r\uffff\uffff\u0000"+
		"\u00cd\u00ce\u0005\u0006\u0000\u0000\u00ce\u00cf\u0005\u0011\u0000\u0000"+
		"\u00cf\u00d1\u0006\r\uffff\uffff\u0000\u00d0\u00d2\u0003\u000e\u0007\u0000"+
		"\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0012\u0000\u0000"+
		"\u00d6\u00d7\u0006\r\uffff\uffff\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d8\u00cd\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d9\u001b\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0007\u0000\u0000"+
		"\u00db\u00dc\u0005\f\u0000\u0000\u00dc\u00dd\u0005!\u0000\u0000\u00dd"+
		"\u00de\u0005\b\u0000\u0000\u00de\u00df\u0003$\u0012\u0000\u00df\u00e0"+
		"\u0005\u0016\u0000\u0000\u00e0\u00e5\u0003$\u0012\u0000\u00e1\u00e2\u0005"+
		"\t\u0000\u0000\u00e2\u00e3\u0003$\u0012\u0000\u00e3\u00e4\u0006\u000e"+
		"\uffff\uffff\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005\r\u0000\u0000\u00e8\u00e9\u0005\n"+
		"\u0000\u0000\u00e9\u00ea\u0005\u0011\u0000\u0000\u00ea\u00ec\u0006\u000e"+
		"\uffff\uffff\u0000\u00eb\u00ed\u0003\u000e\u0007\u0000\u00ec\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005\u0012\u0000\u0000\u00f1\u00f2\u0006"+
		"\u000e\uffff\uffff\u0000\u00f2\u001d\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0005\u000b\u0000\u0000\u00f4\u00f5\u0005\f\u0000\u0000\u00f5\u00f6\u0003"+
		" \u0010\u0000\u00f6\u00f7\u0005\r\u0000\u0000\u00f7\u00f8\u0005\u0011"+
		"\u0000\u0000\u00f8\u00fa\u0006\u000f\uffff\uffff\u0000\u00f9\u00fb\u0003"+
		"\u000e\u0007\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005"+
		"\u0012\u0000\u0000\u00ff\u0100\u0006\u000f\uffff\uffff\u0000\u0100\u001f"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0003\"\u0011\u0000\u0102\u0109\u0006"+
		"\u0010\uffff\uffff\u0000\u0103\u0104\u0007\u0000\u0000\u0000\u0104\u0105"+
		"\u0003\"\u0011\u0000\u0105\u0106\u0006\u0010\uffff\uffff\u0000\u0106\u0108"+
		"\u0001\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0108\u010b"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a!\u0001\u0000\u0000\u0000\u010b\u0109\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0003&\u0013\u0000\u010d\u010e\u0005\u0016"+
		"\u0000\u0000\u010e\u010f\u0003&\u0013\u0000\u010f\u0110\u0006\u0011\uffff"+
		"\uffff\u0000\u0110\u0116\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0015"+
		"\u0000\u0000\u0112\u0113\u0003\"\u0011\u0000\u0113\u0114\u0006\u0011\uffff"+
		"\uffff\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u010c\u0001\u0000"+
		"\u0000\u0000\u0115\u0111\u0001\u0000\u0000\u0000\u0116#\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0003&\u0013\u0000\u0118\u011f\u0006\u0012\uffff\uffff"+
		"\u0000\u0119\u011a\u0005\u0010\u0000\u0000\u011a\u011b\u0003&\u0013\u0000"+
		"\u011b\u011c\u0006\u0012\uffff\uffff\u0000\u011c\u011e\u0001\u0000\u0000"+
		"\u0000\u011d\u0119\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000"+
		"\u0000\u0120%\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0005!\u0000\u0000\u0123\u0124\u0005\u000e\u0000\u0000\u0124"+
		"\u0125\u0003$\u0012\u0000\u0125\u0126\u0005\u000f\u0000\u0000\u0126\u0127"+
		"\u0006\u0013\uffff\uffff\u0000\u0127\u0138\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0005!\u0000\u0000\u0129\u0138\u0006\u0013\uffff\uffff\u0000\u012a"+
		"\u012b\u0005\u0019\u0000\u0000\u012b\u0138\u0006\u0013\uffff\uffff\u0000"+
		"\u012c\u012d\u0005\u0017\u0000\u0000\u012d\u0138\u0006\u0013\uffff\uffff"+
		"\u0000\u012e\u012f\u0005\u001a\u0000\u0000\u012f\u0138\u0006\u0013\uffff"+
		"\uffff\u0000\u0130\u0131\u0005\u0018\u0000\u0000\u0131\u0138\u0006\u0013"+
		"\uffff\uffff\u0000\u0132\u0133\u0005\f\u0000\u0000\u0133\u0134\u0003$"+
		"\u0012\u0000\u0134\u0135\u0005\r\u0000\u0000\u0135\u0136\u0006\u0013\uffff"+
		"\uffff\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u0122\u0001\u0000"+
		"\u0000\u0000\u0137\u0128\u0001\u0000\u0000\u0000\u0137\u012a\u0001\u0000"+
		"\u0000\u0000\u0137\u012c\u0001\u0000\u0000\u0000\u0137\u012e\u0001\u0000"+
		"\u0000\u0000\u0137\u0130\u0001\u0000\u0000\u0000\u0137\u0132\u0001\u0000"+
		"\u0000\u0000\u0138\'\u0001\u0000\u0000\u0000\u001b-=FJPW^elsw}\u007f\u008b"+
		"\u0094\u0099\u00b8\u00c9\u00d3\u00d8\u00e5\u00ee\u00fc\u0109\u0115\u011f"+
		"\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}