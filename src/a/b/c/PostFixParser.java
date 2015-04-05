// $ANTLR 3.5.2 C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g 2015-04-05 22:59:00

  package a.b.c;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PostFixParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "'+'", "'-'", "'0'", "'1'", "'2'", 
		"'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'"
	};
	public static final int EOF=-1;
	public static final int T__4=4;
	public static final int T__5=5;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PostFixParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PostFixParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return PostFixParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g"; }



	// $ANTLR start "expr"
	// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:15:1: expr : term rest ;
	public final void expr() throws RecognitionException {
		try {
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:16:3: ( term rest )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:16:5: term rest
			{
			pushFollow(FOLLOW_term_in_expr43);
			term();
			state._fsp--;

			pushFollow(FOLLOW_rest_in_expr45);
			rest();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "rest"
	// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:19:1: rest : ( '+' term rest | '-' term rest |);
	public final void rest() throws RecognitionException {
		try {
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:20:3: ( '+' term rest | '-' term rest |)
			int alt1=3;
			switch ( input.LA(1) ) {
			case 4:
				{
				alt1=1;
				}
				break;
			case 5:
				{
				alt1=2;
				}
				break;
			case EOF:
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:20:5: '+' term rest
					{
					match(input,4,FOLLOW_4_in_rest60); 
					pushFollow(FOLLOW_term_in_rest62);
					term();
					state._fsp--;

					System.out.print("+");
					pushFollow(FOLLOW_rest_in_rest66);
					rest();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:21:5: '-' term rest
					{
					match(input,5,FOLLOW_5_in_rest73); 
					pushFollow(FOLLOW_term_in_rest75);
					term();
					state._fsp--;

					System.out.print("-");
					pushFollow(FOLLOW_rest_in_rest79);
					rest();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:23:3: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "rest"



	// $ANTLR start "term"
	// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:25:1: term : ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' );
	public final void term() throws RecognitionException {
		try {
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:26:3: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )
			int alt2=10;
			switch ( input.LA(1) ) {
			case 6:
				{
				alt2=1;
				}
				break;
			case 7:
				{
				alt2=2;
				}
				break;
			case 8:
				{
				alt2=3;
				}
				break;
			case 9:
				{
				alt2=4;
				}
				break;
			case 10:
				{
				alt2=5;
				}
				break;
			case 11:
				{
				alt2=6;
				}
				break;
			case 12:
				{
				alt2=7;
				}
				break;
			case 13:
				{
				alt2=8;
				}
				break;
			case 14:
				{
				alt2=9;
				}
				break;
			case 15:
				{
				alt2=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:26:5: '0'
					{
					match(input,6,FOLLOW_6_in_term101); 
					System.out.print("0");
					}
					break;
				case 2 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:27:5: '1'
					{
					match(input,7,FOLLOW_7_in_term109); 
					System.out.print("1");
					}
					break;
				case 3 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:28:5: '2'
					{
					match(input,8,FOLLOW_8_in_term117); 
					System.out.print("2");
					}
					break;
				case 4 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:29:5: '3'
					{
					match(input,9,FOLLOW_9_in_term125); 
					System.out.print("3");
					}
					break;
				case 5 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:30:5: '4'
					{
					match(input,10,FOLLOW_10_in_term133); 
					System.out.print("4");
					}
					break;
				case 6 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:31:5: '5'
					{
					match(input,11,FOLLOW_11_in_term141); 
					System.out.print("5");
					}
					break;
				case 7 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:32:5: '6'
					{
					match(input,12,FOLLOW_12_in_term149); 
					System.out.print("6");
					}
					break;
				case 8 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:33:5: '7'
					{
					match(input,13,FOLLOW_13_in_term157); 
					System.out.print("7");
					}
					break;
				case 9 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:34:5: '8'
					{
					match(input,14,FOLLOW_14_in_term165); 
					System.out.print("8");
					}
					break;
				case 10 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\PostFix.g:35:5: '9'
					{
					match(input,15,FOLLOW_15_in_term173); 
					System.out.print("9");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "term"

	// Delegated rules



	public static final BitSet FOLLOW_term_in_expr43 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_rest_in_expr45 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_4_in_rest60 = new BitSet(new long[]{0x000000000000FFC0L});
	public static final BitSet FOLLOW_term_in_rest62 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_rest_in_rest66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_5_in_rest73 = new BitSet(new long[]{0x000000000000FFC0L});
	public static final BitSet FOLLOW_term_in_rest75 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_rest_in_rest79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_6_in_term101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_term109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_term117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_term125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_term133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_term141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_term149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_term157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_term165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_term173 = new BitSet(new long[]{0x0000000000000002L});
}
