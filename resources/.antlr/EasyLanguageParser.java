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
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandDecisao;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandFor;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandWhile;
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
		T__9=10, T__10=11, T__11=12, T__12=13, AP=14, FP=15, SC=16, OP=17, ATTR=18, 
		VIR=19, ACH=20, FCH=21, E=22, OU=23, OPREL=24, ID=25, NUMBER=26, WS=27;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_tipo = 3, RULE_bloco = 4, 
		RULE_cmd = 5, RULE_cmdleitura = 6, RULE_cmdescrita = 7, RULE_cmdattrib = 8, 
		RULE_cmdselecao = 9, RULE_cmdfor = 10, RULE_cmdwhile = 11, RULE_comp = 12, 
		RULE_condicao = 13, RULE_expr = 14, RULE_termo = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "declaravar", "tipo", "bloco", "cmd", "cmdleitura", "cmdescrita", 
			"cmdattrib", "cmdselecao", "cmdfor", "cmdwhile", "comp", "condicao", 
			"expr", "termo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'numero'", "'texto'", "'leia'", "'escreva'", 
			"'se'", "'senao'", "'para'", "'de'", "'passo'", "'faca'", "'enquanto'", 
			"'('", "')'", "';'", null, "'='", "','", "'{'", "'}'", "'ou'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "E", 
			"OU", "OPREL", "ID", "NUMBER", "WS"
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

	public EasyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
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
			setState(32);
			match(T__0);
			setState(33);
			decl();
			setState(34);
			bloco();
			setState(35);
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
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				declaravar();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__3 );
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
	public static class DeclaravarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(EasyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EasyLanguageParser.ID, i);
		}
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public List<TerminalNode> VIR() { return getTokens(EasyLanguageParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(EasyLanguageParser.VIR, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			tipo();
			setState(44);
			match(ID);

				                  _varName = _input.LT(-1).getText();
				                  _varValue = null;
				                  symbol = new Variable(_varName, _tipo, _varValue);
				                  if (!symbolTable.exists(_varName)){
				                     symbolTable.add(symbol);	
				                  }
				                  else{
				                  	 throw new SemanticException("Symbol "+_varName+" already declared");
				                  }
			                    
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(46);
				match(VIR);
				setState(47);
				match(ID);

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
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__2);
				 _tipo = Variable.NUMBER;  
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__3);
				 _tipo = Variable.TEXT;  
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
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 curThread = new ArrayList<AbstractCommand>(); 
				        stack.push(curThread);  
			          
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				cmd();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 33563360L) != 0) );
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
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				cmdleitura();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				cmdescrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				cmdattrib();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				cmdselecao();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				cmdwhile();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				cmdfor();
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
	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__4);
			setState(77);
			match(AP);
			setState(78);
			match(ID);
			 verificaID(_input.LT(-1).getText());
			                     	  _readID = _input.LT(-1).getText();
			                        
			setState(80);
			match(FP);
			setState(81);
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
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__5);
			setState(85);
			match(AP);
			setState(86);
			match(ID);
			 verificaID(_input.LT(-1).getText());
				                  _writeID = _input.LT(-1).getText();
			                     
			setState(88);
			match(FP);
			setState(89);
			match(SC);

			               	  CommandEscrita cmd = new CommandEscrita(_writeID);
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
		public ExprContext e;
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(EasyLanguageParser.ATTR, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
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
		enterRule(_localctx, 16, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
			 verificaID(_input.LT(-1).getText());
			                    _exprID = _input.LT(-1).getText();
			                   
			setState(94);
			match(ATTR);
			setState(95);
			((CmdattribContext)_localctx).e = expr();
			setState(96);
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
	public static class CmdselecaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(EasyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EasyLanguageParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(EasyLanguageParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(EasyLanguageParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(EasyLanguageParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(EasyLanguageParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(EasyLanguageParser.FCH, i);
		}
		public TerminalNode NUMBER() { return getToken(EasyLanguageParser.NUMBER, 0); }
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
		enterRule(_localctx, 18, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__6);
			setState(100);
			match(AP);
			setState(101);
			match(ID);
			 _exprDecision = _input.LT(-1).getText(); 
			setState(103);
			match(OPREL);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprDecision += _input.LT(-1).getText(); 
			setState(107);
			match(FP);
			setState(108);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
			                        stack.push(curThread);
			                    
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				cmd();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 33563360L) != 0) );
			setState(115);
			match(FCH);

			                       listaTrue = stack.pop();	
			                    
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(117);
				match(T__7);
				setState(118);
				match(ACH);

				                   	 	curThread = new ArrayList<AbstractCommand>();
				                   	 	stack.push(curThread);
				                   	
				{
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					cmd();
					}
					}
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 33563360L) != 0) );
				}
				setState(125);
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
		enterRule(_localctx, 20, RULE_cmdfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__8);
			setState(131);
			match(AP);
			setState(132);
			((CmdforContext)_localctx).ID = match(ID);
			setState(133);
			match(T__9);
			setState(134);
			((CmdforContext)_localctx).e1 = expr();
			setState(135);
			((CmdforContext)_localctx).op = match(OPREL);
			setState(136);
			((CmdforContext)_localctx).e2 = expr();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(137);
				match(T__10);
				setState(138);
				((CmdforContext)_localctx).e3 = expr();
				 ((CmdforContext)_localctx).stepExpr =  ((CmdforContext)_localctx).e3.text; 
				}
			}

			setState(143);
			match(FP);
			setState(144);
			match(T__11);
			setState(145);
			match(ACH);

			            curThread = new ArrayList<AbstractCommand>();
			            stack.push(curThread);
			        
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				cmd();
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 33563360L) != 0) );
			setState(152);
			match(FCH);

			            ArrayList<AbstractCommand> listaFor = stack.pop();
			            String varName = (((CmdforContext)_localctx).ID!=null?((CmdforContext)_localctx).ID.getText():null);
			            String startExpr = ((CmdforContext)_localctx).e1.text;
			            String operator = (((CmdforContext)_localctx).op!=null?((CmdforContext)_localctx).op.getText():null);
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
		enterRule(_localctx, 22, RULE_cmdwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__12);
			setState(156);
			match(AP);
			setState(157);
			((CmdwhileContext)_localctx).c = comp();
			 _exprDecision = ((CmdwhileContext)_localctx).c.text; 
			setState(159);
			match(FP);
			setState(160);
			match(ACH);

			            curThread = new ArrayList<AbstractCommand>();
			            stack.push(curThread);
			        
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				cmd();
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 33563360L) != 0) );
			setState(167);
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
		public List<TerminalNode> E() { return getTokens(EasyLanguageParser.E); }
		public TerminalNode E(int i) {
			return getToken(EasyLanguageParser.E, i);
		}
		public List<TerminalNode> OU() { return getTokens(EasyLanguageParser.OU); }
		public TerminalNode OU(int i) {
			return getToken(EasyLanguageParser.OU, i);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			((CompContext)_localctx).c1 = condicao();
			((CompContext)_localctx).text =  ((CompContext)_localctx).c1.text;
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E || _la==OU) {
				{
				{
				setState(172);
				((CompContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==E || _la==OU) ) {
					((CompContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				((CompContext)_localctx).c2 = condicao();

							String opJava = ((CompContext)_localctx).op.getText().equals("ou") ? "||" : "&&";
							_localctx.text += " " + opJava + " " + ((CompContext)_localctx).c2.text;
						
						
				}
				}
				setState(180);
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
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(EasyLanguageParser.OPREL, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			((CondicaoContext)_localctx).t1 = termo();
			setState(182);
			((CondicaoContext)_localctx).op = match(OPREL);
			setState(183);
			((CondicaoContext)_localctx).t2 = termo();

					((CondicaoContext)_localctx).text =  ((CondicaoContext)_localctx).t1.text + (((CondicaoContext)_localctx).op!=null?((CondicaoContext)_localctx).op.getText():null) + ((CondicaoContext)_localctx).t2.text;
				
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
		public TermoContext t1;
		public Token op;
		public TermoContext t2;
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
		enterRule(_localctx, 28, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((ExprContext)_localctx).t1 = termo();
			 ((ExprContext)_localctx).text =  ((ExprContext)_localctx).t1.text; 
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(188);
				((ExprContext)_localctx).op = match(OP);
				setState(189);
				((ExprContext)_localctx).t2 = termo();
				 _localctx.text += (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null) + ((ExprContext)_localctx).t2.text; 
				}
				}
				setState(196);
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
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(EasyLanguageParser.NUMBER, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termo);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				((TermoContext)_localctx).ID = match(ID);
				 verificaID((((TermoContext)_localctx).ID!=null?((TermoContext)_localctx).ID.getText():null)); ((TermoContext)_localctx).text =  (((TermoContext)_localctx).ID!=null?((TermoContext)_localctx).ID.getText():null); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				((TermoContext)_localctx).NUMBER = match(NUMBER);
				 ((TermoContext)_localctx).text =  (((TermoContext)_localctx).NUMBER!=null?((TermoContext)_localctx).NUMBER.getText():null); 
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
		"\u0004\u0001\u001b\u00cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0004\u0001(\b\u0001\u000b\u0001\f\u0001)\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"2\b\u0002\n\u0002\f\u00025\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0004\u0004A\b\u0004\u000b\u0004\f\u0004B\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005K\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\tp\b\t\u000b\t\f\tq\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\tz\b\t\u000b\t\f\t{\u0001\t\u0001\t\u0001\t\u0003\t\u0081\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u008e\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004"+
		"\n\u0095\b\n\u000b\n\f\n\u0096\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u00a4\b\u000b\u000b\u000b\f\u000b\u00a5\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u00b1\b\f\n\f\f\f\u00b4\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00c1\b\u000e\n\u000e\f\u000e\u00c4\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ca\b\u000f\u0001\u000f"+
		"\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e\u0000\u0002\u0001\u0000\u0019\u001a\u0001"+
		"\u0000\u0016\u0017\u00cd\u0000 \u0001\u0000\u0000\u0000\u0002\'\u0001"+
		"\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000"+
		"\u0000\b>\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fL\u0001"+
		"\u0000\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010\\\u0001\u0000"+
		"\u0000\u0000\u0012c\u0001\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000"+
		"\u0000\u0016\u009b\u0001\u0000\u0000\u0000\u0018\u00aa\u0001\u0000\u0000"+
		"\u0000\u001a\u00b5\u0001\u0000\u0000\u0000\u001c\u00ba\u0001\u0000\u0000"+
		"\u0000\u001e\u00c9\u0001\u0000\u0000\u0000 !\u0005\u0001\u0000\u0000!"+
		"\"\u0003\u0002\u0001\u0000\"#\u0003\b\u0004\u0000#$\u0005\u0002\u0000"+
		"\u0000$%\u0006\u0000\uffff\uffff\u0000%\u0001\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0004\u0002\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0003\u0001"+
		"\u0000\u0000\u0000+,\u0003\u0006\u0003\u0000,-\u0005\u0019\u0000\u0000"+
		"-3\u0006\u0002\uffff\uffff\u0000./\u0005\u0013\u0000\u0000/0\u0005\u0019"+
		"\u0000\u000002\u0006\u0002\uffff\uffff\u00001.\u0001\u0000\u0000\u0000"+
		"25\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000046\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0005\u0010"+
		"\u0000\u00007\u0005\u0001\u0000\u0000\u000089\u0005\u0003\u0000\u0000"+
		"9=\u0006\u0003\uffff\uffff\u0000:;\u0005\u0004\u0000\u0000;=\u0006\u0003"+
		"\uffff\uffff\u0000<8\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"=\u0007\u0001\u0000\u0000\u0000>@\u0006\u0004\uffff\uffff\u0000?A\u0003"+
		"\n\u0005\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\t\u0001\u0000\u0000\u0000"+
		"DK\u0003\f\u0006\u0000EK\u0003\u000e\u0007\u0000FK\u0003\u0010\b\u0000"+
		"GK\u0003\u0012\t\u0000HK\u0003\u0016\u000b\u0000IK\u0003\u0014\n\u0000"+
		"JD\u0001\u0000\u0000\u0000JE\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000"+
		"\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000K\u000b\u0001\u0000\u0000\u0000LM\u0005\u0005\u0000\u0000"+
		"MN\u0005\u000e\u0000\u0000NO\u0005\u0019\u0000\u0000OP\u0006\u0006\uffff"+
		"\uffff\u0000PQ\u0005\u000f\u0000\u0000QR\u0005\u0010\u0000\u0000RS\u0006"+
		"\u0006\uffff\uffff\u0000S\r\u0001\u0000\u0000\u0000TU\u0005\u0006\u0000"+
		"\u0000UV\u0005\u000e\u0000\u0000VW\u0005\u0019\u0000\u0000WX\u0006\u0007"+
		"\uffff\uffff\u0000XY\u0005\u000f\u0000\u0000YZ\u0005\u0010\u0000\u0000"+
		"Z[\u0006\u0007\uffff\uffff\u0000[\u000f\u0001\u0000\u0000\u0000\\]\u0005"+
		"\u0019\u0000\u0000]^\u0006\b\uffff\uffff\u0000^_\u0005\u0012\u0000\u0000"+
		"_`\u0003\u001c\u000e\u0000`a\u0005\u0010\u0000\u0000ab\u0006\b\uffff\uffff"+
		"\u0000b\u0011\u0001\u0000\u0000\u0000cd\u0005\u0007\u0000\u0000de\u0005"+
		"\u000e\u0000\u0000ef\u0005\u0019\u0000\u0000fg\u0006\t\uffff\uffff\u0000"+
		"gh\u0005\u0018\u0000\u0000hi\u0006\t\uffff\uffff\u0000ij\u0007\u0000\u0000"+
		"\u0000jk\u0006\t\uffff\uffff\u0000kl\u0005\u000f\u0000\u0000lm\u0005\u0014"+
		"\u0000\u0000mo\u0006\t\uffff\uffff\u0000np\u0003\n\u0005\u0000on\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005\u0015\u0000"+
		"\u0000t\u0080\u0006\t\uffff\uffff\u0000uv\u0005\b\u0000\u0000vw\u0005"+
		"\u0014\u0000\u0000wy\u0006\t\uffff\uffff\u0000xz\u0003\n\u0005\u0000y"+
		"x\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u0015"+
		"\u0000\u0000~\u007f\u0006\t\uffff\uffff\u0000\u007f\u0081\u0001\u0000"+
		"\u0000\u0000\u0080u\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0083\u0005\t\u0000\u0000"+
		"\u0083\u0084\u0005\u000e\u0000\u0000\u0084\u0085\u0005\u0019\u0000\u0000"+
		"\u0085\u0086\u0005\n\u0000\u0000\u0086\u0087\u0003\u001c\u000e\u0000\u0087"+
		"\u0088\u0005\u0018\u0000\u0000\u0088\u008d\u0003\u001c\u000e\u0000\u0089"+
		"\u008a\u0005\u000b\u0000\u0000\u008a\u008b\u0003\u001c\u000e\u0000\u008b"+
		"\u008c\u0006\n\uffff\uffff\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d"+
		"\u0089\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u000f\u0000\u0000\u0090"+
		"\u0091\u0005\f\u0000\u0000\u0091\u0092\u0005\u0014\u0000\u0000\u0092\u0094"+
		"\u0006\n\uffff\uffff\u0000\u0093\u0095\u0003\n\u0005\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0015\u0000\u0000\u0099\u009a"+
		"\u0006\n\uffff\uffff\u0000\u009a\u0015\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005\r\u0000\u0000\u009c\u009d\u0005\u000e\u0000\u0000\u009d\u009e\u0003"+
		"\u0018\f\u0000\u009e\u009f\u0006\u000b\uffff\uffff\u0000\u009f\u00a0\u0005"+
		"\u000f\u0000\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000\u00a1\u00a3\u0006"+
		"\u000b\uffff\uffff\u0000\u00a2\u00a4\u0003\n\u0005\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u0015\u0000\u0000\u00a8\u00a9\u0006"+
		"\u000b\uffff\uffff\u0000\u00a9\u0017\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0003\u001a\r\u0000\u00ab\u00b2\u0006\f\uffff\uffff\u0000\u00ac\u00ad"+
		"\u0007\u0001\u0000\u0000\u00ad\u00ae\u0003\u001a\r\u0000\u00ae\u00af\u0006"+
		"\f\uffff\uffff\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u0019\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003"+
		"\u001e\u000f\u0000\u00b6\u00b7\u0005\u0018\u0000\u0000\u00b7\u00b8\u0003"+
		"\u001e\u000f\u0000\u00b8\u00b9\u0006\r\uffff\uffff\u0000\u00b9\u001b\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0003\u001e\u000f\u0000\u00bb\u00c2\u0006"+
		"\u000e\uffff\uffff\u0000\u00bc\u00bd\u0005\u0011\u0000\u0000\u00bd\u00be"+
		"\u0003\u001e\u000f\u0000\u00be\u00bf\u0006\u000e\uffff\uffff\u0000\u00bf"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c0\u00bc\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c3\u001d\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0019\u0000\u0000\u00c6"+
		"\u00ca\u0006\u000f\uffff\uffff\u0000\u00c7\u00c8\u0005\u001a\u0000\u0000"+
		"\u00c8\u00ca\u0006\u000f\uffff\uffff\u0000\u00c9\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u001f\u0001\u0000\u0000"+
		"\u0000\u000e)3<BJq{\u0080\u008d\u0096\u00a5\u00b2\u00c2\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}