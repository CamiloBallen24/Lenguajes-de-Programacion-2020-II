// Generated from D:/Documents/Julian/Unal/2020-2/Lenguajes de Programación/ANTRL test/grammar\BCC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BCCLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TK_BOOL", "TK_NUM", "TK_COMA", "TK_DOS_PUNTOS", "TK_END", "TK_PUNTO_Y_COMA", 
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


	public BCCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BCC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0158\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3"+
		"$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3"+
		",\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u012f\n\63\3\64\3\64\3\64\7\64\u0134"+
		"\n\64\f\64\16\64\u0137\13\64\3\65\3\65\7\65\u013b\n\65\f\65\16\65\u013e"+
		"\13\65\3\66\6\66\u0141\n\66\r\66\16\66\u0142\3\66\6\66\u0146\n\66\r\66"+
		"\16\66\u0147\3\66\3\66\6\66\u014c\n\66\r\66\16\66\u014d\5\66\u0150\n\66"+
		"\3\67\6\67\u0153\n\67\r\67\16\67\u0154\3\67\3\67\2\28\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8\3\2\7\4\2C\\c|\6"+
		"\2\62;C\\aac|\5\2C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u015f\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2"+
		"\2\5t\3\2\2\2\7x\3\2\2\2\tz\3\2\2\2\13|\3\2\2\2\r\u0080\3\2\2\2\17\u0082"+
		"\3\2\2\2\21\u0086\3\2\2\2\23\u008f\3\2\2\2\25\u0091\3\2\2\2\27\u0093\3"+
		"\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u009d\3\2\2\2\37\u00a3\3\2"+
		"\2\2!\u00a8\3\2\2\2#\u00ab\3\2\2\2%\u00ae\3\2\2\2\'\u00b3\3\2\2\2)\u00ba"+
		"\3\2\2\2+\u00c0\3\2\2\2-\u00c7\3\2\2\2/\u00cd\3\2\2\2\61\u00d4\3\2\2\2"+
		"\63\u00d9\3\2\2\2\65\u00df\3\2\2\2\67\u00e3\3\2\2\29\u00e6\3\2\2\2;\u00eb"+
		"\3\2\2\2=\u00ef\3\2\2\2?\u00f3\3\2\2\2A\u00f6\3\2\2\2C\u00f9\3\2\2\2E"+
		"\u00fc\3\2\2\2G\u00ff\3\2\2\2I\u0102\3\2\2\2K\u0105\3\2\2\2M\u0108\3\2"+
		"\2\2O\u010b\3\2\2\2Q\u010d\3\2\2\2S\u010f\3\2\2\2U\u0112\3\2\2\2W\u0115"+
		"\3\2\2\2Y\u0118\3\2\2\2[\u011b\3\2\2\2]\u011d\3\2\2\2_\u011f\3\2\2\2a"+
		"\u0121\3\2\2\2c\u0123\3\2\2\2e\u012e\3\2\2\2g\u0130\3\2\2\2i\u0138\3\2"+
		"\2\2k\u014f\3\2\2\2m\u0152\3\2\2\2op\7d\2\2pq\7q\2\2qr\7q\2\2rs\7n\2\2"+
		"s\4\3\2\2\2tu\7p\2\2uv\7w\2\2vw\7o\2\2w\6\3\2\2\2xy\7.\2\2y\b\3\2\2\2"+
		"z{\7<\2\2{\n\3\2\2\2|}\7g\2\2}~\7p\2\2~\177\7f\2\2\177\f\3\2\2\2\u0080"+
		"\u0081\7=\2\2\u0081\16\3\2\2\2\u0082\u0083\7x\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7t\2\2\u0085\20\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7w\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7e\2\2\u008a\u008b\7v\2\2\u008b\u008c\7k\2\2"+
		"\u008c\u008d\7q\2\2\u008d\u008e\7p\2\2\u008e\22\3\2\2\2\u008f\u0090\7"+
		"*\2\2\u0090\24\3\2\2\2\u0091\u0092\7+\2\2\u0092\26\3\2\2\2\u0093\u0094"+
		"\7}\2\2\u0094\30\3\2\2\2\u0095\u0096\7\177\2\2\u0096\32\3\2\2\2\u0097"+
		"\u0098\7r\2\2\u0098\u0099\7t\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2"+
		"\u009b\u009c\7v\2\2\u009c\34\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7"+
		"p\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7v\2\2\u00a2\36"+
		"\3\2\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7q\2\2\u00aa"+
		"\"\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7h\2\2\u00ad$\3\2\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7g\2\2"+
		"\u00b2&\3\2\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7n\2"+
		"\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7u\2\2\u00b9(\3\2"+
		"\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be"+
		"\7n\2\2\u00be\u00bf\7g\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7t\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6,\3\2\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7p\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7n\2\2\u00cc.\3\2\2\2\u00cd"+
		"\u00ce\7t\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7g\2\2"+
		"\u00d1\u00d2\7c\2\2\u00d2\u00d3\7v\2\2\u00d3\60\3\2\2\2\u00d4\u00d5\7"+
		"p\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7z\2\2\u00d7\u00d8\7v\2\2\u00d8\62"+
		"\3\2\2\2\u00d9\u00da\7d\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\u00dd\7c\2\2\u00dd\u00de\7m\2\2\u00de\64\3\2\2\2\u00df\u00e0\7c\2\2\u00e0"+
		"\u00e1\7p\2\2\u00e1\u00e2\7f\2\2\u00e2\66\3\2\2\2\u00e3\u00e4\7q\2\2\u00e4"+
		"\u00e5\7t\2\2\u00e58\3\2\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7q\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7r\2\2\u00ea:\3\2\2\2\u00eb\u00ec\7h\2\2\u00ec"+
		"\u00ed\7q\2\2\u00ed\u00ee\7t\2\2\u00ee<\3\2\2\2\u00ef\u00f0\7p\2\2\u00f0"+
		"\u00f1\7q\2\2\u00f1\u00f2\7v\2\2\u00f2>\3\2\2\2\u00f3\u00f4\7<\2\2\u00f4"+
		"\u00f5\7?\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7-\2\2\u00f7\u00f8\7?\2\2\u00f8"+
		"B\3\2\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb\7?\2\2\u00fbD\3\2\2\2\u00fc\u00fd"+
		"\7,\2\2\u00fd\u00fe\7?\2\2\u00feF\3\2\2\2\u00ff\u0100\7\61\2\2\u0100\u0101"+
		"\7?\2\2\u0101H\3\2\2\2\u0102\u0103\7\'\2\2\u0103\u0104\7?\2\2\u0104J\3"+
		"\2\2\2\u0105\u0106\7-\2\2\u0106\u0107\7-\2\2\u0107L\3\2\2\2\u0108\u0109"+
		"\7/\2\2\u0109\u010a\7/\2\2\u010aN\3\2\2\2\u010b\u010c\7>\2\2\u010cP\3"+
		"\2\2\2\u010d\u010e\7@\2\2\u010eR\3\2\2\2\u010f\u0110\7?\2\2\u0110\u0111"+
		"\7?\2\2\u0111T\3\2\2\2\u0112\u0113\7#\2\2\u0113\u0114\7?\2\2\u0114V\3"+
		"\2\2\2\u0115\u0116\7>\2\2\u0116\u0117\7?\2\2\u0117X\3\2\2\2\u0118\u0119"+
		"\7@\2\2\u0119\u011a\7?\2\2\u011aZ\3\2\2\2\u011b\u011c\7-\2\2\u011c\\\3"+
		"\2\2\2\u011d\u011e\7/\2\2\u011e^\3\2\2\2\u011f\u0120\7,\2\2\u0120`\3\2"+
		"\2\2\u0121\u0122\7\61\2\2\u0122b\3\2\2\2\u0123\u0124\7\'\2\2\u0124d\3"+
		"\2\2\2\u0125\u0126\7v\2\2\u0126\u0127\7t\2\2\u0127\u0128\7w\2\2\u0128"+
		"\u012f\7g\2\2\u0129\u012a\7h\2\2\u012a\u012b\7c\2\2\u012b\u012c\7n\2\2"+
		"\u012c\u012d\7u\2\2\u012d\u012f\7g\2\2\u012e\u0125\3\2\2\2\u012e\u0129"+
		"\3\2\2\2\u012ff\3\2\2\2\u0130\u0131\7B\2\2\u0131\u0135\t\2\2\2\u0132\u0134"+
		"\t\3\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136h\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013c\t\4\2\2"+
		"\u0139\u013b\t\3\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013dj\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0141\t\5\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0150\3\2\2\2\u0144\u0146\t\5\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149\u014b\7\60\2\2\u014a\u014c\t\5\2\2\u014b"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0150\3\2\2\2\u014f\u0140\3\2\2\2\u014f\u0145\3\2\2\2\u0150"+
		"l\3\2\2\2\u0151\u0153\t\6\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2"+
		"\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157"+
		"\b\67\2\2\u0157n\3\2\2\2\13\2\u012e\u0135\u013c\u0142\u0147\u014d\u014f"+
		"\u0154\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}