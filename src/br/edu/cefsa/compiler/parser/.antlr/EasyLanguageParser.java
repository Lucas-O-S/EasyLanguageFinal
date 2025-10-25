// Generated from /Users/grupotaak/Downloads/ProgamacaoPessoal/EasyLanguageFinal/src/br/edu/cefsa/compiler/parser/EasyLanguage.g4 by ANTLR 4.13.1

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, AP=15, FP=16, OP=17, 
		ACH=18, FCH=19, AND=20, OR=21, NOT=22, OPREL=23, BOOL=24, CHAR=25, NUMBER=26, 
		INTEGER=27, STRING=28, WS=29, NUMERO=30, BOOLEANO=31, TEXTO=32, INTEIRO=33, 
		CARACTERE=34, ID=35, VIR=36, ATTR=37, SC=38, AC=39, FC=40;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_idList = 2, RULE_declareItem = 3, RULE_tipo = 4, 
		RULE_bloco = 5, RULE_cmd = 6, RULE_cmdleitura = 7, RULE_cmdescrita = 8, 
		RULE_cmdattrib = 9, RULE_cmdattribarrayitem = 10, RULE_cmdselecao = 11, 
		RULE_cmdfor = 12, RULE_cmdwhile = 13, RULE_cmdarray = 14, RULE_cmdfuncao = 15, 
		RULE_listaParametros = 16, RULE_parametro = 17, RULE_retorno = 18, RULE_comp = 19, 
		RULE_condicao = 20, RULE_expr = 21, RULE_termo = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "idList", "declareItem", "tipo", "bloco", "cmd", "cmdleitura", 
			"cmdescrita", "cmdattrib", "cmdattribarrayitem", "cmdselecao", "cmdfor", 
			"cmdwhile", "cmdarray", "cmdfuncao", "listaParametros", "parametro", 
			"retorno", "comp", "condicao", "expr", "termo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'leia'", "'escreva'", "'se'", "'senao'", 
			"'para'", "'de'", "'passo'", "'faca'", "'enquanto'", "'vetor'", "'funcao'", 
			"'retorne'", "'('", "')'", null, "'{'", "'}'", "'e'", "'ou'", "'nao'", 
			null, null, null, null, null, null, null, "'numero'", "'booleano'", "'texto'", 
			"'inteiro'", "'caractere'", null, "','", "'='", "';'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "AP", "FP", "OP", "ACH", "FCH", "AND", "OR", "NOT", 
			"OPREL", "BOOL", "CHAR", "NUMBER", "INTEGER", "STRING", "WS", "NUMERO", 
			"BOOLEANO", "TEXTO", "INTEIRO", "CARACTERE", "ID", "VIR", "ATTR", "SC", 
			"AC", "FC"
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(46);
				cmdfuncao();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(T__0);

			        curThread = new ArrayList<>();
			        stack.push(curThread);
			      
			setState(54);
			bloco();
			setState(55);
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
		public TipoContext t;
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
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
			setState(58);
			((DeclContext)_localctx).t = tipo();
			setState(59);
			idList(t);
			setState(60);
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
		public Variable.Type tipoAtual;
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
		public IdListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IdListContext(ParserRuleContext parent, int invokingState, Variable.Type tipoAtual) {
			super(parent, invokingState);
			this.tipoAtual = tipoAtual;
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList(Variable.Type tipoAtual) throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState(), tipoAtual);
		enterRule(_localctx, 4, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			declareItem(tipoAtual);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(63);
				match(VIR);
				setState(64);
				declareItem(tipoAtual);
				}
				}
				setState(69);
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
		public Variable.Type tipoAtual;
		public String exprText;
		public Token ID;
		public ExprContext e;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(EasyLanguageParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclareItemContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeclareItemContext(ParserRuleContext parent, int invokingState, Variable.Type tipoAtual) {
			super(parent, invokingState);
			this.tipoAtual = tipoAtual;
		}
		@Override public int getRuleIndex() { return RULE_declareItem; }
	}

	public final DeclareItemContext declareItem(Variable.Type tipoAtual) throws RecognitionException {
		DeclareItemContext _localctx = new DeclareItemContext(_ctx, getState(), tipoAtual);
		enterRule(_localctx, 6, RULE_declareItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((DeclareItemContext)_localctx).ID = match(ID);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTR) {
				{
				setState(71);
				match(ATTR);
				setState(72);
				((DeclareItemContext)_localctx).e = expr();
				 ((DeclareItemContext)_localctx).exprText =  ((DeclareItemContext)_localctx).e.text; 
				}
			}


			        String varName = ((DeclareItemContext)_localctx).ID.getText();
			        String value = _localctx.exprText;

			        Variable.Type varType = tipoAtual; // usa o tipo passado do 'tipo'

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
			                cmd = new CommandAtribuicao(varName, value, varType);
			            } else {
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(NUMERO);
				 _tipo = Variable.Type.NUMBER; 
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(TEXTO);
				 _tipo = Variable.Type.TEXT; 
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(BOOLEANO);
				 _tipo = Variable.Type.BOOLEAN; 
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(INTEIRO);
				 _tipo = Variable.Type.INTEGER; 
				}
				break;
			case CARACTERE:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
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
			setState(91);
			match(ACH);

			        curThread = new ArrayList<>();
			        stack.push(curThread);
			      
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(95);
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
					setState(93);
					cmd();
					}
					break;
				case NUMERO:
				case BOOLEANO:
				case TEXTO:
				case INTEIRO:
				case CARACTERE:
					{
					setState(94);
					decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67645741240L) != 0) );
			setState(99);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				cmdleitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				cmdescrita();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				cmdattribarrayitem();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				cmdattrib();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				cmdselecao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				cmdwhile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				cmdfor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
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
			setState(111);
			match(T__2);
			setState(112);
			match(AP);
			setState(113);
			((CmdleituraContext)_localctx).id = match(ID);
			 verificaID(((CmdleituraContext)_localctx).id.getText()); _readID = ((CmdleituraContext)_localctx).id.getText(); 
			setState(115);
			match(FP);
			setState(116);
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
			setState(119);
			match(T__3);
			setState(120);
			match(AP);
			setState(121);
			((CmdescritaContext)_localctx).e = expr();
			setState(122);
			match(FP);
			setState(123);
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
			setState(126);
			((CmdattribContext)_localctx).id = match(ID);
			 verificaID(((CmdattribContext)_localctx).id.getText()); _exprID = ((CmdattribContext)_localctx).id.getText(); 
			setState(128);
			match(ATTR);
			setState(129);
			((CmdattribContext)_localctx).e = expr();
			setState(130);
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
			setState(133);
			((CmdattribarrayitemContext)_localctx).id = match(ID);
			setState(134);
			match(AC);
			setState(135);
			((CmdattribarrayitemContext)_localctx).idx = expr();
			setState(136);
			match(FC);
			setState(137);
			match(ATTR);
			setState(138);
			((CmdattribarrayitemContext)_localctx).e = expr();
			setState(139);
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
			setState(142);
			match(T__4);
			setState(143);
			match(AP);
			setState(144);
			((CmdselecaoContext)_localctx).c = comp();
			setState(145);
			match(FP);
			setState(146);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			            _exprDecision = ((CmdselecaoContext)_localctx).c.text;
			        
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				cmd();
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34359744696L) != 0) );
			setState(153);
			match(FCH);

			        listaTrue = stack.pop();
			      
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(155);
				match(T__5);
				setState(156);
				match(ACH);

				            curThread = new ArrayList<>();
				            stack.push(curThread);
				        
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(158);
					cmd();
					}
					}
					setState(161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34359744696L) != 0) );
				setState(163);
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
			setState(168);
			match(T__6);
			setState(169);
			match(AP);
			setState(170);
			((CmdforContext)_localctx).ID = match(ID);
			setState(171);
			match(T__7);
			setState(172);
			((CmdforContext)_localctx).e1 = expr();
			setState(173);
			((CmdforContext)_localctx).op = match(OPREL);
			setState(174);
			((CmdforContext)_localctx).e2 = expr();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(175);
				match(T__8);
				setState(176);
				((CmdforContext)_localctx).e3 = expr();
				 ((CmdforContext)_localctx).stepExpr =  ((CmdforContext)_localctx).e3.text; 
				}
			}

			setState(181);
			match(FP);
			setState(182);
			match(T__9);
			setState(183);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			        
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34359744696L) != 0) );
			setState(190);
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
			setState(193);
			match(T__10);
			setState(194);
			match(AP);
			setState(195);
			((CmdwhileContext)_localctx).c = comp();
			setState(196);
			match(FP);
			setState(197);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			            _exprDecision = ((CmdwhileContext)_localctx).c.text;
			        
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				cmd();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34359744696L) != 0) );
			setState(204);
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
			setState(207);
			match(T__11);
			setState(208);
			((CmdarrayContext)_localctx).tipoVar = tipo();
			setState(209);
			((CmdarrayContext)_localctx).ID = match(ID);
			setState(210);
			match(AC);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(211);
				((CmdarrayContext)_localctx).size = match(INTEGER);
				}
			}

			setState(214);
			match(FC);
			setState(215);
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
		public TipoContext type;
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
	}

	public final CmdfuncaoContext cmdfuncao() throws RecognitionException {
		CmdfuncaoContext _localctx = new CmdfuncaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdfuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__12);
			setState(219);
			((CmdfuncaoContext)_localctx).type = tipo();
			setState(220);
			((CmdfuncaoContext)_localctx).id = match(ID);
			setState(221);
			match(AP);
			 
			            _parameters = new ArrayList<Variable>(); 
			            _funcTipo = _tipo; 
			            _insideFunction = true; 
			        
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33285996544L) != 0)) {
				{
				setState(223);
				listaParametros();
				}
			}

			setState(226);
			match(FP);
			setState(227);
			match(ACH);

			            curThread = new ArrayList<>();
			            stack.push(curThread);
			        
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645741240L) != 0)) {
				{
				setState(231);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERO:
				case BOOLEANO:
				case TEXTO:
				case INTEIRO:
				case CARACTERE:
					{
					setState(229);
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
					setState(230);
					cmd();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(236);
				retorno();
				}
			}

			setState(239);
			match(FCH);

			          ArrayList<AbstractCommand> listaFunc = stack.pop();

			          ArrayList<Variable> paramList = _parameters;

			          Function funcSymbol = new Function(((CmdfuncaoContext)_localctx).id.getText(), _funcTipo, paramList);
			          if (!symbolTable.exists(((CmdfuncaoContext)_localctx).id.getText())) {
			              symbolTable.add(funcSymbol);
			          } else {
			              throw new SemanticException("Function " + ((CmdfuncaoContext)_localctx).id.getText() + " already declared");
			          }

			          CommandFunction cmdFunc = new CommandFunction(((CmdfuncaoContext)_localctx).id.getText(), _funcTipo, paramList, listaFunc);
			          _functions.add(cmdFunc); 

			          _insideFunction = false; // flag desativada ao sair da função
			      
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
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			parametro();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(243);
				match(VIR);
				setState(244);
				parametro();
				}
				}
				setState(249);
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
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			((ParametroContext)_localctx).t = tipo();
			setState(251);
			((ParametroContext)_localctx).id = match(ID);

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
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__13);
			setState(255);
			((RetornoContext)_localctx).e = expr();
			setState(256);
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
		enterRule(_localctx, 38, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			((CompContext)_localctx).c1 = condicao();
			((CompContext)_localctx).text =  ((CompContext)_localctx).c1.text;
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(261);
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
				setState(262);
				((CompContext)_localctx).c2 = condicao();

				            String opJava = ((CompContext)_localctx).op.getText().equals("ou") ? "||" : "&&";
				            _localctx.text += " " + opJava + " " + ((CompContext)_localctx).c2.text;
				        
				}
				}
				setState(269);
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
		enterRule(_localctx, 40, RULE_condicao);
		try {
			setState(279);
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
				setState(270);
				((CondicaoContext)_localctx).t1 = termo();
				setState(271);
				((CondicaoContext)_localctx).op = match(OPREL);
				setState(272);
				((CondicaoContext)_localctx).t2 = termo();
				 ((CondicaoContext)_localctx).text =  ((CondicaoContext)_localctx).t1.text + ((CondicaoContext)_localctx).op.getText() + ((CondicaoContext)_localctx).t2.text; 
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(NOT);
				setState(276);
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
		enterRule(_localctx, 42, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			((ExprContext)_localctx).termo1 = termo();
			 ((ExprContext)_localctx).text =  ((ExprContext)_localctx).termo1.text; 
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(283);
				((ExprContext)_localctx).OP = match(OP);
				setState(284);
				((ExprContext)_localctx).termo2 = termo();
				 _localctx.text += " " + ((ExprContext)_localctx).OP.getText() + " " + ((ExprContext)_localctx).termo2.text; 
				}
				}
				setState(291);
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
		enterRule(_localctx, 44, RULE_termo);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				((TermoContext)_localctx).ID = match(ID);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).ID.getText(); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				((TermoContext)_localctx).NUMBER = match(NUMBER);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).NUMBER.getText(); 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
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
				setState(298);
				((TermoContext)_localctx).INTEGER = match(INTEGER);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).INTEGER.getText(); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				((TermoContext)_localctx).STRING = match(STRING);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).STRING.getText(); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				((TermoContext)_localctx).CHAR = match(CHAR);
				 ((TermoContext)_localctx).text =  ((TermoContext)_localctx).CHAR.getText(); 
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				match(AP);
				setState(305);
				((TermoContext)_localctx).e = expr();
				setState(306);
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
		"\u0004\u0001(\u0138\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"L\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005`\b\u0005\u000b\u0005\f\u0005a\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006n\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u0096\b\u000b\u000b\u000b\f\u000b\u0097\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00a0\b\u000b\u000b"+
		"\u000b\f\u000b\u00a1\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a7"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b4\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0004\f\u00bb\b\f\u000b\f\f\f\u00bc\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00c9"+
		"\b\r\u000b\r\f\r\u00ca\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d5\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e1\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e8\b\u000f"+
		"\n\u000f\f\u000f\u00eb\t\u000f\u0001\u000f\u0003\u000f\u00ee\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00f6\b\u0010\n\u0010\f\u0010\u00f9\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u010a\b\u0013\n\u0013\f\u0013\u010d\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0118\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0120"+
		"\b\u0015\n\u0015\f\u0015\u0123\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0136\b\u0016\u0001\u0016\u0000\u0000"+
		"\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,\u0000\u0001\u0001\u0000\u0014\u0015\u0145\u0000"+
		"1\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004>\u0001"+
		"\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\bY\u0001\u0000\u0000"+
		"\u0000\n[\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000eo\u0001"+
		"\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000\u0012~\u0001\u0000\u0000"+
		"\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u008e\u0001\u0000\u0000"+
		"\u0000\u0018\u00a8\u0001\u0000\u0000\u0000\u001a\u00c1\u0001\u0000\u0000"+
		"\u0000\u001c\u00cf\u0001\u0000\u0000\u0000\u001e\u00da\u0001\u0000\u0000"+
		"\u0000 \u00f2\u0001\u0000\u0000\u0000\"\u00fa\u0001\u0000\u0000\u0000"+
		"$\u00fe\u0001\u0000\u0000\u0000&\u0103\u0001\u0000\u0000\u0000(\u0117"+
		"\u0001\u0000\u0000\u0000*\u0119\u0001\u0000\u0000\u0000,\u0135\u0001\u0000"+
		"\u0000\u0000.0\u0003\u001e\u000f\u0000/.\u0001\u0000\u0000\u000003\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"24\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000045\u0005\u0001\u0000"+
		"\u000056\u0006\u0000\uffff\uffff\u000067\u0003\n\u0005\u000078\u0005\u0002"+
		"\u0000\u000089\u0006\u0000\uffff\uffff\u00009\u0001\u0001\u0000\u0000"+
		"\u0000:;\u0003\b\u0004\u0000;<\u0003\u0004\u0002\u0000<=\u0005&\u0000"+
		"\u0000=\u0003\u0001\u0000\u0000\u0000>C\u0003\u0006\u0003\u0000?@\u0005"+
		"$\u0000\u0000@B\u0003\u0006\u0003\u0000A?\u0001\u0000\u0000\u0000BE\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"D\u0005\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FK\u0005#\u0000"+
		"\u0000GH\u0005%\u0000\u0000HI\u0003*\u0015\u0000IJ\u0006\u0003\uffff\uffff"+
		"\u0000JL\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0006\u0003\uffff\uffff\u0000"+
		"N\u0007\u0001\u0000\u0000\u0000OP\u0005\u001e\u0000\u0000PZ\u0006\u0004"+
		"\uffff\uffff\u0000QR\u0005 \u0000\u0000RZ\u0006\u0004\uffff\uffff\u0000"+
		"ST\u0005\u001f\u0000\u0000TZ\u0006\u0004\uffff\uffff\u0000UV\u0005!\u0000"+
		"\u0000VZ\u0006\u0004\uffff\uffff\u0000WX\u0005\"\u0000\u0000XZ\u0006\u0004"+
		"\uffff\uffff\u0000YO\u0001\u0000\u0000\u0000YQ\u0001\u0000\u0000\u0000"+
		"YS\u0001\u0000\u0000\u0000YU\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0005\u0012\u0000\u0000\\_\u0006"+
		"\u0005\uffff\uffff\u0000]`\u0003\f\u0006\u0000^`\u0003\u0002\u0001\u0000"+
		"_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cd\u0005\u0013\u0000\u0000d\u000b\u0001\u0000\u0000\u0000"+
		"en\u0003\u000e\u0007\u0000fn\u0003\u0010\b\u0000gn\u0003\u0014\n\u0000"+
		"hn\u0003\u0012\t\u0000in\u0003\u0016\u000b\u0000jn\u0003\u001a\r\u0000"+
		"kn\u0003\u0018\f\u0000ln\u0003\u001c\u000e\u0000me\u0001\u0000\u0000\u0000"+
		"mf\u0001\u0000\u0000\u0000mg\u0001\u0000\u0000\u0000mh\u0001\u0000\u0000"+
		"\u0000mi\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000ml\u0001\u0000\u0000\u0000n\r\u0001\u0000\u0000\u0000op\u0005"+
		"\u0003\u0000\u0000pq\u0005\u000f\u0000\u0000qr\u0005#\u0000\u0000rs\u0006"+
		"\u0007\uffff\uffff\u0000st\u0005\u0010\u0000\u0000tu\u0005&\u0000\u0000"+
		"uv\u0006\u0007\uffff\uffff\u0000v\u000f\u0001\u0000\u0000\u0000wx\u0005"+
		"\u0004\u0000\u0000xy\u0005\u000f\u0000\u0000yz\u0003*\u0015\u0000z{\u0005"+
		"\u0010\u0000\u0000{|\u0005&\u0000\u0000|}\u0006\b\uffff\uffff\u0000}\u0011"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005#\u0000\u0000\u007f\u0080\u0006\t"+
		"\uffff\uffff\u0000\u0080\u0081\u0005%\u0000\u0000\u0081\u0082\u0003*\u0015"+
		"\u0000\u0082\u0083\u0005&\u0000\u0000\u0083\u0084\u0006\t\uffff\uffff"+
		"\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0086\u0005#\u0000\u0000"+
		"\u0086\u0087\u0005\'\u0000\u0000\u0087\u0088\u0003*\u0015\u0000\u0088"+
		"\u0089\u0005(\u0000\u0000\u0089\u008a\u0005%\u0000\u0000\u008a\u008b\u0003"+
		"*\u0015\u0000\u008b\u008c\u0005&\u0000\u0000\u008c\u008d\u0006\n\uffff"+
		"\uffff\u0000\u008d\u0015\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0005"+
		"\u0000\u0000\u008f\u0090\u0005\u000f\u0000\u0000\u0090\u0091\u0003&\u0013"+
		"\u0000\u0091\u0092\u0005\u0010\u0000\u0000\u0092\u0093\u0005\u0012\u0000"+
		"\u0000\u0093\u0095\u0006\u000b\uffff\uffff\u0000\u0094\u0096\u0003\f\u0006"+
		"\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0013\u0000"+
		"\u0000\u009a\u00a6\u0006\u000b\uffff\uffff\u0000\u009b\u009c\u0005\u0006"+
		"\u0000\u0000\u009c\u009d\u0005\u0012\u0000\u0000\u009d\u009f\u0006\u000b"+
		"\uffff\uffff\u0000\u009e\u00a0\u0003\f\u0006\u0000\u009f\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0005\u0013\u0000\u0000\u00a4\u00a5\u0006\u000b"+
		"\uffff\uffff\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u009b\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u0017\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005\u0007\u0000\u0000\u00a9\u00aa\u0005"+
		"\u000f\u0000\u0000\u00aa\u00ab\u0005#\u0000\u0000\u00ab\u00ac\u0005\b"+
		"\u0000\u0000\u00ac\u00ad\u0003*\u0015\u0000\u00ad\u00ae\u0005\u0017\u0000"+
		"\u0000\u00ae\u00b3\u0003*\u0015\u0000\u00af\u00b0\u0005\t\u0000\u0000"+
		"\u00b0\u00b1\u0003*\u0015\u0000\u00b1\u00b2\u0006\f\uffff\uffff\u0000"+
		"\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00af\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005\u0010\u0000\u0000\u00b6\u00b7\u0005\n\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0012\u0000\u0000\u00b8\u00ba\u0006\f\uffff\uffff\u0000\u00b9"+
		"\u00bb\u0003\f\u0006\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005\u0013\u0000\u0000\u00bf\u00c0\u0006\f\uffff\uffff\u0000\u00c0\u0019"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u000b\u0000\u0000\u00c2\u00c3"+
		"\u0005\u000f\u0000\u0000\u00c3\u00c4\u0003&\u0013\u0000\u00c4\u00c5\u0005"+
		"\u0010\u0000\u0000\u00c5\u00c6\u0005\u0012\u0000\u0000\u00c6\u00c8\u0006"+
		"\r\uffff\uffff\u0000\u00c7\u00c9\u0003\f\u0006\u0000\u00c8\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005\u0013\u0000\u0000\u00cd\u00ce\u0006"+
		"\r\uffff\uffff\u0000\u00ce\u001b\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"\f\u0000\u0000\u00d0\u00d1\u0003\b\u0004\u0000\u00d1\u00d2\u0005#\u0000"+
		"\u0000\u00d2\u00d4\u0005\'\u0000\u0000\u00d3\u00d5\u0005\u001b\u0000\u0000"+
		"\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005(\u0000\u0000\u00d7"+
		"\u00d8\u0005&\u0000\u0000\u00d8\u00d9\u0006\u000e\uffff\uffff\u0000\u00d9"+
		"\u001d\u0001\u0000\u0000\u0000\u00da\u00db\u0005\r\u0000\u0000\u00db\u00dc"+
		"\u0003\b\u0004\u0000\u00dc\u00dd\u0005#\u0000\u0000\u00dd\u00de\u0005"+
		"\u000f\u0000\u0000\u00de\u00e0\u0006\u000f\uffff\uffff\u0000\u00df\u00e1"+
		"\u0003 \u0010\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		"\u0010\u0000\u0000\u00e3\u00e4\u0005\u0012\u0000\u0000\u00e4\u00e9\u0006"+
		"\u000f\uffff\uffff\u0000\u00e5\u00e8\u0003\u0002\u0001\u0000\u00e6\u00e8"+
		"\u0003\f\u0006\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ee\u0003"+
		"$\u0012\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0013"+
		"\u0000\u0000\u00f0\u00f1\u0006\u000f\uffff\uffff\u0000\u00f1\u001f\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f7\u0003\"\u0011\u0000\u00f3\u00f4\u0005$"+
		"\u0000\u0000\u00f4\u00f6\u0003\"\u0011\u0000\u00f5\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8!\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0003\b\u0004\u0000\u00fb"+
		"\u00fc\u0005#\u0000\u0000\u00fc\u00fd\u0006\u0011\uffff\uffff\u0000\u00fd"+
		"#\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u000e\u0000\u0000\u00ff\u0100"+
		"\u0003*\u0015\u0000\u0100\u0101\u0005&\u0000\u0000\u0101\u0102\u0006\u0012"+
		"\uffff\uffff\u0000\u0102%\u0001\u0000\u0000\u0000\u0103\u0104\u0003(\u0014"+
		"\u0000\u0104\u010b\u0006\u0013\uffff\uffff\u0000\u0105\u0106\u0007\u0000"+
		"\u0000\u0000\u0106\u0107\u0003(\u0014\u0000\u0107\u0108\u0006\u0013\uffff"+
		"\uffff\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0105\u0001\u0000"+
		"\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\'\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0003,\u0016\u0000"+
		"\u010f\u0110\u0005\u0017\u0000\u0000\u0110\u0111\u0003,\u0016\u0000\u0111"+
		"\u0112\u0006\u0014\uffff\uffff\u0000\u0112\u0118\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0005\u0016\u0000\u0000\u0114\u0115\u0003(\u0014\u0000\u0115"+
		"\u0116\u0006\u0014\uffff\uffff\u0000\u0116\u0118\u0001\u0000\u0000\u0000"+
		"\u0117\u010e\u0001\u0000\u0000\u0000\u0117\u0113\u0001\u0000\u0000\u0000"+
		"\u0118)\u0001\u0000\u0000\u0000\u0119\u011a\u0003,\u0016\u0000\u011a\u0121"+
		"\u0006\u0015\uffff\uffff\u0000\u011b\u011c\u0005\u0011\u0000\u0000\u011c"+
		"\u011d\u0003,\u0016\u0000\u011d\u011e\u0006\u0015\uffff\uffff\u0000\u011e"+
		"\u0120\u0001\u0000\u0000\u0000\u011f\u011b\u0001\u0000\u0000\u0000\u0120"+
		"\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u0122+\u0001\u0000\u0000\u0000\u0123\u0121"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0005#\u0000\u0000\u0125\u0136\u0006"+
		"\u0016\uffff\uffff\u0000\u0126\u0127\u0005\u001a\u0000\u0000\u0127\u0136"+
		"\u0006\u0016\uffff\uffff\u0000\u0128\u0129\u0005\u0018\u0000\u0000\u0129"+
		"\u0136\u0006\u0016\uffff\uffff\u0000\u012a\u012b\u0005\u001b\u0000\u0000"+
		"\u012b\u0136\u0006\u0016\uffff\uffff\u0000\u012c\u012d\u0005\u001c\u0000"+
		"\u0000\u012d\u0136\u0006\u0016\uffff\uffff\u0000\u012e\u012f\u0005\u0019"+
		"\u0000\u0000\u012f\u0136\u0006\u0016\uffff\uffff\u0000\u0130\u0131\u0005"+
		"\u000f\u0000\u0000\u0131\u0132\u0003*\u0015\u0000\u0132\u0133\u0005\u0010"+
		"\u0000\u0000\u0133\u0134\u0006\u0016\uffff\uffff\u0000\u0134\u0136\u0001"+
		"\u0000\u0000\u0000\u0135\u0124\u0001\u0000\u0000\u0000\u0135\u0126\u0001"+
		"\u0000\u0000\u0000\u0135\u0128\u0001\u0000\u0000\u0000\u0135\u012a\u0001"+
		"\u0000\u0000\u0000\u0135\u012c\u0001\u0000\u0000\u0000\u0135\u012e\u0001"+
		"\u0000\u0000\u0000\u0135\u0130\u0001\u0000\u0000\u0000\u0136-\u0001\u0000"+
		"\u0000\u0000\u00171CKY_am\u0097\u00a1\u00a6\u00b3\u00bc\u00ca\u00d4\u00e0"+
		"\u00e7\u00e9\u00ed\u00f7\u010b\u0117\u0121\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}