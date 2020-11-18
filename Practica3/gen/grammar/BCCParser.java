// Generated from D:/Documents/Julian/Unal/2020-2/Lenguajes de Programación/Lenguajes-de-Programacion-2020-II/Practica3/grammar\BCC.g4 by ANTLR 4.8
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
		RULE_data_type = 4, RULE_stmt_block = 5, RULE_stmt = 6, RULE_for_edit = 7, 
		RULE_asignacion = 8, RULE_sumaIgual = 9, RULE_restaIgual = 10, RULE_productoIgual = 11, 
		RULE_divisionIgual = 12, RULE_moduloIgual = 13, RULE_postIncremento = 14, 
		RULE_postDecremento = 15, RULE_preIncremento = 16, RULE_preDecremento = 17, 
		RULE_lexpr = 18, RULE_nexpr = 19, RULE_rexpr = 20, RULE_rexpr_operator = 21, 
		RULE_simple_expr = 22, RULE_simple_expr_operator = 23, RULE_term = 24, 
		RULE_term_operator = 25, RULE_factor = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fn_decl_list", "main_prog", "var_decl", "data_type", "stmt_block", 
			"stmt", "for_edit", "asignacion", "sumaIgual", "restaIgual", "productoIgual", 
			"divisionIgual", "moduloIgual", "postIncremento", "postDecremento", "preIncremento", 
			"preDecremento", "lexpr", "nexpr", "rexpr", "rexpr_operator", "simple_expr", 
			"simple_expr_operator", "term", "term_operator", "factor"
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_FUNCTION) {
				{
				{
				setState(54);
				fn_decl_list();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
			setState(62);
			match(TK_FUNCTION);
			setState(63);
			match(FID);
			setState(64);
			match(TK_DOS_PUNTOS);
			setState(65);
			data_type();
			setState(66);
			match(TK_PARENTESIS_IZQUIERDO);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(67);
				((Fn_decl_listContext)_localctx).parametros = var_decl();
				}
			}

			setState(70);
			match(TK_PARENTESIS_DERECHO);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VAR) {
				{
				setState(71);
				match(TK_VAR);
				setState(72);
				((Fn_decl_listContext)_localctx).variables = var_decl();
				setState(73);
				match(TK_PUNTO_Y_COMA);
				}
			}

			setState(77);
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_VAR) {
				{
				setState(79);
				match(TK_VAR);
				setState(80);
				var_decl();
				setState(81);
				match(TK_PUNTO_Y_COMA);
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRINT) | (1L << TK_INPUT) | (1L << TK_WHEN) | (1L << TK_DO) | (1L << TK_IF) | (1L << TK_UNLESS) | (1L << TK_WHILE) | (1L << TK_RETURN) | (1L << TK_UNTIL) | (1L << TK_REPEAT) | (1L << TK_NEXT) | (1L << TK_BREAK) | (1L << TK_LOOP) | (1L << TK_FOR) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << ID))) != 0)) {
				{
				{
				setState(85);
				stmt();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
			setState(93);
			match(ID);
			setState(94);
			match(TK_DOS_PUNTOS);
			setState(95);
			data_type();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(96);
				match(TK_COMA);
				setState(97);
				match(ID);
				setState(98);
				match(TK_DOS_PUNTOS);
				setState(99);
				data_type();
				}
				}
				setState(104);
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
			setState(105);
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
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CORCHETE_IZQUIERDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(TK_CORCHETE_IZQUIERDO);
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(108);
					stmt();
					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRINT) | (1L << TK_INPUT) | (1L << TK_WHEN) | (1L << TK_DO) | (1L << TK_IF) | (1L << TK_UNLESS) | (1L << TK_WHILE) | (1L << TK_RETURN) | (1L << TK_UNTIL) | (1L << TK_REPEAT) | (1L << TK_NEXT) | (1L << TK_BREAK) | (1L << TK_LOOP) | (1L << TK_FOR) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << ID))) != 0) );
				setState(113);
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
				setState(115);
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
	public static class SumaIgualStmtContext extends StmtContext {
		public SumaIgualContext sumaIgual() {
			return getRuleContext(SumaIgualContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public SumaIgualStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterSumaIgualStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitSumaIgualStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitSumaIgualStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProductoIgualStmtContext extends StmtContext {
		public ProductoIgualContext productoIgual() {
			return getRuleContext(ProductoIgualContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public ProductoIgualStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterProductoIgualStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitProductoIgualStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitProductoIgualStmt(this);
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
	public static class ForContext extends StmtContext {
		public TerminalNode TK_FOR() { return getToken(BCCParser.TK_FOR, 0); }
		public TerminalNode TK_PARENTESIS_IZQUIERDO() { return getToken(BCCParser.TK_PARENTESIS_IZQUIERDO, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<TerminalNode> TK_PUNTO_Y_COMA() { return getTokens(BCCParser.TK_PUNTO_Y_COMA); }
		public TerminalNode TK_PUNTO_Y_COMA(int i) {
			return getToken(BCCParser.TK_PUNTO_Y_COMA, i);
		}
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public For_editContext for_edit() {
			return getRuleContext(For_editContext.class,0);
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
	public static class PreIncrementoStmtContext extends StmtContext {
		public PreIncrementoContext preIncremento() {
			return getRuleContext(PreIncrementoContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public PreIncrementoStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPreIncrementoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPreIncrementoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPreIncrementoStmt(this);
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
	public static class PostDecrementoStmtContext extends StmtContext {
		public PostDecrementoContext postDecremento() {
			return getRuleContext(PostDecrementoContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public PostDecrementoStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPostDecrementoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPostDecrementoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPostDecrementoStmt(this);
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
	public static class RestaIgualStmtContext extends StmtContext {
		public RestaIgualContext restaIgual() {
			return getRuleContext(RestaIgualContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public RestaIgualStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterRestaIgualStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitRestaIgualStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitRestaIgualStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncrementoStmtContext extends StmtContext {
		public PostIncrementoContext postIncremento() {
			return getRuleContext(PostIncrementoContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public PostIncrementoStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPostIncrementoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPostIncrementoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPostIncrementoStmt(this);
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
	public static class DivisionIgualStmtContext extends StmtContext {
		public DivisionIgualContext divisionIgual() {
			return getRuleContext(DivisionIgualContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public ModuloIgualContext moduloIgual() {
			return getRuleContext(ModuloIgualContext.class,0);
		}
		public DivisionIgualStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterDivisionIgualStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitDivisionIgualStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitDivisionIgualStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsignacionStmtContext extends StmtContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public AsignacionStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterAsignacionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitAsignacionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitAsignacionStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreDecrementoStmtContext extends StmtContext {
		public PreDecrementoContext preDecremento() {
			return getRuleContext(PreDecrementoContext.class,0);
		}
		public TerminalNode TK_PUNTO_Y_COMA() { return getToken(BCCParser.TK_PUNTO_Y_COMA, 0); }
		public PreDecrementoStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPreDecrementoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPreDecrementoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPreDecrementoStmt(this);
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
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(TK_PRINT);
				setState(119);
				lexpr();
				setState(120);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 2:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(TK_INPUT);
				setState(123);
				match(ID);
				setState(124);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 3:
				_localctx = new WhenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(TK_WHEN);
				setState(126);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(127);
				lexpr();
				setState(128);
				match(TK_PARENTESIS_DERECHO);
				setState(129);
				match(TK_DO);
				setState(130);
				stmt_block();
				}
				break;
			case 4:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(TK_IF);
				setState(133);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(134);
				lexpr();
				setState(135);
				match(TK_PARENTESIS_DERECHO);
				setState(136);
				match(TK_DO);
				setState(137);
				stmt_block();
				setState(138);
				match(TK_ELSE);
				setState(139);
				stmt_block();
				}
				break;
			case 5:
				_localctx = new UnlessContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				match(TK_UNLESS);
				setState(142);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(143);
				lexpr();
				setState(144);
				match(TK_PARENTESIS_DERECHO);
				setState(145);
				match(TK_DO);
				setState(146);
				stmt_block();
				}
				break;
			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				match(TK_WHILE);
				setState(149);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(150);
				lexpr();
				setState(151);
				match(TK_PARENTESIS_DERECHO);
				setState(152);
				match(TK_DO);
				setState(153);
				stmt_block();
				}
				break;
			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				match(TK_RETURN);
				setState(156);
				lexpr();
				setState(157);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 8:
				_localctx = new UntilContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				match(TK_UNTIL);
				setState(160);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(161);
				lexpr();
				setState(162);
				match(TK_PARENTESIS_DERECHO);
				setState(163);
				match(TK_DO);
				setState(164);
				stmt_block();
				}
				break;
			case 9:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(166);
				match(TK_LOOP);
				setState(167);
				stmt_block();
				}
				break;
			case 10:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(168);
				match(TK_DO);
				setState(169);
				stmt_block();
				setState(170);
				match(TK_WHILE);
				setState(171);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(172);
				lexpr();
				setState(173);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 11:
				_localctx = new DoUntilContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(175);
				match(TK_DO);
				setState(176);
				stmt_block();
				setState(177);
				match(TK_UNTIL);
				setState(178);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(179);
				lexpr();
				setState(180);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 12:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(182);
				match(TK_REPEAT);
				setState(183);
				match(NUM);
				setState(184);
				match(TK_DOS_PUNTOS);
				setState(185);
				stmt_block();
				}
				break;
			case 13:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(186);
				match(TK_FOR);
				setState(187);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(188);
				asignacion();
				setState(189);
				match(TK_PUNTO_Y_COMA);
				setState(190);
				lexpr();
				setState(191);
				match(TK_PUNTO_Y_COMA);
				setState(192);
				for_edit();
				setState(193);
				match(TK_PARENTESIS_DERECHO);
				setState(194);
				match(TK_DO);
				setState(195);
				stmt_block();
				}
				break;
			case 14:
				_localctx = new NextContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(197);
				match(TK_NEXT);
				setState(198);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 15:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(199);
				match(TK_BREAK);
				setState(200);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 16:
				_localctx = new AsignacionStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(201);
				asignacion();
				setState(202);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 17:
				_localctx = new SumaIgualStmtContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(204);
				sumaIgual();
				setState(205);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 18:
				_localctx = new RestaIgualStmtContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(207);
				restaIgual();
				setState(208);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 19:
				_localctx = new ProductoIgualStmtContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(210);
				productoIgual();
				setState(211);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 20:
				_localctx = new DivisionIgualStmtContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(213);
				divisionIgual();
				setState(214);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 21:
				_localctx = new DivisionIgualStmtContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(216);
				moduloIgual();
				setState(217);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 22:
				_localctx = new PostIncrementoStmtContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(219);
				postIncremento();
				setState(220);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 23:
				_localctx = new PostDecrementoStmtContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(222);
				postDecremento();
				setState(223);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 24:
				_localctx = new PreIncrementoStmtContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(225);
				preIncremento();
				setState(226);
				match(TK_PUNTO_Y_COMA);
				}
				break;
			case 25:
				_localctx = new PreDecrementoStmtContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(228);
				preDecremento();
				setState(229);
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

	public static class For_editContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public SumaIgualContext sumaIgual() {
			return getRuleContext(SumaIgualContext.class,0);
		}
		public RestaIgualContext restaIgual() {
			return getRuleContext(RestaIgualContext.class,0);
		}
		public ProductoIgualContext productoIgual() {
			return getRuleContext(ProductoIgualContext.class,0);
		}
		public DivisionIgualContext divisionIgual() {
			return getRuleContext(DivisionIgualContext.class,0);
		}
		public ModuloIgualContext moduloIgual() {
			return getRuleContext(ModuloIgualContext.class,0);
		}
		public PostIncrementoContext postIncremento() {
			return getRuleContext(PostIncrementoContext.class,0);
		}
		public PostDecrementoContext postDecremento() {
			return getRuleContext(PostDecrementoContext.class,0);
		}
		public PreIncrementoContext preIncremento() {
			return getRuleContext(PreIncrementoContext.class,0);
		}
		public PreDecrementoContext preDecremento() {
			return getRuleContext(PreDecrementoContext.class,0);
		}
		public For_editContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_edit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterFor_edit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitFor_edit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitFor_edit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_editContext for_edit() throws RecognitionException {
		For_editContext _localctx = new For_editContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_edit);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				sumaIgual();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				restaIgual();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				productoIgual();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				divisionIgual();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				moduloIgual();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(239);
				postIncremento();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(240);
				postDecremento();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(241);
				preIncremento();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(242);
				preDecremento();
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_ASIGNACION() { return getToken(BCCParser.TK_ASIGNACION, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
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

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
			setState(246);
			match(TK_ASIGNACION);
			setState(247);
			lexpr();
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

	public static class SumaIgualContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_SUMA_IGUAL() { return getToken(BCCParser.TK_SUMA_IGUAL, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public SumaIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumaIgual; }
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

	public final SumaIgualContext sumaIgual() throws RecognitionException {
		SumaIgualContext _localctx = new SumaIgualContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sumaIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ID);
			setState(250);
			match(TK_SUMA_IGUAL);
			setState(251);
			lexpr();
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

	public static class RestaIgualContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_RESTA_IGUAL() { return getToken(BCCParser.TK_RESTA_IGUAL, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public RestaIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restaIgual; }
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

	public final RestaIgualContext restaIgual() throws RecognitionException {
		RestaIgualContext _localctx = new RestaIgualContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_restaIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(ID);
			setState(254);
			match(TK_RESTA_IGUAL);
			setState(255);
			lexpr();
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

	public static class ProductoIgualContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_PRODUCTO_IGUAL() { return getToken(BCCParser.TK_PRODUCTO_IGUAL, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public ProductoIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productoIgual; }
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

	public final ProductoIgualContext productoIgual() throws RecognitionException {
		ProductoIgualContext _localctx = new ProductoIgualContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_productoIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(ID);
			setState(258);
			match(TK_PRODUCTO_IGUAL);
			setState(259);
			lexpr();
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

	public static class DivisionIgualContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_DIVISION_IGUAL() { return getToken(BCCParser.TK_DIVISION_IGUAL, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public DivisionIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divisionIgual; }
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

	public final DivisionIgualContext divisionIgual() throws RecognitionException {
		DivisionIgualContext _localctx = new DivisionIgualContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_divisionIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(ID);
			setState(262);
			match(TK_DIVISION_IGUAL);
			setState(263);
			lexpr();
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

	public static class ModuloIgualContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_MODULO_IGUAL() { return getToken(BCCParser.TK_MODULO_IGUAL, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public ModuloIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduloIgual; }
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

	public final ModuloIgualContext moduloIgual() throws RecognitionException {
		ModuloIgualContext _localctx = new ModuloIgualContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_moduloIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(ID);
			setState(266);
			match(TK_MODULO_IGUAL);
			setState(267);
			lexpr();
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

	public static class PostIncrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_INCREMENTO() { return getToken(BCCParser.TK_INCREMENTO, 0); }
		public PostIncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncremento; }
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

	public final PostIncrementoContext postIncremento() throws RecognitionException {
		PostIncrementoContext _localctx = new PostIncrementoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_postIncremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(ID);
			setState(270);
			match(TK_INCREMENTO);
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

	public static class PostDecrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_DECREMENTO() { return getToken(BCCParser.TK_DECREMENTO, 0); }
		public PostDecrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecremento; }
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

	public final PostDecrementoContext postDecremento() throws RecognitionException {
		PostDecrementoContext _localctx = new PostDecrementoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_postDecremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(ID);
			setState(273);
			match(TK_DECREMENTO);
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

	public static class PreIncrementoContext extends ParserRuleContext {
		public TerminalNode TK_INCREMENTO() { return getToken(BCCParser.TK_INCREMENTO, 0); }
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public PreIncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncremento; }
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

	public final PreIncrementoContext preIncremento() throws RecognitionException {
		PreIncrementoContext _localctx = new PreIncrementoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_preIncremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(TK_INCREMENTO);
			setState(276);
			match(ID);
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

	public static class PreDecrementoContext extends ParserRuleContext {
		public TerminalNode TK_DECREMENTO() { return getToken(BCCParser.TK_DECREMENTO, 0); }
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public PreDecrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecremento; }
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

	public final PreDecrementoContext preDecremento() throws RecognitionException {
		PreDecrementoContext _localctx = new PreDecrementoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_preDecremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(TK_DECREMENTO);
			setState(279);
			match(ID);
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
		enterRule(_localctx, 36, RULE_lexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			nexpr();
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_AND) {
					{
					{
					setState(282);
					match(TK_AND);
					setState(283);
					nexpr();
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_OR) {
					{
					{
					setState(289);
					match(TK_OR);
					setState(290);
					nexpr();
					}
					}
					setState(295);
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
		enterRule(_localctx, 38, RULE_nexpr);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(TK_NOT);
				setState(299);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(300);
				lexpr();
				setState(301);
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
				setState(303);
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
		enterRule(_localctx, 40, RULE_rexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			simple_expr();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MAYOR) | (1L << TK_IGUAL) | (1L << TK_DIFERENTE) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL))) != 0)) {
				{
				setState(307);
				rexpr_operator();
				setState(308);
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
		enterRule(_localctx, 42, RULE_rexpr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
		enterRule(_localctx, 44, RULE_simple_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			term();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SUMA || _la==TK_RESTA) {
				{
				{
				setState(315);
				simple_expr_operator();
				setState(316);
				term();
				}
				}
				setState(322);
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
		enterRule(_localctx, 46, RULE_simple_expr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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
		enterRule(_localctx, 48, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(325);
			((TermContext)_localctx).initialfactor = factor();
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PRODUCTO) | (1L << TK_DIVISION) | (1L << TK_MODULO))) != 0)) {
				{
				{
				setState(326);
				term_operator();
				setState(327);
				factor();
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
		enterRule(_localctx, 50, RULE_term_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 52, RULE_factor);
		int _la;
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(BOOL);
				}
				break;
			case 3:
				_localctx = new PostFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(ID);
				setState(339);
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
				setState(340);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(341);
				match(ID);
				}
				break;
			case 5:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				match(ID);
				}
				break;
			case 6:
				_localctx = new ParentesisFactorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(343);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(344);
				lexpr();
				setState(345);
				match(TK_PARENTESIS_DERECHO);
				}
				break;
			case 7:
				_localctx = new LlamadoFunctContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(347);
				match(FID);
				setState(348);
				match(TK_PARENTESIS_IZQUIERDO);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PARENTESIS_IZQUIERDO) | (1L << TK_NOT) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << BOOL) | (1L << FID) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(349);
					lexpr();
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMA) {
						{
						{
						setState(350);
						match(TK_COMA);
						setState(351);
						lexpr();
						}
						}
						setState(356);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(359);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u016d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\5\4V\n\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\6\3\6\3\7\3\7\6\7p\n\7\r\7"+
		"\16\7q\3\7\3\7\3\7\5\7w\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ea"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f6\n\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u011f\n\24\f\24\16\24\u0122\13\24"+
		"\3\24\3\24\7\24\u0126\n\24\f\24\16\24\u0129\13\24\5\24\u012b\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0133\n\25\3\26\3\26\3\26\3\26\5\26\u0139"+
		"\n\26\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0141\n\30\f\30\16\30\u0144\13"+
		"\30\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u014c\n\32\f\32\16\32\u014f\13"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\7\34\u0163\n\34\f\34\16\34\u0166\13\34\5\34\u0168"+
		"\n\34\3\34\5\34\u016b\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\66\2\7\3\2\3\4\3\2).\3\2/\60\3\2\61\63\3\2\'"+
		"(\2\u018a\2;\3\2\2\2\4@\3\2\2\2\6U\3\2\2\2\b_\3\2\2\2\nk\3\2\2\2\fv\3"+
		"\2\2\2\16\u00e9\3\2\2\2\20\u00f5\3\2\2\2\22\u00f7\3\2\2\2\24\u00fb\3\2"+
		"\2\2\26\u00ff\3\2\2\2\30\u0103\3\2\2\2\32\u0107\3\2\2\2\34\u010b\3\2\2"+
		"\2\36\u010f\3\2\2\2 \u0112\3\2\2\2\"\u0115\3\2\2\2$\u0118\3\2\2\2&\u011b"+
		"\3\2\2\2(\u0132\3\2\2\2*\u0134\3\2\2\2,\u013a\3\2\2\2.\u013c\3\2\2\2\60"+
		"\u0145\3\2\2\2\62\u0147\3\2\2\2\64\u0150\3\2\2\2\66\u016a\3\2\2\28:\5"+
		"\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\5"+
		"\6\4\2?\3\3\2\2\2@A\7\n\2\2AB\7\65\2\2BC\7\6\2\2CD\5\n\6\2DF\7\13\2\2"+
		"EG\5\b\5\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HM\7\f\2\2IJ\7\t\2\2JK\5\b\5\2"+
		"KL\7\b\2\2LN\3\2\2\2MI\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\5\f\7\2P\5\3\2\2"+
		"\2QR\7\t\2\2RS\5\b\5\2ST\7\b\2\2TV\3\2\2\2UQ\3\2\2\2UV\3\2\2\2VZ\3\2\2"+
		"\2WY\5\16\b\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3"+
		"\2\2\2]^\7\7\2\2^\7\3\2\2\2_`\7\66\2\2`a\7\6\2\2ah\5\n\6\2bc\7\5\2\2c"+
		"d\7\66\2\2de\7\6\2\2eg\5\n\6\2fb\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2"+
		"i\t\3\2\2\2jh\3\2\2\2kl\t\2\2\2l\13\3\2\2\2mo\7\r\2\2np\5\16\b\2on\3\2"+
		"\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\16\2\2tw\3\2\2\2uw\5"+
		"\16\b\2vm\3\2\2\2vu\3\2\2\2w\r\3\2\2\2xy\7\17\2\2yz\5&\24\2z{\7\b\2\2"+
		"{\u00ea\3\2\2\2|}\7\20\2\2}~\7\66\2\2~\u00ea\7\b\2\2\177\u0080\7\21\2"+
		"\2\u0080\u0081\7\13\2\2\u0081\u0082\5&\24\2\u0082\u0083\7\f\2\2\u0083"+
		"\u0084\7\22\2\2\u0084\u0085\5\f\7\2\u0085\u00ea\3\2\2\2\u0086\u0087\7"+
		"\23\2\2\u0087\u0088\7\13\2\2\u0088\u0089\5&\24\2\u0089\u008a\7\f\2\2\u008a"+
		"\u008b\7\22\2\2\u008b\u008c\5\f\7\2\u008c\u008d\7\24\2\2\u008d\u008e\5"+
		"\f\7\2\u008e\u00ea\3\2\2\2\u008f\u0090\7\25\2\2\u0090\u0091\7\13\2\2\u0091"+
		"\u0092\5&\24\2\u0092\u0093\7\f\2\2\u0093\u0094\7\22\2\2\u0094\u0095\5"+
		"\f\7\2\u0095\u00ea\3\2\2\2\u0096\u0097\7\26\2\2\u0097\u0098\7\13\2\2\u0098"+
		"\u0099\5&\24\2\u0099\u009a\7\f\2\2\u009a\u009b\7\22\2\2\u009b\u009c\5"+
		"\f\7\2\u009c\u00ea\3\2\2\2\u009d\u009e\7\27\2\2\u009e\u009f\5&\24\2\u009f"+
		"\u00a0\7\b\2\2\u00a0\u00ea\3\2\2\2\u00a1\u00a2\7\30\2\2\u00a2\u00a3\7"+
		"\13\2\2\u00a3\u00a4\5&\24\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\7\22\2\2\u00a6"+
		"\u00a7\5\f\7\2\u00a7\u00ea\3\2\2\2\u00a8\u00a9\7\36\2\2\u00a9\u00ea\5"+
		"\f\7\2\u00aa\u00ab\7\22\2\2\u00ab\u00ac\5\f\7\2\u00ac\u00ad\7\26\2\2\u00ad"+
		"\u00ae\7\13\2\2\u00ae\u00af\5&\24\2\u00af\u00b0\7\f\2\2\u00b0\u00ea\3"+
		"\2\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3\5\f\7\2\u00b3\u00b4\7\30\2\2\u00b4"+
		"\u00b5\7\13\2\2\u00b5\u00b6\5&\24\2\u00b6\u00b7\7\f\2\2\u00b7\u00ea\3"+
		"\2\2\2\u00b8\u00b9\7\31\2\2\u00b9\u00ba\7\67\2\2\u00ba\u00bb\7\6\2\2\u00bb"+
		"\u00ea\5\f\7\2\u00bc\u00bd\7\37\2\2\u00bd\u00be\7\13\2\2\u00be\u00bf\5"+
		"\22\n\2\u00bf\u00c0\7\b\2\2\u00c0\u00c1\5&\24\2\u00c1\u00c2\7\b\2\2\u00c2"+
		"\u00c3\5\20\t\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\7\22\2\2\u00c5\u00c6\5"+
		"\f\7\2\u00c6\u00ea\3\2\2\2\u00c7\u00c8\7\32\2\2\u00c8\u00ea\7\b\2\2\u00c9"+
		"\u00ca\7\33\2\2\u00ca\u00ea\7\b\2\2\u00cb\u00cc\5\22\n\2\u00cc\u00cd\7"+
		"\b\2\2\u00cd\u00ea\3\2\2\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0\7\b\2\2\u00d0"+
		"\u00ea\3\2\2\2\u00d1\u00d2\5\26\f\2\u00d2\u00d3\7\b\2\2\u00d3\u00ea\3"+
		"\2\2\2\u00d4\u00d5\5\30\r\2\u00d5\u00d6\7\b\2\2\u00d6\u00ea\3\2\2\2\u00d7"+
		"\u00d8\5\32\16\2\u00d8\u00d9\7\b\2\2\u00d9\u00ea\3\2\2\2\u00da\u00db\5"+
		"\34\17\2\u00db\u00dc\7\b\2\2\u00dc\u00ea\3\2\2\2\u00dd\u00de\5\36\20\2"+
		"\u00de\u00df\7\b\2\2\u00df\u00ea\3\2\2\2\u00e0\u00e1\5 \21\2\u00e1\u00e2"+
		"\7\b\2\2\u00e2\u00ea\3\2\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\7\b\2\2"+
		"\u00e5\u00ea\3\2\2\2\u00e6\u00e7\5$\23\2\u00e7\u00e8\7\b\2\2\u00e8\u00ea"+
		"\3\2\2\2\u00e9x\3\2\2\2\u00e9|\3\2\2\2\u00e9\177\3\2\2\2\u00e9\u0086\3"+
		"\2\2\2\u00e9\u008f\3\2\2\2\u00e9\u0096\3\2\2\2\u00e9\u009d\3\2\2\2\u00e9"+
		"\u00a1\3\2\2\2\u00e9\u00a8\3\2\2\2\u00e9\u00aa\3\2\2\2\u00e9\u00b1\3\2"+
		"\2\2\u00e9\u00b8\3\2\2\2\u00e9\u00bc\3\2\2\2\u00e9\u00c7\3\2\2\2\u00e9"+
		"\u00c9\3\2\2\2\u00e9\u00cb\3\2\2\2\u00e9\u00ce\3\2\2\2\u00e9\u00d1\3\2"+
		"\2\2\u00e9\u00d4\3\2\2\2\u00e9\u00d7\3\2\2\2\u00e9\u00da\3\2\2\2\u00e9"+
		"\u00dd\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3\2"+
		"\2\2\u00ea\17\3\2\2\2\u00eb\u00f6\5\22\n\2\u00ec\u00f6\5\24\13\2\u00ed"+
		"\u00f6\5\26\f\2\u00ee\u00f6\5\30\r\2\u00ef\u00f6\5\32\16\2\u00f0\u00f6"+
		"\5\34\17\2\u00f1\u00f6\5\36\20\2\u00f2\u00f6\5 \21\2\u00f3\u00f6\5\"\22"+
		"\2\u00f4\u00f6\5$\23\2\u00f5\u00eb\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ed"+
		"\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5"+
		"\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2"+
		"\2\2\u00f6\21\3\2\2\2\u00f7\u00f8\7\66\2\2\u00f8\u00f9\7!\2\2\u00f9\u00fa"+
		"\5&\24\2\u00fa\23\3\2\2\2\u00fb\u00fc\7\66\2\2\u00fc\u00fd\7\"\2\2\u00fd"+
		"\u00fe\5&\24\2\u00fe\25\3\2\2\2\u00ff\u0100\7\66\2\2\u0100\u0101\7#\2"+
		"\2\u0101\u0102\5&\24\2\u0102\27\3\2\2\2\u0103\u0104\7\66\2\2\u0104\u0105"+
		"\7$\2\2\u0105\u0106\5&\24\2\u0106\31\3\2\2\2\u0107\u0108\7\66\2\2\u0108"+
		"\u0109\7%\2\2\u0109\u010a\5&\24\2\u010a\33\3\2\2\2\u010b\u010c\7\66\2"+
		"\2\u010c\u010d\7&\2\2\u010d\u010e\5&\24\2\u010e\35\3\2\2\2\u010f\u0110"+
		"\7\66\2\2\u0110\u0111\7\'\2\2\u0111\37\3\2\2\2\u0112\u0113\7\66\2\2\u0113"+
		"\u0114\7(\2\2\u0114!\3\2\2\2\u0115\u0116\7\'\2\2\u0116\u0117\7\66\2\2"+
		"\u0117#\3\2\2\2\u0118\u0119\7(\2\2\u0119\u011a\7\66\2\2\u011a%\3\2\2\2"+
		"\u011b\u012a\5(\25\2\u011c\u011d\7\34\2\2\u011d\u011f\5(\25\2\u011e\u011c"+
		"\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u012b\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\35\2\2\u0124\u0126\5"+
		"(\25\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u0120\3\2"+
		"\2\2\u012a\u0127\3\2\2\2\u012a\u012b\3\2\2\2\u012b\'\3\2\2\2\u012c\u012d"+
		"\7 \2\2\u012d\u012e\7\13\2\2\u012e\u012f\5&\24\2\u012f\u0130\7\f\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u0133\5*\26\2\u0132\u012c\3\2\2\2\u0132\u0131\3\2"+
		"\2\2\u0133)\3\2\2\2\u0134\u0138\5.\30\2\u0135\u0136\5,\27\2\u0136\u0137"+
		"\5.\30\2\u0137\u0139\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"+\3\2\2\2\u013a\u013b\t\3\2\2\u013b-\3\2\2\2\u013c\u0142\5\62\32\2\u013d"+
		"\u013e\5\60\31\2\u013e\u013f\5\62\32\2\u013f\u0141\3\2\2\2\u0140\u013d"+
		"\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"/\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\t\4\2\2\u0146\61\3\2\2\2\u0147"+
		"\u014d\5\66\34\2\u0148\u0149\5\64\33\2\u0149\u014a\5\66\34\2\u014a\u014c"+
		"\3\2\2\2\u014b\u0148\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\63\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\t\5\2"+
		"\2\u0151\65\3\2\2\2\u0152\u016b\7\67\2\2\u0153\u016b\7\64\2\2\u0154\u0155"+
		"\7\66\2\2\u0155\u016b\t\6\2\2\u0156\u0157\t\6\2\2\u0157\u016b\7\66\2\2"+
		"\u0158\u016b\7\66\2\2\u0159\u015a\7\13\2\2\u015a\u015b\5&\24\2\u015b\u015c"+
		"\7\f\2\2\u015c\u016b\3\2\2\2\u015d\u015e\7\65\2\2\u015e\u0167\7\13\2\2"+
		"\u015f\u0164\5&\24\2\u0160\u0161\7\5\2\2\u0161\u0163\5&\24\2\u0162\u0160"+
		"\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u015f\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u0169\3\2\2\2\u0169\u016b\7\f\2\2\u016a\u0152\3\2\2\2\u016a"+
		"\u0153\3\2\2\2\u016a\u0154\3\2\2\2\u016a\u0156\3\2\2\2\u016a\u0158\3\2"+
		"\2\2\u016a\u0159\3\2\2\2\u016a\u015d\3\2\2\2\u016b\67\3\2\2\2\26;FMUZ"+
		"hqv\u00e9\u00f5\u0120\u0127\u012a\u0132\u0138\u0142\u014d\u0164\u0167"+
		"\u016a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}