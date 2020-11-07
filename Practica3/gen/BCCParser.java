// Generated from D:/Documents/Julian/Unal/2020-2/Lenguajes de Programación/ANTRL test/grammar\BCC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BCCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_BOOL=1, TK_NUM=2, TK_COMA=3, TK_DOS_PUNTOS=4, TK_END=5, TK_PUNTO_Y_COMA=6, 
		TK_VAR=7, TK_FUNCTION=8, TK_PARENTESIS_IZQUIERDO=9, TK_PARENTESIS_DERECHO=10, 
		TK_CORCHETE_IZQUIERDO=11, TK_CORCHETE_DERECHO=12, TK_PRINT=13, TK_INPUT=14, 
		TK_WHEN=15, TK_DO=16, TK_IF=17, TK_ELSE=18, TK_UNLESS=19, TK_WHILE=20, 
		TK_RETURN=21, TK_UNTIL=22, TK_REPEAT=23, TK_NEXT=24, TK_BREAK=25, TK_AND=26, 
		TK_OR=27, TK_LOOP=28, TK_FOR=29, TK_NOT=30, TK_ASIGNACION=31, TK_SUMA_IGUAL=32, 
		TK_RESTA_IGUAL=33, TK_PRODUCTO_IGUAL=34, TK_DIVISION_IGUAL=35, TK_MODULO_IGUAL=36, 
		TK_INCREMENTO=37, TK_DECREMENTO=38, TK_MENOR=39, TK_MAYOR=40, TK_IGUAL=41, 
		TK_DIFERENTE=42, TK_MENOR_IGUAL=43, TK_MAYOR_IGUAL=44, TK_SUMA=45, TK_RESTA=46, 
		TK_PRODUCTO=47, TK_DIVISION=48, TK_MODULO=49, BOOL=50, FID=51, ID=52, 
		NUM=53, ESP=54;
	public static final int
		RULE_prog = 0, RULE_fn_decl_list = 1, RULE_main_prog = 2, RULE_var_decl = 3, 
		RULE_data_type = 4, RULE_stmt_block = 5, RULE_stmt = 6, RULE_lexpr = 7, 
		RULE_nexpr = 8, RULE_rexpr = 9, RULE_simple_expr = 10, RULE_term = 11, 
		RULE_factor = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fn_decl_list", "main_prog", "var_decl", "data_type", "stmt_block", 
			"stmt", "lexpr", "nexpr", "rexpr", "simple_expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'num'", "','", "':'", "'end'", "';'", "'var'", "'function'", 
			"'('", "')'", "'{'", "'}'", "'print'", "'input'", "'when'", "'do'", "'if'", 
			"'else'", "'unless'", "'while'", "'return'", "'until'", "'repeat'", "'next'", 
			"'break'", "'and'", "'or'", "'loop'", "'for'", "'not'", "':='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'++'", "'--'", "'<'", "'>'", "'=='", 
			"'!='", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_BOOL", "TK_NUM", "TK_COMA", "TK_DOS_PUNTOS", "TK_END", "TK_PUNTO_Y_COMA", 
			"TK_VAR", "TK_FUNCTION", "TK_PARENTESIS_IZQUIERDO", "TK_PARENTESIS_DERECHO", 
			"TK_CORCHETE_IZQUIERDO", "TK_CORCHETE_DERECHO", "TK_PRINT", "TK_INPUT", 
			"TK_WHEN", "TK_DO", "TK_IF", "TK_ELSE", "TK_UNLESS", "TK_WHILE", "TK_RETURN", 
			"TK_UNTIL", "TK_REPEAT", "TK_NEXT", "TK_BREAK", "TK_AND", "TK_OR", "TK_LOOP", 
			"TK_FOR", "TK_NOT", "TK_ASIGNACION", "TK_SUMA_IGUAL", "TK_RESTA_IGUAL", 
			"TK_PRODUCTO_IGUAL", "TK_DIVISION_IGUAL", "TK_MODULO_IGUAL", "TK_INCREMENTO", 
			"TK_DECREMENTO", "TK_MENOR", "TK_MAYOR", "TK_IGUAL", "TK_DIFERENTE", 
			"TK_MENOR_IGUAL", "TK_MAYOR_IGUAL", "TK_SUMA", "TK_RESTA", "TK_PRODUCTO", 
			"TK_DIVISION", "TK_MODULO", "BOOL", "FID", "ID", "NUM", "ESP"
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
	public String getGrammarFileName() { return "BCC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BCCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Main_progContext main_prog() {
			return getRuleContext(Main_progContext.class,0);
		}
		public List<Fn_decl_listContext> fn_decl_list() {
			return getRuleContexts(Fn_decl_listContext.class);
		}
		public Fn_decl_listContext fn_decl_list(int i) {
			return getRuleContext(Fn_decl_listContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_FUNCTION) {
				{
				{
				setState(26);
				fn_decl_list();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			main_prog();
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

	public static class Fn_decl_listContext extends ParserRuleContext {
		public Var_declContext parametros;
		public Var_declContext variables;
		public TerminalNode TK_FUNCTION() { return getToken(BCCParser.TK_FUNCTION, 0); }
		public TerminalNode FID() { return getToken(BCCParser.FID, 0); }
		public TerminalNode TK_DOS_PUNTOS() { return getToken(BCCParser.TK_DOS_PUNTOS, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(BCCParser.TK_PARENTESIS_DERECHO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public TerminalNode TK_VAR() { return getToken(BCCParser.TK_VAR, 0); }
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public Fn_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_decl_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitFn_decl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fn_decl_listContext fn_decl_list() throws RecognitionException {
		Fn_decl_listContext _localctx = new Fn_decl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fn_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(TK_FUNCTION);
			setState(35);
			match(FID);
			setState(36);
			match(TK_DOS_PUNTOS);
			setState(37);
			data_type();
			setState(38);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(39);
				((Fn_decl_listContext)_localctx).parametros = var_decl();
				}
			}

			setState(42);
			match(TK_PARENTESIS_DERECHO);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VAR) {
				{
				setState(43);
				match(TK_VAR);
				setState(44);
				((Fn_decl_listContext)_localctx).variables = var_decl();
				setState(45);
				match(TK_PUNTO_Y_COMA);
				}
			}

			setState(49);
			stmt_block();
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

	public static class Main_progContext extends ParserRuleContext {
		public TerminalNode TK_END() { return getToken(BCCParser.TK_END, 0); }
		public TerminalNode TK_VAR() { return getToken(BCCParser.TK_VAR, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Main_progContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitMain_prog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_progContext main_prog() throws RecognitionException {
		Main_progContext _localctx = new Main_progContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VAR) {
				{
				setState(51);
				match(TK_VAR);
				setState(52);
				var_decl();
				setState(53);
				match(TK_PUNTO_Y_COMA);
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRINT) | (1L << TK_INPUT) | (1L << TK_WHEN) | (1L << TK_DO) | (1L << TK_IF) | (1L << TK_UNLESS) | (1L << TK_WHILE) | (1L << TK_RETURN) | (1L << TK_UNTIL) | (1L << TK_REPEAT) | (1L << TK_NEXT) | (1L << TK_BREAK) | (1L << TK_LOOP) | (1L << TK_FOR) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << ID))) != 0)) {
				{
				{
				setState(57);
				stmt();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(TK_END);
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

	public static class Var_declContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BCCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BCCParser.ID, i);
		}
		public List<TerminalNode> TK_DOS_PUNTOS() { return getTokens(BCCParser.TK_DOS_PUNTOS); }
		public TerminalNode TK_DOS_PUNTOS(int i) {
			return getToken(BCCParser.TK_DOS_PUNTOS, i);
		}
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(BCCParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(BCCParser.TK_COMA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
			match(TK_DOS_PUNTOS);
			setState(67);
			data_type();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(68);
				match(TK_COMA);
				setState(69);
				match(ID);
				setState(70);
				match(TK_DOS_PUNTOS);
				setState(71);
				data_type();
				}
				}
				setState(76);
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode TK_BOOL() { return getToken(BCCParser.TK_BOOL, 0); }
		public TerminalNode TK_NUM() { return getToken(BCCParser.TK_NUM, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==TK_BOOL || _la==TK_NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Stmt_blockContext extends ParserRuleContext {
		public TerminalNode TK_CORCHETE_IZQUIERDO() { return getToken(BCCParser.TK_CORCHETE_IZQUIERDO, 0); }
		public TerminalNode TK_CORCHETE_DERECHO() { return getToken(BCCParser.TK_CORCHETE_DERECHO, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt_block);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CORCHETE_IZQUIERDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(TK_CORCHETE_IZQUIERDO);
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(80);
					stmt();
					}
					}
					setState(83); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRINT) | (1L << TK_INPUT) | (1L << TK_WHEN) | (1L << TK_DO) | (1L << TK_IF) | (1L << TK_UNLESS) | (1L << TK_WHILE) | (1L << TK_RETURN) | (1L << TK_UNTIL) | (1L << TK_REPEAT) | (1L << TK_NEXT) | (1L << TK_BREAK) | (1L << TK_LOOP) | (1L << TK_FOR) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << ID))) != 0) );
				setState(85);
				match(TK_CORCHETE_DERECHO);
				}
				break;
			case TK_PRINT:
			case TK_INPUT:
			case TK_WHEN:
			case TK_DO:
			case TK_IF:
			case TK_UNLESS:
			case TK_WHILE:
			case TK_RETURN:
			case TK_UNTIL:
			case TK_REPEAT:
			case TK_NEXT:
			case TK_BREAK:
			case TK_LOOP:
			case TK_FOR:
			case TK_INCREMENTO:
			case TK_DECREMENTO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				stmt();
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NextContext extends StmtContext {
		public TerminalNode TK_NEXT() { return getToken(BCCParser.TK_NEXT, 0); }
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public NextContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitNext(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsignacionContext extends StmtContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_ASIGNACION() { return getToken(BCCParser.TK_ASIGNACION, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public AsignacionContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumaIgualContext extends StmtContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_SUMA_IGUAL() { return getToken(BCCParser.TK_SUMA_IGUAL, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public SumaIgualContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitSumaIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreIncrementoContext extends StmtContext {
		public TerminalNode TK_INCREMENTO() { return getToken(BCCParser.TK_INCREMENTO, 0); }
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public PreIncrementoContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPreIncremento(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StmtContext {
		public TerminalNode TK_FOR() { return getToken(BCCParser.TK_FOR, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public List<TerminalNode> TK_PUNTO_Y_COMA() { return getTokens(BCCParser.TK_PUNTO_Y_COMA); }
		public TerminalNode TK_PUNTO_Y_COMA(int i) {
			return getToken(BCCParser.TK_PUNTO_Y_COMA, i);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(BCCParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public ForContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StmtContext {
		public TerminalNode TK_WHILE() { return getToken(BCCParser.TK_WHILE, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(BCCParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public WhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhenContext extends StmtContext {
		public TerminalNode TK_WHEN() { return getToken(BCCParser.TK_WHEN, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(BCCParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public WhenContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitWhen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnlessContext extends StmtContext {
		public TerminalNode TK_UNLESS() { return getToken(BCCParser.TK_UNLESS, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(BCCParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public UnlessContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitUnless(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopContext extends StmtContext {
		public TerminalNode TK_LOOP() { return getToken(BCCParser.TK_LOOP, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public LoopContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatContext extends StmtContext {
		public TerminalNode TK_REPEAT() { return getToken(BCCParser.TK_REPEAT, 0); }
		public TerminalNode TK_NUM() { return getToken(BCCParser.TK_NUM, 0); }
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public RepeatContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProductoIgualContext extends StmtContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_PRODUCTO_IGUAL() { return getToken(BCCParser.TK_PRODUCTO_IGUAL, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public ProductoIgualContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitProductoIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostDecrementoContext extends StmtContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_DECREMENTO() { return getToken(BCCParser.TK_DECREMENTO, 0); }
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public PostDecrementoContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPostDecremento(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RestaIgualContext extends StmtContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_RESTA_IGUAL() { return getToken(BCCParser.TK_RESTA_IGUAL, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public RestaIgualContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitRestaIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StmtContext {
		public TerminalNode TK_IF() { return getToken(BCCParser.TK_IF, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(BCCParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public List<Stmt_blockContext> stmt_block() {
			return getRuleContexts(Stmt_blockContext.class);
		}
		public Stmt_blockContext stmt_block(int i) {
			return getRuleContext(Stmt_blockContext.class,i);
		}
		public TerminalNode TK_ELSE() { return getToken(BCCParser.TK_ELSE, 0); }
		public IfContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncrementoContext extends StmtContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_INCREMENTO() { return getToken(BCCParser.TK_INCREMENTO, 0); }
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public PostIncrementoContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPostIncremento(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends StmtContext {
		public TerminalNode TK_BREAK() { return getToken(BCCParser.TK_BREAK, 0); }
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public BreakContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoUntilContext extends StmtContext {
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public TerminalNode TK_UNTIL() { return getToken(BCCParser.TK_UNTIL, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(BCCParser.TK_PARENTESIS_DERECHO, 0); }
		public DoUntilContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitDoUntil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputContext extends StmtContext {
		public TerminalNode TK_INPUT() { return getToken(BCCParser.TK_INPUT, 0); }
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public InputContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloIgualContext extends StmtContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_MODULO_IGUAL() { return getToken(BCCParser.TK_MODULO_IGUAL, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public ModuloIgualContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitModuloIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreDecrementoContext extends StmtContext {
		public TerminalNode TK_DECREMENTO() { return getToken(BCCParser.TK_DECREMENTO, 0); }
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public PreDecrementoContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPreDecremento(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StmtContext {
		public TerminalNode TK_PRINT() { return getToken(BCCParser.TK_PRINT, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public PrintContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileContext extends StmtContext {
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public TerminalNode TK_WHILE() { return getToken(BCCParser.TK_WHILE, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(BCCParser.TK_PARENTESIS_DERECHO, 0); }
		public DoWhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionIgualContext extends StmtContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_DIVISION_IGUAL() { return getToken(BCCParser.TK_DIVISION_IGUAL, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public DivisionIgualContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitDivisionIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UntilContext extends StmtContext {
		public TerminalNode TK_UNTIL() { return getToken(BCCParser.TK_UNTIL, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(BCCParser.TK_PARENTESIS_DERECHO, 0); }
		public TerminalNode TK_DO() { return getToken(BCCParser.TK_DO, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public UntilContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitUntil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StmtContext {
		public TerminalNode TK_RETURN() { return getToken(BCCParser.TK_RETURN, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public ReturnContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(TK_PRINT);
				setState(91);
				lexpr();
				setState(92);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 2:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(TK_INPUT);
				setState(95);
				match(ID);
				setState(96);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 3:
				_localctx = new WhenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(TK_WHEN);
				setState(98);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(99);
				lexpr();
				setState(100);
				match(TK_PARENTESIS_DERECHO);
				setState(101);
				match(TK_DO);
				setState(102);
				stmt_block();
				}
				break;
			case 4:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(TK_IF);
				setState(105);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(106);
				lexpr();
				setState(107);
				match(TK_PARENTESIS_DERECHO);
				setState(108);
				match(TK_DO);
				setState(109);
				stmt_block();
				setState(110);
				match(TK_ELSE);
				setState(111);
				stmt_block();
				}
				break;
			case 5:
				_localctx = new UnlessContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(TK_UNLESS);
				setState(114);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(115);
				lexpr();
				setState(116);
				match(TK_PARENTESIS_DERECHO);
				setState(117);
				match(TK_DO);
				setState(118);
				stmt_block();
				}
				break;
			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(TK_WHILE);
				setState(121);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(122);
				lexpr();
				setState(123);
				match(TK_PARENTESIS_DERECHO);
				setState(124);
				match(TK_DO);
				setState(125);
				stmt_block();
				}
				break;
			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				match(TK_RETURN);
				setState(128);
				lexpr();
				setState(129);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 8:
				_localctx = new UntilContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				match(TK_UNTIL);
				setState(132);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(133);
				lexpr();
				setState(134);
				match(TK_PARENTESIS_DERECHO);
				setState(135);
				match(TK_DO);
				setState(136);
				stmt_block();
				}
				break;
			case 9:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				match(TK_LOOP);
				setState(139);
				stmt_block();
				}
				break;
			case 10:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(140);
				match(TK_DO);
				setState(141);
				stmt_block();
				setState(142);
				match(TK_WHILE);
				setState(143);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(144);
				lexpr();
				setState(145);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 11:
				_localctx = new DoUntilContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(147);
				match(TK_DO);
				setState(148);
				stmt_block();
				setState(149);
				match(TK_UNTIL);
				setState(150);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(151);
				lexpr();
				setState(152);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 12:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(154);
				match(TK_REPEAT);
				setState(155);
				match(TK_NUM);
				setState(156);
				match(TK_PUNTO_Y_COMA);
				setState(157);
				stmt_block();
				}
				break;
			case 13:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(158);
				match(TK_FOR);
				setState(159);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(160);
				lexpr();
				setState(161);
				match(TK_PUNTO_Y_COMA);
				setState(162);
				lexpr();
				setState(163);
				match(TK_PUNTO_Y_COMA);
				setState(164);
				lexpr();
				setState(165);
				match(TK_PARENTESIS_DERECHO);
				setState(166);
				match(TK_DO);
				setState(167);
				stmt_block();
				}
				break;
			case 14:
				_localctx = new NextContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(169);
				match(TK_NEXT);
				setState(170);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 15:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(171);
				match(TK_BREAK);
				setState(172);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 16:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(173);
				match(ID);
				setState(174);
				match(TK_ASIGNACION);
				setState(175);
				lexpr();
				setState(176);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 17:
				_localctx = new SumaIgualContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(178);
				match(ID);
				setState(179);
				match(TK_SUMA_IGUAL);
				setState(180);
				lexpr();
				setState(181);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 18:
				_localctx = new RestaIgualContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(183);
				match(ID);
				setState(184);
				match(TK_RESTA_IGUAL);
				setState(185);
				lexpr();
				setState(186);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 19:
				_localctx = new ProductoIgualContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(188);
				match(ID);
				setState(189);
				match(TK_PRODUCTO_IGUAL);
				setState(190);
				lexpr();
				setState(191);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 20:
				_localctx = new DivisionIgualContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(193);
				match(ID);
				setState(194);
				match(TK_DIVISION_IGUAL);
				setState(195);
				lexpr();
				setState(196);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 21:
				_localctx = new ModuloIgualContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(198);
				match(ID);
				setState(199);
				match(TK_MODULO_IGUAL);
				setState(200);
				lexpr();
				setState(201);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 22:
				_localctx = new PostIncrementoContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(203);
				match(ID);
				setState(204);
				match(TK_INCREMENTO);
				setState(205);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 23:
				_localctx = new PostDecrementoContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(206);
				match(ID);
				setState(207);
				match(TK_DECREMENTO);
				setState(208);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 24:
				_localctx = new PreIncrementoContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(209);
				match(TK_INCREMENTO);
				setState(210);
				match(ID);
				setState(211);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 25:
				_localctx = new PreDecrementoContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(212);
				match(TK_DECREMENTO);
				setState(213);
				match(ID);
				setState(214);
				match(TK_PUNTO_Y_COMA);
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

	public static class LexprContext extends ParserRuleContext {
		public List<NexprContext> nexpr() {
			return getRuleContexts(NexprContext.class);
		}
		public NexprContext nexpr(int i) {
			return getRuleContext(NexprContext.class,i);
		}
		public List<TerminalNode> TK_AND() { return getTokens(BCCParser.TK_AND); }
		public TerminalNode TK_AND(int i) {
			return getToken(BCCParser.TK_AND, i);
		}
		public List<TerminalNode> TK_OR() { return getTokens(BCCParser.TK_OR); }
		public TerminalNode TK_OR(int i) {
			return getToken(BCCParser.TK_OR, i);
		}
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitLexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexprContext lexpr() throws RecognitionException {
		LexprContext _localctx = new LexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			nexpr();
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_AND) {
					{
					{
					setState(218);
					match(TK_AND);
					setState(219);
					nexpr();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_OR) {
					{
					{
					setState(225);
					match(TK_OR);
					setState(226);
					nexpr();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class NexprContext extends ParserRuleContext {
		public TerminalNode TK_NOT() { return getToken(BCCParser.TK_NOT, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(BCCParser.TK_PARENTESIS_DERECHO, 0); }
		public RexprContext rexpr() {
			return getRuleContext(RexprContext.class,0);
		}
		public NexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitNexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NexprContext nexpr() throws RecognitionException {
		NexprContext _localctx = new NexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nexpr);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(TK_NOT);
				setState(235);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(236);
				lexpr();
				setState(237);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case TK_PARENTESIS_IZQUIERDO:
			case TK_INCREMENTO:
			case TK_DECREMENTO:
			case BOOL:
			case FID:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				rexpr();
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

	public static class RexprContext extends ParserRuleContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode TK_MAYOR() { return getToken(BCCParser.TK_MAYOR, 0); }
		public TerminalNode TK_MENOR() { return getToken(BCCParser.TK_MENOR, 0); }
		public TerminalNode TK_IGUAL() { return getToken(BCCParser.TK_IGUAL, 0); }
		public TerminalNode TK_DIFERENTE() { return getToken(BCCParser.TK_DIFERENTE, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(BCCParser.TK_MAYOR_IGUAL, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(BCCParser.TK_MENOR_IGUAL, 0); }
		public RexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitRexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RexprContext rexpr() throws RecognitionException {
		RexprContext _localctx = new RexprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			simple_expr();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MAYOR) | (1L << TK_IGUAL) | (1L << TK_DIFERENTE) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL))) != 0)) {
				{
				setState(243);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MAYOR) | (1L << TK_IGUAL) | (1L << TK_DIFERENTE) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(244);
				simple_expr();
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

	public static class Simple_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> TK_SUMA() { return getTokens(BCCParser.TK_SUMA); }
		public TerminalNode TK_SUMA(int i) {
			return getToken(BCCParser.TK_SUMA, i);
		}
		public List<TerminalNode> TK_RESTA() { return getTokens(BCCParser.TK_RESTA); }
		public TerminalNode TK_RESTA(int i) {
			return getToken(BCCParser.TK_RESTA, i);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simple_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			term();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SUMA || _la==TK_RESTA) {
				{
				{
				setState(248);
				_la = _input.LA(1);
				if ( !(_la==TK_SUMA || _la==TK_RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(249);
				term();
				}
				}
				setState(254);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TK_PRODUCTO() { return getTokens(BCCParser.TK_PRODUCTO); }
		public TerminalNode TK_PRODUCTO(int i) {
			return getToken(BCCParser.TK_PRODUCTO, i);
		}
		public List<TerminalNode> TK_DIVISION() { return getTokens(BCCParser.TK_DIVISION); }
		public TerminalNode TK_DIVISION(int i) {
			return getToken(BCCParser.TK_DIVISION, i);
		}
		public List<TerminalNode> TK_MODULO() { return getTokens(BCCParser.TK_MODULO); }
		public TerminalNode TK_MODULO(int i) {
			return getToken(BCCParser.TK_MODULO, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			factor();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRODUCTO) | (1L << TK_DIVISION) | (1L << TK_MODULO))) != 0)) {
				{
				{
				setState(256);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRODUCTO) | (1L << TK_DIVISION) | (1L << TK_MODULO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				factor();
				}
				}
				setState(262);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LlamadoFunctContext extends FactorContext {
		public TerminalNode FID() { return getToken(BCCParser.FID, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(BCCParser.TK_PARENTESIS_DERECHO, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(BCCParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(BCCParser.TK_COMA, i);
		}
		public LlamadoFunctContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitLlamadoFunct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends FactorContext {
		public TerminalNode BOOL() { return getToken(BCCParser.BOOL, 0); }
		public BoolContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreFactorContext extends FactorContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_INCREMENTO() { return getToken(BCCParser.TK_INCREMENTO, 0); }
		public TerminalNode TK_DECREMENTO() { return getToken(BCCParser.TK_DECREMENTO, 0); }
		public PreFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPreFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends FactorContext {
		public TerminalNode NUM() { return getToken(BCCParser.NUM, 0); }
		public NumContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends FactorContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public VariableContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentesisFactorContext extends FactorContext {
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PARENTESIS_DERECHO() { return getToken(BCCParser.TK_PARENTESIS_DERECHO, 0); }
		public ParentesisFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitParentesisFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostFactorContext extends FactorContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_INCREMENTO() { return getToken(BCCParser.TK_INCREMENTO, 0); }
		public TerminalNode TK_DECREMENTO() { return getToken(BCCParser.TK_DECREMENTO, 0); }
		public PostFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPostFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(BOOL);
				}
				break;
			case 3:
				_localctx = new PostFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(ID);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_INCREMENTO || _la==TK_DECREMENTO) {
					{
					setState(266);
					_la = _input.LA(1);
					if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new PreFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_INCREMENTO || _la==TK_DECREMENTO) {
					{
					setState(269);
					_la = _input.LA(1);
					if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(272);
				match(ID);
				}
				break;
			case 5:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				match(ID);
				}
				break;
			case 6:
				_localctx = new ParentesisFactorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(275);
				lexpr();
				setState(276);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 7:
				_localctx = new LlamadoFunctContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(278);
				match(FID);
				setState(279);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PARENTESIS_IZQUIERDO) | (1L << TK_NOT) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << BOOL) | (1L << FID) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(280);
					lexpr();
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMA) {
						{
						{
						setState(281);
						match(TK_COMA);
						setState(282);
						lexpr();
						}
						}
						setState(287);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(290);
				match(TK_PARENTESIS_DERECHO);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0128\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\5\4:\n\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\6\3\6\3\7\3\7\6\7T\n\7"+
		"\r\7\16\7U\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00da\n\b\3\t\3\t\3\t\7"+
		"\t\u00df\n\t\f\t\16\t\u00e2\13\t\3\t\3\t\7\t\u00e6\n\t\f\t\16\t\u00e9"+
		"\13\t\5\t\u00eb\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f3\n\n\3\13\3\13\3"+
		"\13\5\13\u00f8\n\13\3\f\3\f\3\f\7\f\u00fd\n\f\f\f\16\f\u0100\13\f\3\r"+
		"\3\r\3\r\7\r\u0105\n\r\f\r\16\r\u0108\13\r\3\16\3\16\3\16\3\16\5\16\u010e"+
		"\n\16\3\16\5\16\u0111\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u011e\n\16\f\16\16\16\u0121\13\16\5\16\u0123\n\16\3\16"+
		"\5\16\u0126\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\3\2"+
		"\3\4\3\2).\3\2/\60\3\2\61\63\3\2\'(\2\u014c\2\37\3\2\2\2\4$\3\2\2\2\6"+
		"9\3\2\2\2\bC\3\2\2\2\nO\3\2\2\2\fZ\3\2\2\2\16\u00d9\3\2\2\2\20\u00db\3"+
		"\2\2\2\22\u00f2\3\2\2\2\24\u00f4\3\2\2\2\26\u00f9\3\2\2\2\30\u0101\3\2"+
		"\2\2\32\u0125\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3"+
		"\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\5\6\4\2#\3\3\2\2\2$%\7\n"+
		"\2\2%&\7\65\2\2&\'\7\6\2\2\'(\5\n\6\2(*\7\13\2\2)+\5\b\5\2*)\3\2\2\2*"+
		"+\3\2\2\2+,\3\2\2\2,\61\7\f\2\2-.\7\t\2\2./\5\b\5\2/\60\7\b\2\2\60\62"+
		"\3\2\2\2\61-\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\5\f\7\2\64\5\3"+
		"\2\2\2\65\66\7\t\2\2\66\67\5\b\5\2\678\7\b\2\28:\3\2\2\29\65\3\2\2\29"+
		":\3\2\2\2:>\3\2\2\2;=\5\16\b\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?A\3\2\2\2@>\3\2\2\2AB\7\7\2\2B\7\3\2\2\2CD\7\66\2\2DE\7\6\2\2EL\5\n\6"+
		"\2FG\7\5\2\2GH\7\66\2\2HI\7\6\2\2IK\5\n\6\2JF\3\2\2\2KN\3\2\2\2LJ\3\2"+
		"\2\2LM\3\2\2\2M\t\3\2\2\2NL\3\2\2\2OP\t\2\2\2P\13\3\2\2\2QS\7\r\2\2RT"+
		"\5\16\b\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\16\2\2"+
		"X[\3\2\2\2Y[\5\16\b\2ZQ\3\2\2\2ZY\3\2\2\2[\r\3\2\2\2\\]\7\17\2\2]^\5\20"+
		"\t\2^_\7\b\2\2_\u00da\3\2\2\2`a\7\20\2\2ab\7\66\2\2b\u00da\7\b\2\2cd\7"+
		"\21\2\2de\7\13\2\2ef\5\20\t\2fg\7\f\2\2gh\7\22\2\2hi\5\f\7\2i\u00da\3"+
		"\2\2\2jk\7\23\2\2kl\7\13\2\2lm\5\20\t\2mn\7\f\2\2no\7\22\2\2op\5\f\7\2"+
		"pq\7\24\2\2qr\5\f\7\2r\u00da\3\2\2\2st\7\25\2\2tu\7\13\2\2uv\5\20\t\2"+
		"vw\7\f\2\2wx\7\22\2\2xy\5\f\7\2y\u00da\3\2\2\2z{\7\26\2\2{|\7\13\2\2|"+
		"}\5\20\t\2}~\7\f\2\2~\177\7\22\2\2\177\u0080\5\f\7\2\u0080\u00da\3\2\2"+
		"\2\u0081\u0082\7\27\2\2\u0082\u0083\5\20\t\2\u0083\u0084\7\b\2\2\u0084"+
		"\u00da\3\2\2\2\u0085\u0086\7\30\2\2\u0086\u0087\7\13\2\2\u0087\u0088\5"+
		"\20\t\2\u0088\u0089\7\f\2\2\u0089\u008a\7\22\2\2\u008a\u008b\5\f\7\2\u008b"+
		"\u00da\3\2\2\2\u008c\u008d\7\36\2\2\u008d\u00da\5\f\7\2\u008e\u008f\7"+
		"\22\2\2\u008f\u0090\5\f\7\2\u0090\u0091\7\26\2\2\u0091\u0092\7\13\2\2"+
		"\u0092\u0093\5\20\t\2\u0093\u0094\7\f\2\2\u0094\u00da\3\2\2\2\u0095\u0096"+
		"\7\22\2\2\u0096\u0097\5\f\7\2\u0097\u0098\7\30\2\2\u0098\u0099\7\13\2"+
		"\2\u0099\u009a\5\20\t\2\u009a\u009b\7\f\2\2\u009b\u00da\3\2\2\2\u009c"+
		"\u009d\7\31\2\2\u009d\u009e\7\4\2\2\u009e\u009f\7\b\2\2\u009f\u00da\5"+
		"\f\7\2\u00a0\u00a1\7\37\2\2\u00a1\u00a2\7\13\2\2\u00a2\u00a3\5\20\t\2"+
		"\u00a3\u00a4\7\b\2\2\u00a4\u00a5\5\20\t\2\u00a5\u00a6\7\b\2\2\u00a6\u00a7"+
		"\5\20\t\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\7\22\2\2\u00a9\u00aa\5\f\7\2"+
		"\u00aa\u00da\3\2\2\2\u00ab\u00ac\7\32\2\2\u00ac\u00da\7\b\2\2\u00ad\u00ae"+
		"\7\33\2\2\u00ae\u00da\7\b\2\2\u00af\u00b0\7\66\2\2\u00b0\u00b1\7!\2\2"+
		"\u00b1\u00b2\5\20\t\2\u00b2\u00b3\7\b\2\2\u00b3\u00da\3\2\2\2\u00b4\u00b5"+
		"\7\66\2\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00b8\7\b\2\2"+
		"\u00b8\u00da\3\2\2\2\u00b9\u00ba\7\66\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bc"+
		"\5\20\t\2\u00bc\u00bd\7\b\2\2\u00bd\u00da\3\2\2\2\u00be\u00bf\7\66\2\2"+
		"\u00bf\u00c0\7$\2\2\u00c0\u00c1\5\20\t\2\u00c1\u00c2\7\b\2\2\u00c2\u00da"+
		"\3\2\2\2\u00c3\u00c4\7\66\2\2\u00c4\u00c5\7%\2\2\u00c5\u00c6\5\20\t\2"+
		"\u00c6\u00c7\7\b\2\2\u00c7\u00da\3\2\2\2\u00c8\u00c9\7\66\2\2\u00c9\u00ca"+
		"\7&\2\2\u00ca\u00cb\5\20\t\2\u00cb\u00cc\7\b\2\2\u00cc\u00da\3\2\2\2\u00cd"+
		"\u00ce\7\66\2\2\u00ce\u00cf\7\'\2\2\u00cf\u00da\7\b\2\2\u00d0\u00d1\7"+
		"\66\2\2\u00d1\u00d2\7(\2\2\u00d2\u00da\7\b\2\2\u00d3\u00d4\7\'\2\2\u00d4"+
		"\u00d5\7\66\2\2\u00d5\u00da\7\b\2\2\u00d6\u00d7\7(\2\2\u00d7\u00d8\7\66"+
		"\2\2\u00d8\u00da\7\b\2\2\u00d9\\\3\2\2\2\u00d9`\3\2\2\2\u00d9c\3\2\2\2"+
		"\u00d9j\3\2\2\2\u00d9s\3\2\2\2\u00d9z\3\2\2\2\u00d9\u0081\3\2\2\2\u00d9"+
		"\u0085\3\2\2\2\u00d9\u008c\3\2\2\2\u00d9\u008e\3\2\2\2\u00d9\u0095\3\2"+
		"\2\2\u00d9\u009c\3\2\2\2\u00d9\u00a0\3\2\2\2\u00d9\u00ab\3\2\2\2\u00d9"+
		"\u00ad\3\2\2\2\u00d9\u00af\3\2\2\2\u00d9\u00b4\3\2\2\2\u00d9\u00b9\3\2"+
		"\2\2\u00d9\u00be\3\2\2\2\u00d9\u00c3\3\2\2\2\u00d9\u00c8\3\2\2\2\u00d9"+
		"\u00cd\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d6\3\2"+
		"\2\2\u00da\17\3\2\2\2\u00db\u00ea\5\22\n\2\u00dc\u00dd\7\34\2\2\u00dd"+
		"\u00df\5\22\n\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00eb\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\7\35\2\2\u00e4\u00e6\5\22\n\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00e0\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\21\3\2\2\2\u00ec\u00ed\7 \2\2\u00ed\u00ee\7\13\2\2\u00ee\u00ef"+
		"\5\20\t\2\u00ef\u00f0\7\f\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f3\5\24\13"+
		"\2\u00f2\u00ec\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\23\3\2\2\2\u00f4\u00f7"+
		"\5\26\f\2\u00f5\u00f6\t\3\2\2\u00f6\u00f8\5\26\f\2\u00f7\u00f5\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\25\3\2\2\2\u00f9\u00fe\5\30\r\2\u00fa\u00fb"+
		"\t\4\2\2\u00fb\u00fd\5\30\r\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\27\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0101\u0106\5\32\16\2\u0102\u0103\t\5\2\2\u0103\u0105\5\32\16"+
		"\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\31\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0126\7\67\2\2\u010a"+
		"\u0126\7\64\2\2\u010b\u010d\7\66\2\2\u010c\u010e\t\6\2\2\u010d\u010c\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u0126\3\2\2\2\u010f\u0111\t\6\2\2\u0110"+
		"\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0126\7\66"+
		"\2\2\u0113\u0126\7\66\2\2\u0114\u0115\7\13\2\2\u0115\u0116\5\20\t\2\u0116"+
		"\u0117\7\f\2\2\u0117\u0126\3\2\2\2\u0118\u0119\7\65\2\2\u0119\u0122\7"+
		"\13\2\2\u011a\u011f\5\20\t\2\u011b\u011c\7\5\2\2\u011c\u011e\5\20\t\2"+
		"\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u011a\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\7\f\2\2\u0125\u0109\3\2"+
		"\2\2\u0125\u010a\3\2\2\2\u0125\u010b\3\2\2\2\u0125\u0110\3\2\2\2\u0125"+
		"\u0113\3\2\2\2\u0125\u0114\3\2\2\2\u0125\u0118\3\2\2\2\u0126\33\3\2\2"+
		"\2\27\37*\619>LUZ\u00d9\u00e0\u00e7\u00ea\u00f2\u00f7\u00fe\u0106\u010d"+
		"\u0110\u011f\u0122\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}