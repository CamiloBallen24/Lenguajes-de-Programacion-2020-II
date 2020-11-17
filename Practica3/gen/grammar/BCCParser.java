// Generated from D:/Repositorios/Lenguajes-de-Programacion-2020-II/Practica3/grammar\BCC.g4 by ANTLR 4.8
package grammar;
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
		NUM=53, COMMENT=54, ESP=55;
	public static final int
		RULE_prog = 0, RULE_fn_decl_list = 1, RULE_main_prog = 2, RULE_var_decl = 3, 
		RULE_data_type = 4, RULE_stmt_block = 5, RULE_stmt = 6, RULE_lexpr = 7, 
		RULE_nexpr = 8, RULE_rexpr = 9, RULE_rexpr_operator = 10, RULE_simple_expr = 11, 
		RULE_simple_expr_operator = 12, RULE_term = 13, RULE_term_operator = 14, 
		RULE_factor = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fn_decl_list", "main_prog", "var_decl", "data_type", "stmt_block", 
			"stmt", "lexpr", "nexpr", "rexpr", "rexpr_operator", "simple_expr", "simple_expr_operator", 
			"term", "term_operator", "factor"
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
			"TK_DIVISION", "TK_MODULO", "BOOL", "FID", "ID", "NUM", "COMMENT", "ESP"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitProg(this);
		}
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_FUNCTION) {
				{
				{
				setState(32);
				fn_decl_list();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterFn_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitFn_decl_list(this);
		}
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
			setState(40);
			match(TK_FUNCTION);
			setState(41);
			match(FID);
			setState(42);
			match(TK_DOS_PUNTOS);
			setState(43);
			data_type();
			setState(44);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(45);
				((Fn_decl_listContext)_localctx).parametros = var_decl();
				}
			}

			setState(48);
			match(TK_PARENTESIS_DERECHO);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VAR) {
				{
				setState(49);
				match(TK_VAR);
				setState(50);
				((Fn_decl_listContext)_localctx).variables = var_decl();
				setState(51);
				match(TK_PUNTO_Y_COMA);
				}
			}

			setState(55);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterMain_prog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitMain_prog(this);
		}
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VAR) {
				{
				setState(57);
				match(TK_VAR);
				setState(58);
				var_decl();
				setState(59);
				match(TK_PUNTO_Y_COMA);
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRINT) | (1L << TK_INPUT) | (1L << TK_WHEN) | (1L << TK_DO) | (1L << TK_IF) | (1L << TK_UNLESS) | (1L << TK_WHILE) | (1L << TK_RETURN) | (1L << TK_UNTIL) | (1L << TK_REPEAT) | (1L << TK_NEXT) | (1L << TK_BREAK) | (1L << TK_LOOP) | (1L << TK_FOR) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << ID))) != 0)) {
				{
				{
				setState(63);
				stmt();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitVar_decl(this);
		}
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
			setState(71);
			match(ID);
			setState(72);
			match(TK_DOS_PUNTOS);
			setState(73);
			data_type();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(74);
				match(TK_COMA);
				setState(75);
				match(ID);
				setState(76);
				match(TK_DOS_PUNTOS);
				setState(77);
				data_type();
				}
				}
				setState(82);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitData_type(this);
		}
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
			setState(83);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterStmt_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitStmt_block(this);
		}
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
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CORCHETE_IZQUIERDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(TK_CORCHETE_IZQUIERDO);
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(86);
					stmt();
					}
					}
					setState(89); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRINT) | (1L << TK_INPUT) | (1L << TK_WHEN) | (1L << TK_DO) | (1L << TK_IF) | (1L << TK_UNLESS) | (1L << TK_WHILE) | (1L << TK_RETURN) | (1L << TK_UNTIL) | (1L << TK_REPEAT) | (1L << TK_NEXT) | (1L << TK_BREAK) | (1L << TK_LOOP) | (1L << TK_FOR) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << ID))) != 0) );
				setState(91);
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
				setState(93);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitNext(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitAsignacion(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterSumaIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitSumaIgual(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPreIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPreIncremento(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitFor(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitWhile(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitWhen(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterUnless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitUnless(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatContext extends StmtContext {
		public TerminalNode TK_REPEAT() { return getToken(BCCParser.TK_REPEAT, 0); }
		public TerminalNode NUM() { return getToken(BCCParser.NUM, 0); }
		public TerminalNode TK_DOS_PUNTOS() { return getToken(BCCParser.TK_DOS_PUNTOS, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public RepeatContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitRepeat(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterProductoIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitProductoIgual(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPostDecremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPostDecremento(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterRestaIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitRestaIgual(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitIf(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPostIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPostIncremento(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitBreak(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterDoUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitDoUntil(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitInput(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterModuloIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitModuloIgual(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPreDecremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPreDecremento(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPrint(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitDoWhile(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterDivisionIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitDivisionIgual(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitUntil(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitReturn(this);
		}
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
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(TK_PRINT);
				setState(97);
				lexpr();
				setState(98);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 2:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(TK_INPUT);
				setState(101);
				match(ID);
				setState(102);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 3:
				_localctx = new WhenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(TK_WHEN);
				setState(104);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(105);
				lexpr();
				setState(106);
				match(TK_PARENTESIS_DERECHO);
				setState(107);
				match(TK_DO);
				setState(108);
				stmt_block();
				}
				break;
			case 4:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(TK_IF);
				setState(111);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(112);
				lexpr();
				setState(113);
				match(TK_PARENTESIS_DERECHO);
				setState(114);
				match(TK_DO);
				setState(115);
				stmt_block();
				setState(116);
				match(TK_ELSE);
				setState(117);
				stmt_block();
				}
				break;
			case 5:
				_localctx = new UnlessContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				match(TK_UNLESS);
				setState(120);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(121);
				lexpr();
				setState(122);
				match(TK_PARENTESIS_DERECHO);
				setState(123);
				match(TK_DO);
				setState(124);
				stmt_block();
				}
				break;
			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				match(TK_WHILE);
				setState(127);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(128);
				lexpr();
				setState(129);
				match(TK_PARENTESIS_DERECHO);
				setState(130);
				match(TK_DO);
				setState(131);
				stmt_block();
				}
				break;
			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				match(TK_RETURN);
				setState(134);
				lexpr();
				setState(135);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 8:
				_localctx = new UntilContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				match(TK_UNTIL);
				setState(138);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(139);
				lexpr();
				setState(140);
				match(TK_PARENTESIS_DERECHO);
				setState(141);
				match(TK_DO);
				setState(142);
				stmt_block();
				}
				break;
			case 9:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(144);
				match(TK_LOOP);
				setState(145);
				stmt_block();
				}
				break;
			case 10:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(146);
				match(TK_DO);
				setState(147);
				stmt_block();
				setState(148);
				match(TK_WHILE);
				setState(149);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(150);
				lexpr();
				setState(151);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 11:
				_localctx = new DoUntilContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(153);
				match(TK_DO);
				setState(154);
				stmt_block();
				setState(155);
				match(TK_UNTIL);
				setState(156);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(157);
				lexpr();
				setState(158);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 12:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(160);
				match(TK_REPEAT);
				setState(161);
				match(NUM);
				setState(162);
				match(TK_DOS_PUNTOS);
				setState(163);
				stmt_block();
				}
				break;
			case 13:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(164);
				match(TK_FOR);
				setState(165);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(166);
				lexpr();
				setState(167);
				match(TK_PUNTO_Y_COMA);
				setState(168);
				lexpr();
				setState(169);
				match(TK_PUNTO_Y_COMA);
				setState(170);
				lexpr();
				setState(171);
				match(TK_PARENTESIS_DERECHO);
				setState(172);
				match(TK_DO);
				setState(173);
				stmt_block();
				}
				break;
			case 14:
				_localctx = new NextContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(175);
				match(TK_NEXT);
				setState(176);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 15:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(177);
				match(TK_BREAK);
				setState(178);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 16:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(179);
				match(ID);
				setState(180);
				match(TK_ASIGNACION);
				setState(181);
				lexpr();
				setState(182);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 17:
				_localctx = new SumaIgualContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(184);
				match(ID);
				setState(185);
				match(TK_SUMA_IGUAL);
				setState(186);
				lexpr();
				setState(187);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 18:
				_localctx = new RestaIgualContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(189);
				match(ID);
				setState(190);
				match(TK_RESTA_IGUAL);
				setState(191);
				lexpr();
				setState(192);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 19:
				_localctx = new ProductoIgualContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(194);
				match(ID);
				setState(195);
				match(TK_PRODUCTO_IGUAL);
				setState(196);
				lexpr();
				setState(197);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 20:
				_localctx = new DivisionIgualContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(199);
				match(ID);
				setState(200);
				match(TK_DIVISION_IGUAL);
				setState(201);
				lexpr();
				setState(202);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 21:
				_localctx = new ModuloIgualContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(204);
				match(ID);
				setState(205);
				match(TK_MODULO_IGUAL);
				setState(206);
				lexpr();
				setState(207);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 22:
				_localctx = new PostIncrementoContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(209);
				match(ID);
				setState(210);
				match(TK_INCREMENTO);
				setState(211);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 23:
				_localctx = new PostDecrementoContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(212);
				match(ID);
				setState(213);
				match(TK_DECREMENTO);
				setState(214);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 24:
				_localctx = new PreIncrementoContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(215);
				match(TK_INCREMENTO);
				setState(216);
				match(ID);
				setState(217);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 25:
				_localctx = new PreDecrementoContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(218);
				match(TK_DECREMENTO);
				setState(219);
				match(ID);
				setState(220);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterLexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitLexpr(this);
		}
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
			setState(223);
			nexpr();
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_AND) {
					{
					{
					setState(224);
					match(TK_AND);
					setState(225);
					nexpr();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_OR) {
					{
					{
					setState(231);
					match(TK_OR);
					setState(232);
					nexpr();
					}
					}
					setState(237);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterNexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitNexpr(this);
		}
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
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(TK_NOT);
				setState(241);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(242);
				lexpr();
				setState(243);
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
				setState(245);
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
		public Rexpr_operatorContext rexpr_operator() {
			return getRuleContext(Rexpr_operatorContext.class,0);
		}
		public RexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterRexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitRexpr(this);
		}
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
			setState(248);
			simple_expr();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MAYOR) | (1L << TK_IGUAL) | (1L << TK_DIFERENTE) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL))) != 0)) {
				{
				setState(249);
				rexpr_operator();
				setState(250);
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

	public static class Rexpr_operatorContext extends ParserRuleContext {
		public TerminalNode TK_MAYOR() { return getToken(BCCParser.TK_MAYOR, 0); }
		public TerminalNode TK_MENOR() { return getToken(BCCParser.TK_MENOR, 0); }
		public TerminalNode TK_IGUAL() { return getToken(BCCParser.TK_IGUAL, 0); }
		public TerminalNode TK_DIFERENTE() { return getToken(BCCParser.TK_DIFERENTE, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(BCCParser.TK_MAYOR_IGUAL, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(BCCParser.TK_MENOR_IGUAL, 0); }
		public Rexpr_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexpr_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterRexpr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitRexpr_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitRexpr_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rexpr_operatorContext rexpr_operator() throws RecognitionException {
		Rexpr_operatorContext _localctx = new Rexpr_operatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rexpr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MAYOR) | (1L << TK_IGUAL) | (1L << TK_DIFERENTE) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL))) != 0)) ) {
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

	public static class Simple_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Simple_expr_operatorContext> simple_expr_operator() {
			return getRuleContexts(Simple_expr_operatorContext.class);
		}
		public Simple_expr_operatorContext simple_expr_operator(int i) {
			return getRuleContext(Simple_expr_operatorContext.class,i);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterSimple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitSimple_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simple_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			term();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SUMA || _la==TK_RESTA) {
				{
				{
				setState(257);
				simple_expr_operator();
				setState(258);
				term();
				}
				}
				setState(264);
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

	public static class Simple_expr_operatorContext extends ParserRuleContext {
		public TerminalNode TK_SUMA() { return getToken(BCCParser.TK_SUMA, 0); }
		public TerminalNode TK_RESTA() { return getToken(BCCParser.TK_RESTA, 0); }
		public Simple_expr_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterSimple_expr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitSimple_expr_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitSimple_expr_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expr_operatorContext simple_expr_operator() throws RecognitionException {
		Simple_expr_operatorContext _localctx = new Simple_expr_operatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simple_expr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==TK_SUMA || _la==TK_RESTA) ) {
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext initialfactor;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Term_operatorContext> term_operator() {
			return getRuleContexts(Term_operatorContext.class);
		}
		public Term_operatorContext term_operator(int i) {
			return getRuleContext(Term_operatorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(267);
			((TermContext)_localctx).initialfactor = factor();
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRODUCTO) | (1L << TK_DIVISION) | (1L << TK_MODULO))) != 0)) {
				{
				{
				setState(268);
				term_operator();
				setState(269);
				factor();
				}
				}
				setState(275);
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

	public static class Term_operatorContext extends ParserRuleContext {
		public TerminalNode TK_PRODUCTO() { return getToken(BCCParser.TK_PRODUCTO, 0); }
		public TerminalNode TK_DIVISION() { return getToken(BCCParser.TK_DIVISION, 0); }
		public TerminalNode TK_MODULO() { return getToken(BCCParser.TK_MODULO, 0); }
		public Term_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterTerm_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitTerm_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitTerm_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_operatorContext term_operator() throws RecognitionException {
		Term_operatorContext _localctx = new Term_operatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRODUCTO) | (1L << TK_DIVISION) | (1L << TK_MODULO))) != 0)) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterLlamadoFunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitLlamadoFunct(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitBool(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPreFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPreFactor(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitNum(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitVariable(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterParentesisFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitParentesisFactor(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPostFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPostFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPostFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(BOOL);
				}
				break;
			case 3:
				_localctx = new PostFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(ID);
				setState(281);
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
				break;
			case 4:
				_localctx = new PreFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(283);
				match(ID);
				}
				break;
			case 5:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(ID);
				}
				break;
			case 6:
				_localctx = new ParentesisFactorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(286);
				lexpr();
				setState(287);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 7:
				_localctx = new LlamadoFunctContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(289);
				match(FID);
				setState(290);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PARENTESIS_IZQUIERDO) | (1L << TK_NOT) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << BOOL) | (1L << FID) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(291);
					lexpr();
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMA) {
						{
						{
						setState(292);
						match(TK_COMA);
						setState(293);
						lexpr();
						}
						}
						setState(298);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(301);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0133\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\38\n\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\7\4C\n\4\f"+
		"\4\16\4F\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5T\13"+
		"\5\3\6\3\6\3\7\3\7\6\7Z\n\7\r\7\16\7[\3\7\3\7\3\7\5\7a\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00e0\n\b\3\t\3\t\3\t\7\t\u00e5\n\t\f\t\16\t\u00e8\13\t\3\t\3\t\7\t"+
		"\u00ec\n\t\f\t\16\t\u00ef\13\t\5\t\u00f1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00f9\n\n\3\13\3\13\3\13\3\13\5\13\u00ff\n\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\7\r\u0107\n\r\f\r\16\r\u010a\13\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17"+
		"\u0112\n\17\f\17\16\17\u0115\13\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0129\n\21"+
		"\f\21\16\21\u012c\13\21\5\21\u012e\n\21\3\21\5\21\u0131\n\21\3\21\2\2"+
		"\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\7\3\2\3\4\3\2).\3\2/\60"+
		"\3\2\61\63\3\2\'(\2\u0152\2%\3\2\2\2\4*\3\2\2\2\6?\3\2\2\2\bI\3\2\2\2"+
		"\nU\3\2\2\2\f`\3\2\2\2\16\u00df\3\2\2\2\20\u00e1\3\2\2\2\22\u00f8\3\2"+
		"\2\2\24\u00fa\3\2\2\2\26\u0100\3\2\2\2\30\u0102\3\2\2\2\32\u010b\3\2\2"+
		"\2\34\u010d\3\2\2\2\36\u0116\3\2\2\2 \u0130\3\2\2\2\"$\5\4\3\2#\"\3\2"+
		"\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\5\6\4\2)\3"+
		"\3\2\2\2*+\7\n\2\2+,\7\65\2\2,-\7\6\2\2-.\5\n\6\2.\60\7\13\2\2/\61\5\b"+
		"\5\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\67\7\f\2\2\63\64\7\t\2"+
		"\2\64\65\5\b\5\2\65\66\7\b\2\2\668\3\2\2\2\67\63\3\2\2\2\678\3\2\2\28"+
		"9\3\2\2\29:\5\f\7\2:\5\3\2\2\2;<\7\t\2\2<=\5\b\5\2=>\7\b\2\2>@\3\2\2\2"+
		"?;\3\2\2\2?@\3\2\2\2@D\3\2\2\2AC\5\16\b\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2"+
		"\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\7\2\2H\7\3\2\2\2IJ\7\66\2\2JK\7\6"+
		"\2\2KR\5\n\6\2LM\7\5\2\2MN\7\66\2\2NO\7\6\2\2OQ\5\n\6\2PL\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2S\t\3\2\2\2TR\3\2\2\2UV\t\2\2\2V\13\3\2\2\2"+
		"WY\7\r\2\2XZ\5\16\b\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2"+
		"\2\2]^\7\16\2\2^a\3\2\2\2_a\5\16\b\2`W\3\2\2\2`_\3\2\2\2a\r\3\2\2\2bc"+
		"\7\17\2\2cd\5\20\t\2de\7\b\2\2e\u00e0\3\2\2\2fg\7\20\2\2gh\7\66\2\2h\u00e0"+
		"\7\b\2\2ij\7\21\2\2jk\7\13\2\2kl\5\20\t\2lm\7\f\2\2mn\7\22\2\2no\5\f\7"+
		"\2o\u00e0\3\2\2\2pq\7\23\2\2qr\7\13\2\2rs\5\20\t\2st\7\f\2\2tu\7\22\2"+
		"\2uv\5\f\7\2vw\7\24\2\2wx\5\f\7\2x\u00e0\3\2\2\2yz\7\25\2\2z{\7\13\2\2"+
		"{|\5\20\t\2|}\7\f\2\2}~\7\22\2\2~\177\5\f\7\2\177\u00e0\3\2\2\2\u0080"+
		"\u0081\7\26\2\2\u0081\u0082\7\13\2\2\u0082\u0083\5\20\t\2\u0083\u0084"+
		"\7\f\2\2\u0084\u0085\7\22\2\2\u0085\u0086\5\f\7\2\u0086\u00e0\3\2\2\2"+
		"\u0087\u0088\7\27\2\2\u0088\u0089\5\20\t\2\u0089\u008a\7\b\2\2\u008a\u00e0"+
		"\3\2\2\2\u008b\u008c\7\30\2\2\u008c\u008d\7\13\2\2\u008d\u008e\5\20\t"+
		"\2\u008e\u008f\7\f\2\2\u008f\u0090\7\22\2\2\u0090\u0091\5\f\7\2\u0091"+
		"\u00e0\3\2\2\2\u0092\u0093\7\36\2\2\u0093\u00e0\5\f\7\2\u0094\u0095\7"+
		"\22\2\2\u0095\u0096\5\f\7\2\u0096\u0097\7\26\2\2\u0097\u0098\7\13\2\2"+
		"\u0098\u0099\5\20\t\2\u0099\u009a\7\f\2\2\u009a\u00e0\3\2\2\2\u009b\u009c"+
		"\7\22\2\2\u009c\u009d\5\f\7\2\u009d\u009e\7\30\2\2\u009e\u009f\7\13\2"+
		"\2\u009f\u00a0\5\20\t\2\u00a0\u00a1\7\f\2\2\u00a1\u00e0\3\2\2\2\u00a2"+
		"\u00a3\7\31\2\2\u00a3\u00a4\7\67\2\2\u00a4\u00a5\7\6\2\2\u00a5\u00e0\5"+
		"\f\7\2\u00a6\u00a7\7\37\2\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9\5\20\t\2"+
		"\u00a9\u00aa\7\b\2\2\u00aa\u00ab\5\20\t\2\u00ab\u00ac\7\b\2\2\u00ac\u00ad"+
		"\5\20\t\2\u00ad\u00ae\7\f\2\2\u00ae\u00af\7\22\2\2\u00af\u00b0\5\f\7\2"+
		"\u00b0\u00e0\3\2\2\2\u00b1\u00b2\7\32\2\2\u00b2\u00e0\7\b\2\2\u00b3\u00b4"+
		"\7\33\2\2\u00b4\u00e0\7\b\2\2\u00b5\u00b6\7\66\2\2\u00b6\u00b7\7!\2\2"+
		"\u00b7\u00b8\5\20\t\2\u00b8\u00b9\7\b\2\2\u00b9\u00e0\3\2\2\2\u00ba\u00bb"+
		"\7\66\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\7\b\2\2"+
		"\u00be\u00e0\3\2\2\2\u00bf\u00c0\7\66\2\2\u00c0\u00c1\7#\2\2\u00c1\u00c2"+
		"\5\20\t\2\u00c2\u00c3\7\b\2\2\u00c3\u00e0\3\2\2\2\u00c4\u00c5\7\66\2\2"+
		"\u00c5\u00c6\7$\2\2\u00c6\u00c7\5\20\t\2\u00c7\u00c8\7\b\2\2\u00c8\u00e0"+
		"\3\2\2\2\u00c9\u00ca\7\66\2\2\u00ca\u00cb\7%\2\2\u00cb\u00cc\5\20\t\2"+
		"\u00cc\u00cd\7\b\2\2\u00cd\u00e0\3\2\2\2\u00ce\u00cf\7\66\2\2\u00cf\u00d0"+
		"\7&\2\2\u00d0\u00d1\5\20\t\2\u00d1\u00d2\7\b\2\2\u00d2\u00e0\3\2\2\2\u00d3"+
		"\u00d4\7\66\2\2\u00d4\u00d5\7\'\2\2\u00d5\u00e0\7\b\2\2\u00d6\u00d7\7"+
		"\66\2\2\u00d7\u00d8\7(\2\2\u00d8\u00e0\7\b\2\2\u00d9\u00da\7\'\2\2\u00da"+
		"\u00db\7\66\2\2\u00db\u00e0\7\b\2\2\u00dc\u00dd\7(\2\2\u00dd\u00de\7\66"+
		"\2\2\u00de\u00e0\7\b\2\2\u00dfb\3\2\2\2\u00dff\3\2\2\2\u00dfi\3\2\2\2"+
		"\u00dfp\3\2\2\2\u00dfy\3\2\2\2\u00df\u0080\3\2\2\2\u00df\u0087\3\2\2\2"+
		"\u00df\u008b\3\2\2\2\u00df\u0092\3\2\2\2\u00df\u0094\3\2\2\2\u00df\u009b"+
		"\3\2\2\2\u00df\u00a2\3\2\2\2\u00df\u00a6\3\2\2\2\u00df\u00b1\3\2\2\2\u00df"+
		"\u00b3\3\2\2\2\u00df\u00b5\3\2\2\2\u00df\u00ba\3\2\2\2\u00df\u00bf\3\2"+
		"\2\2\u00df\u00c4\3\2\2\2\u00df\u00c9\3\2\2\2\u00df\u00ce\3\2\2\2\u00df"+
		"\u00d3\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00dc\3\2"+
		"\2\2\u00e0\17\3\2\2\2\u00e1\u00f0\5\22\n\2\u00e2\u00e3\7\34\2\2\u00e3"+
		"\u00e5\5\22\n\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00f1\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ea\7\35\2\2\u00ea\u00ec\5\22\n\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3"+
		"\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\21\3\2\2\2\u00f2\u00f3\7 \2\2\u00f3\u00f4\7\13\2\2\u00f4\u00f5"+
		"\5\20\t\2\u00f5\u00f6\7\f\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f9\5\24\13"+
		"\2\u00f8\u00f2\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\23\3\2\2\2\u00fa\u00fe"+
		"\5\30\r\2\u00fb\u00fc\5\26\f\2\u00fc\u00fd\5\30\r\2\u00fd\u00ff\3\2\2"+
		"\2\u00fe\u00fb\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\25\3\2\2\2\u0100\u0101"+
		"\t\3\2\2\u0101\27\3\2\2\2\u0102\u0108\5\34\17\2\u0103\u0104\5\32\16\2"+
		"\u0104\u0105\5\34\17\2\u0105\u0107\3\2\2\2\u0106\u0103\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\31\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010c\t\4\2\2\u010c\33\3\2\2\2\u010d\u0113\5 \21"+
		"\2\u010e\u010f\5\36\20\2\u010f\u0110\5 \21\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010e\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\35\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\t\5\2\2\u0117\37"+
		"\3\2\2\2\u0118\u0131\7\67\2\2\u0119\u0131\7\64\2\2\u011a\u011b\7\66\2"+
		"\2\u011b\u0131\t\6\2\2\u011c\u011d\t\6\2\2\u011d\u0131\7\66\2\2\u011e"+
		"\u0131\7\66\2\2\u011f\u0120\7\13\2\2\u0120\u0121\5\20\t\2\u0121\u0122"+
		"\7\f\2\2\u0122\u0131\3\2\2\2\u0123\u0124\7\65\2\2\u0124\u012d\7\13\2\2"+
		"\u0125\u012a\5\20\t\2\u0126\u0127\7\5\2\2\u0127\u0129\5\20\t\2\u0128\u0126"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0131\7\f\2\2\u0130\u0118\3\2\2\2\u0130"+
		"\u0119\3\2\2\2\u0130\u011a\3\2\2\2\u0130\u011c\3\2\2\2\u0130\u011e\3\2"+
		"\2\2\u0130\u011f\3\2\2\2\u0130\u0123\3\2\2\2\u0131!\3\2\2\2\25%\60\67"+
		"?DR[`\u00df\u00e6\u00ed\u00f0\u00f8\u00fe\u0108\u0113\u012a\u012d\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}