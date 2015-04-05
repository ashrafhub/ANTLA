// $ANTLR 3.5.2 C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g 2015-04-05 22:45:53

  package a.b.c;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SampleLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int IDENT=4;
	public static final int INTEGER=5;
	public static final int WS=6;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SampleLexer() {} 
	public SampleLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SampleLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g"; }

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:11:6: ( ',' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:11:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:12:6: ( '.' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:12:8: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:13:6: ( ':' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:13:8: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:14:7: ( ':=' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:14:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:15:7: ( ';' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:15:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:16:7: ( '=' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:16:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:17:7: ( 'Integer' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:17:9: 'Integer'
			{
			match("Integer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:18:7: ( 'Real' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:18:9: 'Real'
			{
			match("Real"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:19:7: ( 'begin' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:19:9: 'begin'
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:20:7: ( 'constant' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:20:9: 'constant'
			{
			match("constant"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:21:7: ( 'end' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:21:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:22:7: ( 'program' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:22:9: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:23:7: ( 'var' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:23:9: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:38:11: ( '0' .. '9' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:39:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:39:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:39:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:40:7: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:40:9: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:40:9: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | INTEGER | IDENT | WS )
		int alt3=16;
		switch ( input.LA(1) ) {
		case ',':
			{
			alt3=1;
			}
			break;
		case '.':
			{
			alt3=2;
			}
			break;
		case ':':
			{
			int LA3_3 = input.LA(2);
			if ( (LA3_3=='=') ) {
				alt3=4;
			}

			else {
				alt3=3;
			}

			}
			break;
		case ';':
			{
			alt3=5;
			}
			break;
		case '=':
			{
			alt3=6;
			}
			break;
		case 'I':
			{
			int LA3_6 = input.LA(2);
			if ( (LA3_6=='n') ) {
				int LA3_18 = input.LA(3);
				if ( (LA3_18=='t') ) {
					int LA3_25 = input.LA(4);
					if ( (LA3_25=='e') ) {
						int LA3_32 = input.LA(5);
						if ( (LA3_32=='g') ) {
							int LA3_39 = input.LA(6);
							if ( (LA3_39=='e') ) {
								int LA3_44 = input.LA(7);
								if ( (LA3_44=='r') ) {
									int LA3_48 = input.LA(8);
									if ( ((LA3_48 >= '0' && LA3_48 <= '9')||(LA3_48 >= 'A' && LA3_48 <= 'Z')||(LA3_48 >= 'a' && LA3_48 <= 'z')) ) {
										alt3=15;
									}

									else {
										alt3=7;
									}

								}

								else {
									alt3=15;
								}

							}

							else {
								alt3=15;
							}

						}

						else {
							alt3=15;
						}

					}

					else {
						alt3=15;
					}

				}

				else {
					alt3=15;
				}

			}

			else {
				alt3=15;
			}

			}
			break;
		case 'R':
			{
			int LA3_7 = input.LA(2);
			if ( (LA3_7=='e') ) {
				int LA3_19 = input.LA(3);
				if ( (LA3_19=='a') ) {
					int LA3_26 = input.LA(4);
					if ( (LA3_26=='l') ) {
						int LA3_33 = input.LA(5);
						if ( ((LA3_33 >= '0' && LA3_33 <= '9')||(LA3_33 >= 'A' && LA3_33 <= 'Z')||(LA3_33 >= 'a' && LA3_33 <= 'z')) ) {
							alt3=15;
						}

						else {
							alt3=8;
						}

					}

					else {
						alt3=15;
					}

				}

				else {
					alt3=15;
				}

			}

			else {
				alt3=15;
			}

			}
			break;
		case 'b':
			{
			int LA3_8 = input.LA(2);
			if ( (LA3_8=='e') ) {
				int LA3_20 = input.LA(3);
				if ( (LA3_20=='g') ) {
					int LA3_27 = input.LA(4);
					if ( (LA3_27=='i') ) {
						int LA3_34 = input.LA(5);
						if ( (LA3_34=='n') ) {
							int LA3_41 = input.LA(6);
							if ( ((LA3_41 >= '0' && LA3_41 <= '9')||(LA3_41 >= 'A' && LA3_41 <= 'Z')||(LA3_41 >= 'a' && LA3_41 <= 'z')) ) {
								alt3=15;
							}

							else {
								alt3=9;
							}

						}

						else {
							alt3=15;
						}

					}

					else {
						alt3=15;
					}

				}

				else {
					alt3=15;
				}

			}

			else {
				alt3=15;
			}

			}
			break;
		case 'c':
			{
			int LA3_9 = input.LA(2);
			if ( (LA3_9=='o') ) {
				int LA3_21 = input.LA(3);
				if ( (LA3_21=='n') ) {
					int LA3_28 = input.LA(4);
					if ( (LA3_28=='s') ) {
						int LA3_35 = input.LA(5);
						if ( (LA3_35=='t') ) {
							int LA3_42 = input.LA(6);
							if ( (LA3_42=='a') ) {
								int LA3_46 = input.LA(7);
								if ( (LA3_46=='n') ) {
									int LA3_49 = input.LA(8);
									if ( (LA3_49=='t') ) {
										int LA3_52 = input.LA(9);
										if ( ((LA3_52 >= '0' && LA3_52 <= '9')||(LA3_52 >= 'A' && LA3_52 <= 'Z')||(LA3_52 >= 'a' && LA3_52 <= 'z')) ) {
											alt3=15;
										}

										else {
											alt3=10;
										}

									}

									else {
										alt3=15;
									}

								}

								else {
									alt3=15;
								}

							}

							else {
								alt3=15;
							}

						}

						else {
							alt3=15;
						}

					}

					else {
						alt3=15;
					}

				}

				else {
					alt3=15;
				}

			}

			else {
				alt3=15;
			}

			}
			break;
		case 'e':
			{
			int LA3_10 = input.LA(2);
			if ( (LA3_10=='n') ) {
				int LA3_22 = input.LA(3);
				if ( (LA3_22=='d') ) {
					int LA3_29 = input.LA(4);
					if ( ((LA3_29 >= '0' && LA3_29 <= '9')||(LA3_29 >= 'A' && LA3_29 <= 'Z')||(LA3_29 >= 'a' && LA3_29 <= 'z')) ) {
						alt3=15;
					}

					else {
						alt3=11;
					}

				}

				else {
					alt3=15;
				}

			}

			else {
				alt3=15;
			}

			}
			break;
		case 'p':
			{
			int LA3_11 = input.LA(2);
			if ( (LA3_11=='r') ) {
				int LA3_23 = input.LA(3);
				if ( (LA3_23=='o') ) {
					int LA3_30 = input.LA(4);
					if ( (LA3_30=='g') ) {
						int LA3_37 = input.LA(5);
						if ( (LA3_37=='r') ) {
							int LA3_43 = input.LA(6);
							if ( (LA3_43=='a') ) {
								int LA3_47 = input.LA(7);
								if ( (LA3_47=='m') ) {
									int LA3_50 = input.LA(8);
									if ( ((LA3_50 >= '0' && LA3_50 <= '9')||(LA3_50 >= 'A' && LA3_50 <= 'Z')||(LA3_50 >= 'a' && LA3_50 <= 'z')) ) {
										alt3=15;
									}

									else {
										alt3=12;
									}

								}

								else {
									alt3=15;
								}

							}

							else {
								alt3=15;
							}

						}

						else {
							alt3=15;
						}

					}

					else {
						alt3=15;
					}

				}

				else {
					alt3=15;
				}

			}

			else {
				alt3=15;
			}

			}
			break;
		case 'v':
			{
			int LA3_12 = input.LA(2);
			if ( (LA3_12=='a') ) {
				int LA3_24 = input.LA(3);
				if ( (LA3_24=='r') ) {
					int LA3_31 = input.LA(4);
					if ( ((LA3_31 >= '0' && LA3_31 <= '9')||(LA3_31 >= 'A' && LA3_31 <= 'Z')||(LA3_31 >= 'a' && LA3_31 <= 'z')) ) {
						alt3=15;
					}

					else {
						alt3=13;
					}

				}

				else {
					alt3=15;
				}

			}

			else {
				alt3=15;
			}

			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt3=14;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt3=15;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt3=16;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:10: T__7
				{
				mT__7(); 

				}
				break;
			case 2 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:15: T__8
				{
				mT__8(); 

				}
				break;
			case 3 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:20: T__9
				{
				mT__9(); 

				}
				break;
			case 4 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:25: T__10
				{
				mT__10(); 

				}
				break;
			case 5 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:31: T__11
				{
				mT__11(); 

				}
				break;
			case 6 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:37: T__12
				{
				mT__12(); 

				}
				break;
			case 7 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:43: T__13
				{
				mT__13(); 

				}
				break;
			case 8 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:49: T__14
				{
				mT__14(); 

				}
				break;
			case 9 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:55: T__15
				{
				mT__15(); 

				}
				break;
			case 10 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:61: T__16
				{
				mT__16(); 

				}
				break;
			case 11 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:67: T__17
				{
				mT__17(); 

				}
				break;
			case 12 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:73: T__18
				{
				mT__18(); 

				}
				break;
			case 13 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:79: T__19
				{
				mT__19(); 

				}
				break;
			case 14 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:85: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 15 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:93: IDENT
				{
				mIDENT(); 

				}
				break;
			case 16 :
				// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:1:99: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
