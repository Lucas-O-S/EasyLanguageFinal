// Generated from EasyLanguage.g4 by ANTLR 4.12.0
package br.edu.cefsa.compiler.parser;

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, AP=15, FP=16, OP=17, 
		ACH=18, FCH=19, AND=20, OR=21, NOT=22, OPREL=23, BOOL=24, CHAR=25, NUMBER=26, 
		INTEGER=27, STRING=28, WS=29, DECIMAL=30, BOOLEANO=31, TEXTO=32, INTEIRO=33, 
		CARACTERE=34, VAZIO=35, ID=36, VIR=37, ATTR=38, SC=39, AC=40, FC=41;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_idList = 2, RULE_declareItem = 3, RULE_tipo = 4, 
		RULE_bloco = 5, RULE_cmd = 6, RULE_cmdleitura = 7, RULE_cmdescrita = 8, 
		RULE_cmdattrib = 9, RULE_cmdattribarrayitem = 10, RULE_cmdselecao = 11, 
		RULE_cmdfor = 12, RULE_cmdwhile = 13, RULE_cmdarray = 14, RULE_cmdfuncao = 15, 
		RULE_listaParametros = 16, RULE_parametro = 17, RULE_retorno = 18, RULE_cmdChamadaFuncao = 19, 
		RULE_listaArgumentos = 20, RULE_funcCall = 21, RULE_comp = 22, RULE_condicao = 23, 
		RULE_expr = 24, RULE_termo = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "idList", "declareItem", "tipo", "bloco", "cmd", "cmdleitura", 
			"cmdescrita", "cmdattrib", "cmdattribarrayitem", "cmdselecao", "cmdfor", 
			"cmdwhile", "cmdarray", "cmdfuncao", "listaParametros", "parametro", 
			"retorno", "cmdChamadaFuncao", "listaArgumentos", "funcCall", "comp", 
			"condicao", "expr", "termo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'leia'", "'escreva'", "'se'", "'senao'", 
			"'para'", "'de'", "'passo'", "'faca'", "'enquanto'", "'vetor'", "'funcao'", 
			"'retorne'", "'('", "')'", null, "'{'", "'}'", "'e'", "'ou'", "'nao'", 
			null, null, null, null, null, null, null, "'decimal'", "'booleano'", 
			"'texto'", "'inteiro'", "'caractere'", "'vazio'", null, "','", "'='", 
			"';'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "AP", "FP", "OP", "ACH", "FCH", "AND", "OR", "NOT", 
			"OPREL", "BOOL", "CHAR", "NUMBER", "INTEGER", "STRING", "WS", "DECIMAL", 
			"BOOLEANO", "TEXTO", "INTEIRO", "CARACTERE", "VAZIO", "ID", "VIR", "ATTR", 
			"SC", "AC", "FC"
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

	public EasyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public List<CmdfuncaoContext> cmdfuncao() {
			return getRuleContexts(CmdfuncaoContext.class);
		}
		public CmdfuncaoContext cmdfuncao(int i) {
			return getRuleContext(CmdfuncaoContext.class,i);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(52);
				cmdfuncao();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(T__0);

			        curThread = new ArrayList<>();
			        stack.push(curThread);
			      
			setState(60);
			bloco();
			setState(61);
			match(T__1);

			        program.setVarTable(symbolTable);
			        program.setComandos(stack.pop());
			        program.setFunctions(_functions);
			      
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
			setState(64);
			tipo();
			setState(65);
			idList();
			setState(66);
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
			setState(68);
			declareItem();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(69);
				match(VIR);
				setState(70);
				declareItem();
				}
				}
				setState(75);
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
	public static class DeclareItemContext extends ParserRuleContext {
		public String exprText;
		public Token ID;
		public ExprContext e;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(EasyLanguageParser.ATTR, 0); }
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
		enterRule(_localctx, 6, RULE_declareItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((DeclareItemContext)_localctx).ID = match(ID);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTR) {
				{
				setState(77);
				match(ATTR);
				setState(78);
				((DeclareItemContext)_localctx).e = expr();
				 ((DeclareItemContext)_localctx).exprText =  ((DeclareItemContext)_localctx).e.text; 
				}
			}


			        String varName = ((DeclareItemContext)_localctx).ID.getText();
			        String value = _localctx.exprText;

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
		public TerminalNode DECIMAL() { return getToken(EasyLanguageParser.DECIMAL, 0); }
		public TerminalNode TEXTO() { return getToken(EasyLanguageParser.TEXTO, 0); }
		public TerminalNode BOOLEANO() { return getToken(EasyLanguageParser.BOOLEANO, 0); }
		public TerminalNode INTEIRO() { return getToken(EasyLanguageParser.INTEIRO, 0); }
		public TerminalNode CARACTERE() { return getToken(EasyLanguageParser.CARACTERE, 0); }
		public TerminalNode VAZIO() { return getToken(EasyLanguageParser.VAZIO, 0); }
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
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(DECIMAL);
				 _tipo = Variable.Type.NUMBER; 
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(TEXTO);
				 _tipo = Variable.Type.TEXT; 
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(BOOLEANO);
				 _tipo = Variable.Type.BOOLEAN; 
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(INTEIRO);
				 _tipo = Variable.Type.INTEGER; 
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(CARACTERE);
				 _tipo = Variable.Type.CHAR; 
				}
				break;
			case VAZIO:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				match(VAZIO);
				 _tipo = Variable.Type.VOID; 
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
		enterRule(_localctx, 10, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ACH);

			        curThread = new ArrayList<>();
			        stack.push(curThread);
			      
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__3:
				case T__4:
				case T__6:
				case T__10:
				case T__11:
				case ID:
					{
					setState(101);
					cmd();
					}
					break;
				case DECIMAL:
				case BOOLEANO:
				case TEXTO:
				case INTEIRO:
				case CARACTERE:
				case VAZIO:
					{
					setState(102);
					decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 136365217976L) != 0) );
			setState(107);
			match(FCH);
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
		public CmdattribarrayitemContext cmdattribarrayitem() {
			return getRuleContext(CmdattribarrayitemContext.class,0);
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
		public CmdarrayContext cmdarray() {
			return getRuleContext(CmdarrayContext.class,0);
		}
		public CmdChamadaFuncaoContext cmdChamadaFuncao() {
			return getRuleContext(CmdChamadaFuncaoContext.class,0);
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
		enterRule(_localctx, 12, RULE_cmd);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				cmdleitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				cmdescrita();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				cmdattribarrayitem();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				cmdattrib();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				cmdselecao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				cmdwhile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				cmdfor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(116);
				cmdarray();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(117);
				cmdChamadaFuncao();
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
	public static class CmdleituraContext extends ParserRuleContext {
		public Token id;
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
		enterRule(_localctx, 14, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__2);
			setState(121);
			match(AP);
			setState(122);
			((CmdleituraContext)_localctx).id = match(ID);
			 verificaID(((CmdleituraContext)_localctx).id.getText()); _readID = ((CmdleituraContext)_localctx).id.getText(); 
			setState(124);
			match(FP);
			setState(125);
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
		enterRule(_localctx, 16, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__3);
			setState(129);
			match(AP);
			setState(130);
			((CmdescritaContext)_localctx).e = expr();
			setState(131);
			match(FP);
			setState(132);
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
		public Token id;
		public ExprContext e;
		public TerminalNode ATTR() { return getToken(EasyLanguageParser.ATTR, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((CmdattribContext)_localctx).id = match(ID);
			 verificaID(((CmdattribContext)_localctx).id.getText()); _exprID = ((CmdattribContext)_localctx).id.getText(); 
			setState(137);
			match(ATTR);
			setState(138);
			((CmdattribContext)_localctx).e = expr();
			setState(139);
			match(SC);

			        _exprContent = ((CmdattribContext)_localctx).e.text;
			        CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
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
	public static class CmdattribarrayitemContext extends ParserRuleContext {
		public Token id;
		public ExprContext idx;
		public ExprContext e;
		public TerminalNode AC() { return getToken(EasyLanguageParser.AC, 0); }
		public TerminalNode FC() { return getToken(EasyLanguageParser.FC, 0); }
		public TerminalNode ATTR() { return getToken(EasyLanguageParser.ATTR, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CmdattribarrayitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattribarrayitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdattribarrayitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdattribarrayitem(this);
		}
	}

	public final CmdattribarrayitemContext cmdattribarrayitem() throws RecognitionException {
		CmdattribarrayitemContext _localctx = new CmdattribarrayitemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdattribarrayitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((CmdattribarrayitemContext)_localctx).id = match(ID);
			setState(143);
			match(AC);
			setState(144);
			((CmdattribarrayitemContext)_localctx).idx = expr();
			setState(145);
			match(FC);
			setState(146);
			match(ATTR);
			setState(147);
			((CmdattribarrayitemContext)_localctx).e = expr();
			setState(148);
			match(SC);

			        verificaID(((CmdattribarrayitemContext)_localctx).id.getText());
			        _exprID = ((CmdattribarrayitemContext)_localctx).id.getText();
			        _position = ((CmdattribarrayitemContext)_localctx).idx.text;
			        _exprContent = ((CmdattribarrayitemContext)_localctx).e.text;
			        CommandAtribuicaoArrayItem cmd = new CommandAtribuicaoArrayItem(_exprID, _exprContent, _position);
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
		enterRule(_localctx, 22, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__4);
			setState(152);
			match(AP);
			setState(153);
			((CmdselecaoContext)_localctx).c = comp();
			setState(154);
			match(FP);
			setState(155);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			            _exprDecision = ((CmdselecaoContext)_localctx).c.text;
			        
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				cmd();
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68719483064L) != 0) );
			setState(162);
			match(FCH);

			        listaTrue = stack.pop();
			      
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(164);
				match(T__5);
				setState(165);
				match(ACH);

				            curThread = new ArrayList<>();
				            stack.push(curThread);
				        
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					cmd();
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68719483064L) != 0) );
				setState(172);
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
		enterRule(_localctx, 24, RULE_cmdfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__6);
			setState(178);
			match(AP);
			setState(179);
			((CmdforContext)_localctx).ID = match(ID);
			setState(180);
			match(T__7);
			setState(181);
			((CmdforContext)_localctx).e1 = expr();
			setState(182);
			((CmdforContext)_localctx).op = match(OPREL);
			setState(183);
			((CmdforContext)_localctx).e2 = expr();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(184);
				match(T__8);
				setState(185);
				((CmdforContext)_localctx).e3 = expr();
				 ((CmdforContext)_localctx).stepExpr =  ((CmdforContext)_localctx).e3.text; 
				}
			}

			setState(190);
			match(FP);
			setState(191);
			match(T__9);
			setState(192);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			        
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				cmd();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68719483064L) != 0) );
			setState(199);
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
		enterRule(_localctx, 26, RULE_cmdwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__10);
			setState(203);
			match(AP);
			setState(204);
			((CmdwhileContext)_localctx).c = comp();
			setState(205);
			match(FP);
			setState(206);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			            _exprDecision = ((CmdwhileContext)_localctx).c.text;
			        
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68719483064L) != 0) );
			setState(213);
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
	public static class CmdarrayContext extends ParserRuleContext {
		public TipoContext tipoVar;
		public Token ID;
		public Token size;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode AC() { return getToken(EasyLanguageParser.AC, 0); }
		public TerminalNode FC() { return getToken(EasyLanguageParser.FC, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(EasyLanguageParser.INTEGER, 0); }
		public CmdarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdarray(this);
		}
	}

	public final CmdarrayContext cmdarray() throws RecognitionException {
		CmdarrayContext _localctx = new CmdarrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__11);
			setState(217);
			((CmdarrayContext)_localctx).tipoVar = tipo();
			setState(218);
			((CmdarrayContext)_localctx).ID = match(ID);
			setState(219);
			match(AC);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(220);
				((CmdarrayContext)_localctx).size = match(INTEGER);
				}
			}

			setState(223);
			match(FC);
			setState(224);
			match(SC);

			        String varName = ((CmdarrayContext)_localctx).ID.getText();                 
			        int arraySize = (((CmdarrayContext)_localctx).size != null) ? Integer.parseInt(((CmdarrayContext)_localctx).size.getText()) : 0;

			  
			        Variable.Type arrayType = _tipo;

			        Variable var = new Variable(varName, arrayType, arraySize);
			        if (!symbolTable.exists(varName)) {
			            symbolTable.add(var);
			        } else {
			            throw new SemanticException("Array " + varName + " already declared");
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
	public static class CmdfuncaoContext extends ParserRuleContext {
		public TipoContext t;
		public Token id;
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode ACH() { return getToken(EasyLanguageParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(EasyLanguageParser.FCH, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public CmdfuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdfuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdfuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdfuncao(this);
		}
	}

	public final CmdfuncaoContext cmdfuncao() throws RecognitionException {
		CmdfuncaoContext _localctx = new CmdfuncaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdfuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__12);
			setState(228);
			((CmdfuncaoContext)_localctx).t = tipo();
			setState(229);
			((CmdfuncaoContext)_localctx).id = match(ID);
			setState(230);
			match(AP);

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
			        
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) {
				{
				setState(232);
				listaParametros();
				}
			}

			setState(235);
			match(FP);
			setState(236);
			match(ACH);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136365217976L) != 0)) {
				{
				setState(239);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DECIMAL:
				case BOOLEANO:
				case TEXTO:
				case INTEIRO:
				case CARACTERE:
				case VAZIO:
					{
					setState(237);
					decl();
					}
					break;
				case T__2:
				case T__3:
				case T__4:
				case T__6:
				case T__10:
				case T__11:
				case ID:
					{
					setState(238);
					cmd();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(244);
				retorno();
				}
			}

			setState(247);
			match(FCH);

			            // Recupera comandos da função
			            ArrayList<AbstractCommand> listaFunc = stack.pop();

			            // Cria lista de parâmetros
			            ArrayList<Variable> paramList = _parameters;

			            // Cria função com parâmetros, tabela local e comandos
			            Function func = new Function(((CmdfuncaoContext)_localctx).id.getText(), _funcTipo, paramList, symbolTable, listaFunc);

			            // Adiciona função à lista de funções
			            _functions.add(new CommandFunction(func));

			            // Restaura contexto global
			            symbolTable = prevTable;
			            prevTable = null;
			            _parameters = null;
			            _insideFunction = false;
			        
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
	public static class ListaParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIR() { return getTokens(EasyLanguageParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(EasyLanguageParser.VIR, i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitListaParametros(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			parametro();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(251);
				match(VIR);
				setState(252);
				parametro();
				}
				}
				setState(257);
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
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext t;
		public Token id;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			((ParametroContext)_localctx).t = tipo();
			setState(259);
			((ParametroContext)_localctx).id = match(ID);

			          // Cria variável de parâmetro usando o tipo atualizado por 'tipo'
			          Variable v = new Variable(((ParametroContext)_localctx).id.getText(), _tipo, null);
			          _parameters.add(v);
			      
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
	public static class RetornoContext extends ParserRuleContext {
		public ExprContext e;
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__13);
			setState(263);
			((RetornoContext)_localctx).e = expr();
			setState(264);
			match(SC);

			        CommandReturn cmd = new CommandReturn(((RetornoContext)_localctx).e.text);
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
	public static class CmdChamadaFuncaoContext extends ParserRuleContext {
		public Token id;
		public ListaArgumentosContext args;
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public CmdChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdChamadaFuncao(this);
		}
	}

	public final CmdChamadaFuncaoContext cmdChamadaFuncao() throws RecognitionException {
		CmdChamadaFuncaoContext _localctx = new CmdChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdChamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((CmdChamadaFuncaoContext)_localctx).id = match(ID);
			setState(268);
			match(AP);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69239603200L) != 0)) {
				{
				setState(269);
				((CmdChamadaFuncaoContext)_localctx).args = listaArgumentos();
				 _callArgsTemp = ((CmdChamadaFuncaoContext)_localctx).args.argsList; 
				}
			}

			setState(274);
			match(FP);
			setState(275);
			match(SC);

			          // Garante que _callArgsTemp nunca seja nula
			          java.util.ArrayList<String> callArgs = (_callArgsTemp != null)
			              ? _callArgsTemp
			              : new java.util.ArrayList<String>();

			          // Verifica se a função existe: busca em _functions
			          boolean funcFound = false;
			          for (CommandFunction cf : _functions) {
			              try {
			                  Function f = cf.getFunction();
			                  if (f.getName().equals(((CmdChamadaFuncaoContext)_localctx).id.getText())) {
			                      funcFound = true;
			                      break;
			                  }
			              } catch (Exception ex) {
			                  // ignora e continua
			              }
			          }
			          if (!funcFound && !symbolTable.exists(((CmdChamadaFuncaoContext)_localctx).id.getText())) {
			              throw new SemanticException("Function " + ((CmdChamadaFuncaoContext)_localctx).id.getText() + " not declared");
			          }

			          // Cria o comando de chamada
			          CommandCallFunction cmd = new CommandCallFunction(((CmdChamadaFuncaoContext)_localctx).id.getText(), callArgs);
			          stack.peek().add(cmd);

			          // Limpa variável temporária
			          _callArgsTemp = new java.util.ArrayList<>();
			      
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
	public static class ListaArgumentosContext extends ParserRuleContext {
		public java.util.ArrayList<String> argsList;
		public ExprContext e;
		public ExprContext e2;
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
		public ListaArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterListaArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitListaArgumentos(this);
		}
	}

	public final ListaArgumentosContext listaArgumentos() throws RecognitionException {
		ListaArgumentosContext _localctx = new ListaArgumentosContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listaArgumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((ListaArgumentosContext)_localctx).e = expr();

			          ((ListaArgumentosContext)_localctx).argsList =  new java.util.ArrayList<String>();
			          _localctx.argsList.add(((ListaArgumentosContext)_localctx).e.text);
			      
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(280);
				match(VIR);
				setState(281);
				((ListaArgumentosContext)_localctx).e2 = expr();
				 _localctx.argsList.add(((ListaArgumentosContext)_localctx).e2.text); 
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			          // guarda em variável membro para uso por regras externas
			          _callArgsTemp = _localctx.argsList;
			      
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
	public static class FuncCallContext extends ParserRuleContext {
		public String text;
		public Token id;
		public ListaArgumentosContext args;
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((FuncCallContext)_localctx).id = match(ID);
			setState(292);
			match(AP);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69239603200L) != 0)) {
				{
				setState(293);
				((FuncCallContext)_localctx).args = listaArgumentos();
				 _callArgsTemp = ((FuncCallContext)_localctx).args.argsList; 
				}
			}

			setState(298);
			match(FP);

			          String name = ((FuncCallContext)_localctx).id.getText();
			          java.util.ArrayList<String> argsList = (_callArgsTemp != null)
			              ? _callArgsTemp
			              : new java.util.ArrayList<String>();

			          StringBuilder sb = new StringBuilder();
			          for (int i = 0; i < argsList.size(); i++) {
			              if (i > 0) sb.append(", ");
			              sb.append(argsList.get(i));
			          }

			          ((FuncCallContext)_localctx).text =  name + "(" + sb.toString() + ")";
			          _callArgsTemp = new java.util.ArrayList<>(); // limpa
			      
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
		enterRule(_localctx, 44, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((CompContext)_localctx).c1 = condicao();
			((CompContext)_localctx).text =  ((CompContext)_localctx).c1.text;
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(303);
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
				setState(304);
				((CompContext)_localctx).c2 = condicao();

				            String opJava = ((CompContext)_localctx).op.getText().equals("ou") ? "||" : "&&";
				            _localctx.text += " " + opJava + " " + ((CompContext)_localctx).c2.text;
				        
				}
				}
				setState(311);
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
		enterRule(_localctx, 46, RULE_condicao);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
			case BOOL:
			case CHAR:
			case NUMBER:
			case INTEGER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				((CondicaoContext)_localctx).t1 = termo();
				setState(313);
				((CondicaoContext)_localctx).op = match(OPREL);
				setState(314);
				((CondicaoContext)_localctx).t2 = termo();
				 ((CondicaoContext)_localctx).text =  ((CondicaoContext)_localctx).t1.text + ((CondicaoContext)_localctx).op.getText() + ((CondicaoContext)_localctx).t2.text; 
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(NOT);
				setState(318);
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
		enterRule(_localctx, 48, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			((ExprContext)_localctx).termo1 = termo();
			 ((ExprContext)_localctx).text =  ((ExprContext)_localctx).termo1.text; 
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(325);
				((ExprContext)_localctx).OP = match(OP);
				setState(326);
				((ExprContext)_localctx).termo2 = termo();
				 _localctx.text += " " + ((ExprContext)_localctx).OP.getText() + " " + ((ExprContext)_localctx).termo2.text; 
				}
				}
				setState(333);
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
		public Token NUMBER;
		public Token BOOL;
		public Token INTEGER;
		public Token STRING;
		public Token CHAR;
		public FuncCallContext f;
		public ExprContext e;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(EasyLanguageParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(EasyLanguageParser.BOOL, 0); }
		public TerminalNode INTEGER() { return getToken(EasyLanguageParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(EasyLanguageParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(EasyLanguageParser.CHAR, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_termo);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				((TermoContext)_localctx).ID = match(ID);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).ID.getText(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				((TermoContext)_localctx).NUMBER = match(NUMBER);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).NUMBER.getText(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				((TermoContext)_localctx).BOOL = match(BOOL);

				        String val = ((TermoContext)_localctx).BOOL.getText();
				        if(val.equals("verdadeiro")) val = "true";
				        else if(val.equals("falso")) val = "false";
				        ((TermoContext)_localctx).text =  val;
				      
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				((TermoContext)_localctx).INTEGER = match(INTEGER);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).INTEGER.getText(); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				((TermoContext)_localctx).STRING = match(STRING);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).STRING.getText(); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				((TermoContext)_localctx).CHAR = match(CHAR);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).CHAR.getText(); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				((TermoContext)_localctx).f = funcCall();
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).f.text; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(349);
				match(AP);
				setState(350);
				((TermoContext)_localctx).e = expr();
				setState(351);
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
		"\u0004\u0001)\u0165\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"R\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005h\b\u0005\u000b\u0005"+
		"\f\u0005i\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006w\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u009f\b\u000b\u000b\u000b\f"+
		"\u000b\u00a0\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u00a9\b\u000b\u000b\u000b\f\u000b\u00aa\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b0\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00bd\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00c4"+
		"\b\f\u000b\f\f\f\u00c5\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00d2\b\r\u000b\r\f\r\u00d3\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00de\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00ea\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00f0\b\u000f\n\u000f\f\u000f\u00f3\t\u000f\u0001\u000f"+
		"\u0003\u000f\u00f6\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00fe\b\u0010\n\u0010\f\u0010\u0101"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0111\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u011d\b\u0014\n\u0014\f\u0014"+
		"\u0120\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0129\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u0134\b\u0016\n\u0016\f\u0016\u0137\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0142\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u014a"+
		"\b\u0018\n\u0018\f\u0018\u014d\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0163\b\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"\u0000\u0001\u0001\u0000\u0014\u0015\u0175\u00007\u0001\u0000\u0000\u0000"+
		"\u0002@\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006L"+
		"\u0001\u0000\u0000\u0000\ba\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000"+
		"\u0000\fv\u0001\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010"+
		"\u0080\u0001\u0000\u0000\u0000\u0012\u0087\u0001\u0000\u0000\u0000\u0014"+
		"\u008e\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018"+
		"\u00b1\u0001\u0000\u0000\u0000\u001a\u00ca\u0001\u0000\u0000\u0000\u001c"+
		"\u00d8\u0001\u0000\u0000\u0000\u001e\u00e3\u0001\u0000\u0000\u0000 \u00fa"+
		"\u0001\u0000\u0000\u0000\"\u0102\u0001\u0000\u0000\u0000$\u0106\u0001"+
		"\u0000\u0000\u0000&\u010b\u0001\u0000\u0000\u0000(\u0116\u0001\u0000\u0000"+
		"\u0000*\u0123\u0001\u0000\u0000\u0000,\u012d\u0001\u0000\u0000\u0000."+
		"\u0141\u0001\u0000\u0000\u00000\u0143\u0001\u0000\u0000\u00002\u0162\u0001"+
		"\u0000\u0000\u000046\u0003\u001e\u000f\u000054\u0001\u0000\u0000\u0000"+
		"69\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\u0001"+
		"\u0000\u0000;<\u0006\u0000\uffff\uffff\u0000<=\u0003\n\u0005\u0000=>\u0005"+
		"\u0002\u0000\u0000>?\u0006\u0000\uffff\uffff\u0000?\u0001\u0001\u0000"+
		"\u0000\u0000@A\u0003\b\u0004\u0000AB\u0003\u0004\u0002\u0000BC\u0005\'"+
		"\u0000\u0000C\u0003\u0001\u0000\u0000\u0000DI\u0003\u0006\u0003\u0000"+
		"EF\u0005%\u0000\u0000FH\u0003\u0006\u0003\u0000GE\u0001\u0000\u0000\u0000"+
		"HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000J\u0005\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LQ\u0005"+
		"$\u0000\u0000MN\u0005&\u0000\u0000NO\u00030\u0018\u0000OP\u0006\u0003"+
		"\uffff\uffff\u0000PR\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0006\u0003\uffff"+
		"\uffff\u0000T\u0007\u0001\u0000\u0000\u0000UV\u0005\u001e\u0000\u0000"+
		"Vb\u0006\u0004\uffff\uffff\u0000WX\u0005 \u0000\u0000Xb\u0006\u0004\uffff"+
		"\uffff\u0000YZ\u0005\u001f\u0000\u0000Zb\u0006\u0004\uffff\uffff\u0000"+
		"[\\\u0005!\u0000\u0000\\b\u0006\u0004\uffff\uffff\u0000]^\u0005\"\u0000"+
		"\u0000^b\u0006\u0004\uffff\uffff\u0000_`\u0005#\u0000\u0000`b\u0006\u0004"+
		"\uffff\uffff\u0000aU\u0001\u0000\u0000\u0000aW\u0001\u0000\u0000\u0000"+
		"aY\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000b\t\u0001\u0000\u0000\u0000cd\u0005\u0012"+
		"\u0000\u0000dg\u0006\u0005\uffff\uffff\u0000eh\u0003\f\u0006\u0000fh\u0003"+
		"\u0002\u0001\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000kl\u0005\u0013\u0000\u0000l\u000b\u0001"+
		"\u0000\u0000\u0000mw\u0003\u000e\u0007\u0000nw\u0003\u0010\b\u0000ow\u0003"+
		"\u0014\n\u0000pw\u0003\u0012\t\u0000qw\u0003\u0016\u000b\u0000rw\u0003"+
		"\u001a\r\u0000sw\u0003\u0018\f\u0000tw\u0003\u001c\u000e\u0000uw\u0003"+
		"&\u0013\u0000vm\u0001\u0000\u0000\u0000vn\u0001\u0000\u0000\u0000vo\u0001"+
		"\u0000\u0000\u0000vp\u0001\u0000\u0000\u0000vq\u0001\u0000\u0000\u0000"+
		"vr\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000w\r\u0001\u0000\u0000\u0000xy\u0005\u0003"+
		"\u0000\u0000yz\u0005\u000f\u0000\u0000z{\u0005$\u0000\u0000{|\u0006\u0007"+
		"\uffff\uffff\u0000|}\u0005\u0010\u0000\u0000}~\u0005\'\u0000\u0000~\u007f"+
		"\u0006\u0007\uffff\uffff\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005\u0004\u0000\u0000\u0081\u0082\u0005\u000f\u0000\u0000\u0082"+
		"\u0083\u00030\u0018\u0000\u0083\u0084\u0005\u0010\u0000\u0000\u0084\u0085"+
		"\u0005\'\u0000\u0000\u0085\u0086\u0006\b\uffff\uffff\u0000\u0086\u0011"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005$\u0000\u0000\u0088\u0089\u0006"+
		"\t\uffff\uffff\u0000\u0089\u008a\u0005&\u0000\u0000\u008a\u008b\u0003"+
		"0\u0018\u0000\u008b\u008c\u0005\'\u0000\u0000\u008c\u008d\u0006\t\uffff"+
		"\uffff\u0000\u008d\u0013\u0001\u0000\u0000\u0000\u008e\u008f\u0005$\u0000"+
		"\u0000\u008f\u0090\u0005(\u0000\u0000\u0090\u0091\u00030\u0018\u0000\u0091"+
		"\u0092\u0005)\u0000\u0000\u0092\u0093\u0005&\u0000\u0000\u0093\u0094\u0003"+
		"0\u0018\u0000\u0094\u0095\u0005\'\u0000\u0000\u0095\u0096\u0006\n\uffff"+
		"\uffff\u0000\u0096\u0015\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0005"+
		"\u0000\u0000\u0098\u0099\u0005\u000f\u0000\u0000\u0099\u009a\u0003,\u0016"+
		"\u0000\u009a\u009b\u0005\u0010\u0000\u0000\u009b\u009c\u0005\u0012\u0000"+
		"\u0000\u009c\u009e\u0006\u000b\uffff\uffff\u0000\u009d\u009f\u0003\f\u0006"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0013\u0000"+
		"\u0000\u00a3\u00af\u0006\u000b\uffff\uffff\u0000\u00a4\u00a5\u0005\u0006"+
		"\u0000\u0000\u00a5\u00a6\u0005\u0012\u0000\u0000\u00a6\u00a8\u0006\u000b"+
		"\uffff\uffff\u0000\u00a7\u00a9\u0003\f\u0006\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\u0013\u0000\u0000\u00ad\u00ae\u0006\u000b"+
		"\uffff\uffff\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00a4\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u0017\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005\u0007\u0000\u0000\u00b2\u00b3\u0005"+
		"\u000f\u0000\u0000\u00b3\u00b4\u0005$\u0000\u0000\u00b4\u00b5\u0005\b"+
		"\u0000\u0000\u00b5\u00b6\u00030\u0018\u0000\u00b6\u00b7\u0005\u0017\u0000"+
		"\u0000\u00b7\u00bc\u00030\u0018\u0000\u00b8\u00b9\u0005\t\u0000\u0000"+
		"\u00b9\u00ba\u00030\u0018\u0000\u00ba\u00bb\u0006\f\uffff\uffff\u0000"+
		"\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0005\u0010\u0000\u0000\u00bf\u00c0\u0005\n\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0012\u0000\u0000\u00c1\u00c3\u0006\f\uffff\uffff\u0000\u00c2"+
		"\u00c4\u0003\f\u0006\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005\u0013\u0000\u0000\u00c8\u00c9\u0006\f\uffff\uffff\u0000\u00c9\u0019"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u000b\u0000\u0000\u00cb\u00cc"+
		"\u0005\u000f\u0000\u0000\u00cc\u00cd\u0003,\u0016\u0000\u00cd\u00ce\u0005"+
		"\u0010\u0000\u0000\u00ce\u00cf\u0005\u0012\u0000\u0000\u00cf\u00d1\u0006"+
		"\r\uffff\uffff\u0000\u00d0\u00d2\u0003\f\u0006\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005\u0013\u0000\u0000\u00d6\u00d7\u0006"+
		"\r\uffff\uffff\u0000\u00d7\u001b\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005"+
		"\f\u0000\u0000\u00d9\u00da\u0003\b\u0004\u0000\u00da\u00db\u0005$\u0000"+
		"\u0000\u00db\u00dd\u0005(\u0000\u0000\u00dc\u00de\u0005\u001b\u0000\u0000"+
		"\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005)\u0000\u0000\u00e0"+
		"\u00e1\u0005\'\u0000\u0000\u00e1\u00e2\u0006\u000e\uffff\uffff\u0000\u00e2"+
		"\u001d\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\r\u0000\u0000\u00e4\u00e5"+
		"\u0003\b\u0004\u0000\u00e5\u00e6\u0005$\u0000\u0000\u00e6\u00e7\u0005"+
		"\u000f\u0000\u0000\u00e7\u00e9\u0006\u000f\uffff\uffff\u0000\u00e8\u00ea"+
		"\u0003 \u0010\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005"+
		"\u0010\u0000\u0000\u00ec\u00f1\u0005\u0012\u0000\u0000\u00ed\u00f0\u0003"+
		"\u0002\u0001\u0000\u00ee\u00f0\u0003\f\u0006\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f6\u0003$\u0012\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005\u0013\u0000\u0000\u00f8\u00f9\u0006\u000f\uffff"+
		"\uffff\u0000\u00f9\u001f\u0001\u0000\u0000\u0000\u00fa\u00ff\u0003\"\u0011"+
		"\u0000\u00fb\u00fc\u0005%\u0000\u0000\u00fc\u00fe\u0003\"\u0011\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100!\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0003\b\u0004\u0000\u0103\u0104\u0005$\u0000\u0000\u0104\u0105"+
		"\u0006\u0011\uffff\uffff\u0000\u0105#\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0005\u000e\u0000\u0000\u0107\u0108\u00030\u0018\u0000\u0108\u0109\u0005"+
		"\'\u0000\u0000\u0109\u010a\u0006\u0012\uffff\uffff\u0000\u010a%\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005$\u0000\u0000\u010c\u0110\u0005\u000f"+
		"\u0000\u0000\u010d\u010e\u0003(\u0014\u0000\u010e\u010f\u0006\u0013\uffff"+
		"\uffff\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010d\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0005\u0010\u0000\u0000\u0113\u0114\u0005\'\u0000"+
		"\u0000\u0114\u0115\u0006\u0013\uffff\uffff\u0000\u0115\'\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u00030\u0018\u0000\u0117\u011e\u0006\u0014\uffff\uffff"+
		"\u0000\u0118\u0119\u0005%\u0000\u0000\u0119\u011a\u00030\u0018\u0000\u011a"+
		"\u011b\u0006\u0014\uffff\uffff\u0000\u011b\u011d\u0001\u0000\u0000\u0000"+
		"\u011c\u0118\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000"+
		"\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000"+
		"\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0006\u0014\uffff\uffff\u0000\u0122)\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0005$\u0000\u0000\u0124\u0128\u0005\u000f\u0000\u0000\u0125"+
		"\u0126\u0003(\u0014\u0000\u0126\u0127\u0006\u0015\uffff\uffff\u0000\u0127"+
		"\u0129\u0001\u0000\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0005\u0010\u0000\u0000\u012b\u012c\u0006\u0015\uffff\uffff\u0000"+
		"\u012c+\u0001\u0000\u0000\u0000\u012d\u012e\u0003.\u0017\u0000\u012e\u0135"+
		"\u0006\u0016\uffff\uffff\u0000\u012f\u0130\u0007\u0000\u0000\u0000\u0130"+
		"\u0131\u0003.\u0017\u0000\u0131\u0132\u0006\u0016\uffff\uffff\u0000\u0132"+
		"\u0134\u0001\u0000\u0000\u0000\u0133\u012f\u0001\u0000\u0000\u0000\u0134"+
		"\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0001\u0000\u0000\u0000\u0136-\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u00032\u0019\u0000\u0139\u013a\u0005"+
		"\u0017\u0000\u0000\u013a\u013b\u00032\u0019\u0000\u013b\u013c\u0006\u0017"+
		"\uffff\uffff\u0000\u013c\u0142\u0001\u0000\u0000\u0000\u013d\u013e\u0005"+
		"\u0016\u0000\u0000\u013e\u013f\u0003.\u0017\u0000\u013f\u0140\u0006\u0017"+
		"\uffff\uffff\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u0138\u0001"+
		"\u0000\u0000\u0000\u0141\u013d\u0001\u0000\u0000\u0000\u0142/\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u00032\u0019\u0000\u0144\u014b\u0006\u0018\uffff"+
		"\uffff\u0000\u0145\u0146\u0005\u0011\u0000\u0000\u0146\u0147\u00032\u0019"+
		"\u0000\u0147\u0148\u0006\u0018\uffff\uffff\u0000\u0148\u014a\u0001\u0000"+
		"\u0000\u0000\u0149\u0145\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c1\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0005$\u0000\u0000\u014f\u0163\u0006\u0019\uffff\uffff"+
		"\u0000\u0150\u0151\u0005\u001a\u0000\u0000\u0151\u0163\u0006\u0019\uffff"+
		"\uffff\u0000\u0152\u0153\u0005\u0018\u0000\u0000\u0153\u0163\u0006\u0019"+
		"\uffff\uffff\u0000\u0154\u0155\u0005\u001b\u0000\u0000\u0155\u0163\u0006"+
		"\u0019\uffff\uffff\u0000\u0156\u0157\u0005\u001c\u0000\u0000\u0157\u0163"+
		"\u0006\u0019\uffff\uffff\u0000\u0158\u0159\u0005\u0019\u0000\u0000\u0159"+
		"\u0163\u0006\u0019\uffff\uffff\u0000\u015a\u015b\u0003*\u0015\u0000\u015b"+
		"\u015c\u0006\u0019\uffff\uffff\u0000\u015c\u0163\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0005\u000f\u0000\u0000\u015e\u015f\u00030\u0018\u0000\u015f"+
		"\u0160\u0005\u0010\u0000\u0000\u0160\u0161\u0006\u0019\uffff\uffff\u0000"+
		"\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u014e\u0001\u0000\u0000\u0000"+
		"\u0162\u0150\u0001\u0000\u0000\u0000\u0162\u0152\u0001\u0000\u0000\u0000"+
		"\u0162\u0154\u0001\u0000\u0000\u0000\u0162\u0156\u0001\u0000\u0000\u0000"+
		"\u0162\u0158\u0001\u0000\u0000\u0000\u0162\u015a\u0001\u0000\u0000\u0000"+
		"\u0162\u015d\u0001\u0000\u0000\u0000\u01633\u0001\u0000\u0000\u0000\u001a"+
		"7IQagiv\u00a0\u00aa\u00af\u00bc\u00c5\u00d3\u00dd\u00e9\u00ef\u00f1\u00f5"+
		"\u00ff\u0110\u011e\u0128\u0135\u0141\u014b\u0162";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}