// Generated from /Users/grupotaak/Downloads/ProgamacaoPessoal/EasyLanguageFinal/resources/EasyLanguage.g4 by ANTLR 4.13.1

    import br.edu.cefsa.compiler.datastructures.Symbol;
    import br.edu.cefsa.compiler.datastructures.Variable;
    import br.edu.cefsa.compiler.datastructures.SymbolTable;
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
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, AP=13, FP=14, OP=15, ACH=16, FCH=17, AND=18, 
		OR=19, NOT=20, OPREL=21, BOOL=22, CHAR=23, NUMBER=24, INTEGER=25, STRING=26, 
		WS=27, NUMERO=28, BOOLEANO=29, TEXTO=30, INTEIRO=31, CARACTERE=32, ID=33, 
		VIR=34, ATTR=35, SC=36, AC=37, FC=38;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_idList = 2, RULE_declareItem = 3, RULE_tipo = 4, 
		RULE_bloco = 5, RULE_cmd = 6, RULE_cmdleitura = 7, RULE_cmdescrita = 8, 
		RULE_cmdattrib = 9, RULE_cmdattribarrayitem = 10, RULE_cmdselecao = 11, 
		RULE_cmdfor = 12, RULE_cmdwhile = 13, RULE_cmdarray = 14, RULE_comp = 15, 
		RULE_condicao = 16, RULE_expr = 17, RULE_termo = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "idList", "declareItem", "tipo", "bloco", "cmd", "cmdleitura", 
			"cmdescrita", "cmdattrib", "cmdattribarrayitem", "cmdselecao", "cmdfor", 
			"cmdwhile", "cmdarray", "comp", "condicao", "expr", "termo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'leia'", "'escreva'", "'se'", "'senao'", 
			"'para'", "'de'", "'passo'", "'faca'", "'enquanto'", "'vetor'", "'('", 
			"')'", null, "'{'", "'}'", "'e'", "'ou'", "'nao'", null, null, null, 
			null, null, null, null, "'numero'", "'booleano'", "'texto'", "'inteiro'", 
			"'caractere'", null, "','", "'='", "';'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "AP", "FP", "OP", "ACH", "FCH", "AND", "OR", "NOT", "OPREL", "BOOL", 
			"CHAR", "NUMBER", "INTEGER", "STRING", "WS", "NUMERO", "BOOLEANO", "TEXTO", 
			"INTEIRO", "CARACTERE", "ID", "VIR", "ATTR", "SC", "AC", "FC"
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
	    private String _position;
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
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);

			        curThread = new ArrayList<>();
			        stack.push(curThread);
			      
			setState(40);
			bloco();
			setState(41);
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
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			tipo();
			setState(45);
			idList();
			setState(46);
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
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			declareItem();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(49);
				match(VIR);
				setState(50);
				declareItem();
				}
				}
				setState(55);
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
	}

	public final DeclareItemContext declareItem() throws RecognitionException {
		DeclareItemContext _localctx = new DeclareItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declareItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((DeclareItemContext)_localctx).ID = match(ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTR) {
				{
				setState(57);
				match(ATTR);
				setState(58);
				((DeclareItemContext)_localctx).e = expr();
				 ((DeclareItemContext)_localctx).exprText =  ((DeclareItemContext)_localctx).e.text; 
				}
			}


			        String varName = ((DeclareItemContext)_localctx).ID.getText();
			        String value = _localctx.exprText;

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
		public TerminalNode NUMERO() { return getToken(EasyLanguageParser.NUMERO, 0); }
		public TerminalNode TEXTO() { return getToken(EasyLanguageParser.TEXTO, 0); }
		public TerminalNode BOOLEANO() { return getToken(EasyLanguageParser.BOOLEANO, 0); }
		public TerminalNode INTEIRO() { return getToken(EasyLanguageParser.INTEIRO, 0); }
		public TerminalNode CARACTERE() { return getToken(EasyLanguageParser.CARACTERE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(NUMERO);
				 _tipo = Variable.Type.NUMBER; 
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(TEXTO);
				 _tipo = Variable.Type.TEXT; 
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(BOOLEANO);
				 _tipo = Variable.Type.BOOLEAN; 
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(INTEIRO);
				 _tipo = Variable.Type.INTEGER; 
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(CARACTERE);
				 _tipo = Variable.Type.CHAR; 
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
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ACH);

			        curThread = new ArrayList<>();
			        stack.push(curThread);
			      
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(81);
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
					setState(79);
					cmd();
					}
					break;
				case NUMERO:
				case BOOLEANO:
				case TEXTO:
				case INTEIRO:
				case CARACTERE:
					{
					setState(80);
					decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16911440056L) != 0) );
			setState(85);
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
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				cmdleitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				cmdescrita();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				cmdattribarrayitem();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				cmdattrib();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				cmdselecao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				cmdwhile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				cmdfor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				cmdarray();
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
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__2);
			setState(98);
			match(AP);
			setState(99);
			((CmdleituraContext)_localctx).id = match(ID);
			 verificaID(((CmdleituraContext)_localctx).id.getText()); _readID = ((CmdleituraContext)_localctx).id.getText(); 
			setState(101);
			match(FP);
			setState(102);
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
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__3);
			setState(106);
			match(AP);
			setState(107);
			((CmdescritaContext)_localctx).e = expr();
			setState(108);
			match(FP);
			setState(109);
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
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((CmdattribContext)_localctx).id = match(ID);
			 verificaID(((CmdattribContext)_localctx).id.getText()); _exprID = ((CmdattribContext)_localctx).id.getText(); 
			setState(114);
			match(ATTR);
			setState(115);
			((CmdattribContext)_localctx).e = expr();
			setState(116);
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
	}

	public final CmdattribarrayitemContext cmdattribarrayitem() throws RecognitionException {
		CmdattribarrayitemContext _localctx = new CmdattribarrayitemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdattribarrayitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((CmdattribarrayitemContext)_localctx).id = match(ID);
			setState(120);
			match(AC);
			setState(121);
			((CmdattribarrayitemContext)_localctx).idx = expr();
			setState(122);
			match(FC);
			setState(123);
			match(ATTR);
			setState(124);
			((CmdattribarrayitemContext)_localctx).e = expr();
			setState(125);
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
	}

	public final CmdselecaoContext cmdselecao() throws RecognitionException {
		CmdselecaoContext _localctx = new CmdselecaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__4);
			setState(129);
			match(AP);
			setState(130);
			((CmdselecaoContext)_localctx).c = comp();
			setState(131);
			match(FP);
			setState(132);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			            _exprDecision = ((CmdselecaoContext)_localctx).c.text;
			        
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				cmd();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8589940920L) != 0) );
			setState(139);
			match(FCH);

			        listaTrue = stack.pop();
			      
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(141);
				match(T__5);
				setState(142);
				match(ACH);

				            curThread = new ArrayList<>();
				            stack.push(curThread);
				        
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(144);
					cmd();
					}
					}
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8589940920L) != 0) );
				setState(149);
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
	}

	public final CmdforContext cmdfor() throws RecognitionException {
		CmdforContext _localctx = new CmdforContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__6);
			setState(155);
			match(AP);
			setState(156);
			((CmdforContext)_localctx).ID = match(ID);
			setState(157);
			match(T__7);
			setState(158);
			((CmdforContext)_localctx).e1 = expr();
			setState(159);
			((CmdforContext)_localctx).op = match(OPREL);
			setState(160);
			((CmdforContext)_localctx).e2 = expr();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(161);
				match(T__8);
				setState(162);
				((CmdforContext)_localctx).e3 = expr();
				 ((CmdforContext)_localctx).stepExpr =  ((CmdforContext)_localctx).e3.text; 
				}
			}

			setState(167);
			match(FP);
			setState(168);
			match(T__9);
			setState(169);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			        
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				cmd();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8589940920L) != 0) );
			setState(176);
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
	}

	public final CmdwhileContext cmdwhile() throws RecognitionException {
		CmdwhileContext _localctx = new CmdwhileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__10);
			setState(180);
			match(AP);
			setState(181);
			((CmdwhileContext)_localctx).c = comp();
			setState(182);
			match(FP);
			setState(183);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			            _exprDecision = ((CmdwhileContext)_localctx).c.text;
			        
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				cmd();
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8589940920L) != 0) );
			setState(190);
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
	}

	public final CmdarrayContext cmdarray() throws RecognitionException {
		CmdarrayContext _localctx = new CmdarrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__11);
			setState(194);
			((CmdarrayContext)_localctx).tipoVar = tipo();
			setState(195);
			((CmdarrayContext)_localctx).ID = match(ID);
			setState(196);
			match(AC);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(197);
				((CmdarrayContext)_localctx).size = match(INTEGER);
				}
			}

			setState(200);
			match(FC);
			setState(201);
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
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			((CompContext)_localctx).c1 = condicao();
			((CompContext)_localctx).text =  ((CompContext)_localctx).c1.text;
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(206);
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
				setState(207);
				((CompContext)_localctx).c2 = condicao();

				            String opJava = ((CompContext)_localctx).op.getText().equals("ou") ? "||" : "&&";
				            _localctx.text += " " + opJava + " " + ((CompContext)_localctx).c2.text;
				        
				}
				}
				setState(214);
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
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condicao);
		try {
			setState(224);
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
				setState(215);
				((CondicaoContext)_localctx).t1 = termo();
				setState(216);
				((CondicaoContext)_localctx).op = match(OPREL);
				setState(217);
				((CondicaoContext)_localctx).t2 = termo();
				 ((CondicaoContext)_localctx).text =  ((CondicaoContext)_localctx).t1.text + ((CondicaoContext)_localctx).op.getText() + ((CondicaoContext)_localctx).t2.text; 
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(NOT);
				setState(221);
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((ExprContext)_localctx).termo1 = termo();
			 ((ExprContext)_localctx).text =  ((ExprContext)_localctx).termo1.text; 
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(228);
				((ExprContext)_localctx).OP = match(OP);
				setState(229);
				((ExprContext)_localctx).termo2 = termo();
				 _localctx.text += " " + ((ExprContext)_localctx).OP.getText() + " " + ((ExprContext)_localctx).termo2.text; 
				}
				}
				setState(236);
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
		public ExprContext e;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(EasyLanguageParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(EasyLanguageParser.BOOL, 0); }
		public TerminalNode INTEGER() { return getToken(EasyLanguageParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(EasyLanguageParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(EasyLanguageParser.CHAR, 0); }
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_termo);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				((TermoContext)_localctx).ID = match(ID);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).ID.getText(); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				((TermoContext)_localctx).NUMBER = match(NUMBER);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).NUMBER.getText(); 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				((TermoContext)_localctx).BOOL = match(BOOL);

				        String val = ((TermoContext)_localctx).BOOL.getText(); 
				        if(val.equals("verdadeiro")) val = "true";
				        else if(val.equals("falso")) val = "false";
				        ((TermoContext)_localctx).text =  val;
				      
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				((TermoContext)_localctx).INTEGER = match(INTEGER);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).INTEGER.getText(); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				((TermoContext)_localctx).STRING = match(STRING);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).STRING.getText(); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				((TermoContext)_localctx).CHAR = match(CHAR);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).CHAR.getText(); 
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
				match(AP);
				setState(250);
				((TermoContext)_localctx).e = expr();
				setState(251);
				match(FP);
				 ((TermoContext)_localctx).text =  "(" + ((TermoContext)_localctx).e.text + ")"; 
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

	public static final String _serializedATN =
		"\u0004\u0001&\u0101\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u00024\b\u0002\n\u0002\f\u00027\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003>\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004L\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0004\u0005R\b\u0005\u000b\u0005\f\u0005S\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006`\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0088\b\u000b"+
		"\u000b\u000b\f\u000b\u0089\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0004\u000b\u0092\b\u000b\u000b\u000b\f\u000b"+
		"\u0093\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0099\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00a6\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004"+
		"\f\u00ad\b\f\u000b\f\f\f\u00ae\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00bb\b\r\u000b\r\f\r"+
		"\u00bc\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00c7\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00d3\b\u000f\n\u000f\f\u000f\u00d6\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e1\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00e9\b\u0011\n\u0011\f\u0011\u00ec\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ff\b\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$\u0000\u0001\u0001\u0000\u0012\u0013\u010c"+
		"\u0000&\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u00040"+
		"\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\bK\u0001\u0000"+
		"\u0000\u0000\nM\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000\u000e"+
		"a\u0001\u0000\u0000\u0000\u0010i\u0001\u0000\u0000\u0000\u0012p\u0001"+
		"\u0000\u0000\u0000\u0014w\u0001\u0000\u0000\u0000\u0016\u0080\u0001\u0000"+
		"\u0000\u0000\u0018\u009a\u0001\u0000\u0000\u0000\u001a\u00b3\u0001\u0000"+
		"\u0000\u0000\u001c\u00c1\u0001\u0000\u0000\u0000\u001e\u00cc\u0001\u0000"+
		"\u0000\u0000 \u00e0\u0001\u0000\u0000\u0000\"\u00e2\u0001\u0000\u0000"+
		"\u0000$\u00fe\u0001\u0000\u0000\u0000&\'\u0005\u0001\u0000\u0000\'(\u0006"+
		"\u0000\uffff\uffff\u0000()\u0003\n\u0005\u0000)*\u0005\u0002\u0000\u0000"+
		"*+\u0006\u0000\uffff\uffff\u0000+\u0001\u0001\u0000\u0000\u0000,-\u0003"+
		"\b\u0004\u0000-.\u0003\u0004\u0002\u0000./\u0005$\u0000\u0000/\u0003\u0001"+
		"\u0000\u0000\u000005\u0003\u0006\u0003\u000012\u0005\"\u0000\u000024\u0003"+
		"\u0006\u0003\u000031\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u0005\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u00008=\u0005!\u0000\u00009:\u0005#\u0000"+
		"\u0000:;\u0003\"\u0011\u0000;<\u0006\u0003\uffff\uffff\u0000<>\u0001\u0000"+
		"\u0000\u0000=9\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?@\u0006\u0003\uffff\uffff\u0000@\u0007\u0001\u0000"+
		"\u0000\u0000AB\u0005\u001c\u0000\u0000BL\u0006\u0004\uffff\uffff\u0000"+
		"CD\u0005\u001e\u0000\u0000DL\u0006\u0004\uffff\uffff\u0000EF\u0005\u001d"+
		"\u0000\u0000FL\u0006\u0004\uffff\uffff\u0000GH\u0005\u001f\u0000\u0000"+
		"HL\u0006\u0004\uffff\uffff\u0000IJ\u0005 \u0000\u0000JL\u0006\u0004\uffff"+
		"\uffff\u0000KA\u0001\u0000\u0000\u0000KC\u0001\u0000\u0000\u0000KE\u0001"+
		"\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"L\t\u0001\u0000\u0000\u0000MN\u0005\u0010\u0000\u0000NQ\u0006\u0005\uffff"+
		"\uffff\u0000OR\u0003\f\u0006\u0000PR\u0003\u0002\u0001\u0000QO\u0001\u0000"+
		"\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UV\u0005\u0011\u0000\u0000V\u000b\u0001\u0000\u0000\u0000W`\u0003\u000e"+
		"\u0007\u0000X`\u0003\u0010\b\u0000Y`\u0003\u0014\n\u0000Z`\u0003\u0012"+
		"\t\u0000[`\u0003\u0016\u000b\u0000\\`\u0003\u001a\r\u0000]`\u0003\u0018"+
		"\f\u0000^`\u0003\u001c\u000e\u0000_W\u0001\u0000\u0000\u0000_X\u0001\u0000"+
		"\u0000\u0000_Y\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000_[\u0001"+
		"\u0000\u0000\u0000_\\\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_^\u0001\u0000\u0000\u0000`\r\u0001\u0000\u0000\u0000ab\u0005\u0003\u0000"+
		"\u0000bc\u0005\r\u0000\u0000cd\u0005!\u0000\u0000de\u0006\u0007\uffff"+
		"\uffff\u0000ef\u0005\u000e\u0000\u0000fg\u0005$\u0000\u0000gh\u0006\u0007"+
		"\uffff\uffff\u0000h\u000f\u0001\u0000\u0000\u0000ij\u0005\u0004\u0000"+
		"\u0000jk\u0005\r\u0000\u0000kl\u0003\"\u0011\u0000lm\u0005\u000e\u0000"+
		"\u0000mn\u0005$\u0000\u0000no\u0006\b\uffff\uffff\u0000o\u0011\u0001\u0000"+
		"\u0000\u0000pq\u0005!\u0000\u0000qr\u0006\t\uffff\uffff\u0000rs\u0005"+
		"#\u0000\u0000st\u0003\"\u0011\u0000tu\u0005$\u0000\u0000uv\u0006\t\uffff"+
		"\uffff\u0000v\u0013\u0001\u0000\u0000\u0000wx\u0005!\u0000\u0000xy\u0005"+
		"%\u0000\u0000yz\u0003\"\u0011\u0000z{\u0005&\u0000\u0000{|\u0005#\u0000"+
		"\u0000|}\u0003\"\u0011\u0000}~\u0005$\u0000\u0000~\u007f\u0006\n\uffff"+
		"\uffff\u0000\u007f\u0015\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0005"+
		"\u0000\u0000\u0081\u0082\u0005\r\u0000\u0000\u0082\u0083\u0003\u001e\u000f"+
		"\u0000\u0083\u0084\u0005\u000e\u0000\u0000\u0084\u0085\u0005\u0010\u0000"+
		"\u0000\u0085\u0087\u0006\u000b\uffff\uffff\u0000\u0086\u0088\u0003\f\u0006"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0011\u0000"+
		"\u0000\u008c\u0098\u0006\u000b\uffff\uffff\u0000\u008d\u008e\u0005\u0006"+
		"\u0000\u0000\u008e\u008f\u0005\u0010\u0000\u0000\u008f\u0091\u0006\u000b"+
		"\uffff\uffff\u0000\u0090\u0092\u0003\f\u0006\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\u0011\u0000\u0000\u0096\u0097\u0006\u000b"+
		"\uffff\uffff\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u008d\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0017\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\u0007\u0000\u0000\u009b\u009c\u0005"+
		"\r\u0000\u0000\u009c\u009d\u0005!\u0000\u0000\u009d\u009e\u0005\b\u0000"+
		"\u0000\u009e\u009f\u0003\"\u0011\u0000\u009f\u00a0\u0005\u0015\u0000\u0000"+
		"\u00a0\u00a5\u0003\"\u0011\u0000\u00a1\u00a2\u0005\t\u0000\u0000\u00a2"+
		"\u00a3\u0003\"\u0011\u0000\u00a3\u00a4\u0006\f\uffff\uffff\u0000\u00a4"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0005\u000e\u0000\u0000\u00a8\u00a9\u0005\n\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0010\u0000\u0000\u00aa\u00ac\u0006\f\uffff\uffff\u0000\u00ab\u00ad"+
		"\u0003\f\u0006\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"\u0011\u0000\u0000\u00b1\u00b2\u0006\f\uffff\uffff\u0000\u00b2\u0019\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\u000b\u0000\u0000\u00b4\u00b5\u0005"+
		"\r\u0000\u0000\u00b5\u00b6\u0003\u001e\u000f\u0000\u00b6\u00b7\u0005\u000e"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0010\u0000\u0000\u00b8\u00ba\u0006\r\uffff"+
		"\uffff\u0000\u00b9\u00bb\u0003\f\u0006\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005\u0011\u0000\u0000\u00bf\u00c0\u0006\r\uffff\uffff"+
		"\u0000\u00c0\u001b\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\f\u0000\u0000"+
		"\u00c2\u00c3\u0003\b\u0004\u0000\u00c3\u00c4\u0005!\u0000\u0000\u00c4"+
		"\u00c6\u0005%\u0000\u0000\u00c5\u00c7\u0005\u0019\u0000\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005&\u0000\u0000\u00c9\u00ca\u0005"+
		"$\u0000\u0000\u00ca\u00cb\u0006\u000e\uffff\uffff\u0000\u00cb\u001d\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0003 \u0010\u0000\u00cd\u00d4\u0006\u000f"+
		"\uffff\uffff\u0000\u00ce\u00cf\u0007\u0000\u0000\u0000\u00cf\u00d0\u0003"+
		" \u0010\u0000\u00d0\u00d1\u0006\u000f\uffff\uffff\u0000\u00d1\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d5\u001f\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0003$\u0012\u0000\u00d8\u00d9\u0005\u0015"+
		"\u0000\u0000\u00d9\u00da\u0003$\u0012\u0000\u00da\u00db\u0006\u0010\uffff"+
		"\uffff\u0000\u00db\u00e1\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0014"+
		"\u0000\u0000\u00dd\u00de\u0003 \u0010\u0000\u00de\u00df\u0006\u0010\uffff"+
		"\uffff\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00d7\u0001\u0000"+
		"\u0000\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e1!\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0003$\u0012\u0000\u00e3\u00ea\u0006\u0011\uffff\uffff"+
		"\u0000\u00e4\u00e5\u0005\u000f\u0000\u0000\u00e5\u00e6\u0003$\u0012\u0000"+
		"\u00e6\u00e7\u0006\u0011\uffff\uffff\u0000\u00e7\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e4\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb#\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0005!\u0000\u0000\u00ee\u00ff\u0006\u0012\uffff\uffff\u0000"+
		"\u00ef\u00f0\u0005\u0018\u0000\u0000\u00f0\u00ff\u0006\u0012\uffff\uffff"+
		"\u0000\u00f1\u00f2\u0005\u0016\u0000\u0000\u00f2\u00ff\u0006\u0012\uffff"+
		"\uffff\u0000\u00f3\u00f4\u0005\u0019\u0000\u0000\u00f4\u00ff\u0006\u0012"+
		"\uffff\uffff\u0000\u00f5\u00f6\u0005\u001a\u0000\u0000\u00f6\u00ff\u0006"+
		"\u0012\uffff\uffff\u0000\u00f7\u00f8\u0005\u0017\u0000\u0000\u00f8\u00ff"+
		"\u0006\u0012\uffff\uffff\u0000\u00f9\u00fa\u0005\r\u0000\u0000\u00fa\u00fb"+
		"\u0003\"\u0011\u0000\u00fb\u00fc\u0005\u000e\u0000\u0000\u00fc\u00fd\u0006"+
		"\u0012\uffff\uffff\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00ed"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ef\u0001\u0000\u0000\u0000\u00fe\u00f1"+
		"\u0001\u0000\u0000\u0000\u00fe\u00f3\u0001\u0000\u0000\u0000\u00fe\u00f5"+
		"\u0001\u0000\u0000\u0000\u00fe\u00f7\u0001\u0000\u0000\u0000\u00fe\u00f9"+
		"\u0001\u0000\u0000\u0000\u00ff%\u0001\u0000\u0000\u0000\u00115=KQS_\u0089"+
		"\u0093\u0098\u00a5\u00ae\u00bc\u00c6\u00d4\u00e0\u00ea\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}