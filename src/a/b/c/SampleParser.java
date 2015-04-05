// $ANTLR 3.5.2 C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g 2015-04-05 22:45:53

  package a.b.c;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SampleParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "WS", "','", 
		"'.'", "':'", "':='", "';'", "'='", "'Integer'", "'Real'", "'begin'", 
		"'constant'", "'end'", "'program'", "'var'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public SampleParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SampleParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return SampleParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g"; }



	// $ANTLR start "program"
	// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:15:1: program : 'program' IDENT '=' ( constant | variable )* 'begin' 'end' IDENT '.' ;
	public final void program() throws RecognitionException {
		try {
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:15:9: ( 'program' IDENT '=' ( constant | variable )* 'begin' 'end' IDENT '.' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:16:3: 'program' IDENT '=' ( constant | variable )* 'begin' 'end' IDENT '.'
			{
			match(input,18,FOLLOW_18_in_program41); 
			match(input,IDENT,FOLLOW_IDENT_in_program43); 
			match(input,12,FOLLOW_12_in_program45); 
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:17:3: ( constant | variable )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==16) ) {
					alt1=1;
				}
				else if ( (LA1_0==19) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:17:4: constant
					{
					pushFollow(FOLLOW_constant_in_program50);
					constant();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:17:15: variable
					{
					pushFollow(FOLLOW_variable_in_program54);
					variable();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,15,FOLLOW_15_in_program60); 
			match(input,17,FOLLOW_17_in_program64); 
			match(input,IDENT,FOLLOW_IDENT_in_program66); 
			match(input,8,FOLLOW_8_in_program68); 
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
	// $ANTLR end "program"



	// $ANTLR start "constant"
	// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:22:1: constant : 'constant' IDENT ':' type ':=' expression ';' ;
	public final void constant() throws RecognitionException {
		try {
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:23:3: ( 'constant' IDENT ':' type ':=' expression ';' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:23:5: 'constant' IDENT ':' type ':=' expression ';'
			{
			match(input,16,FOLLOW_16_in_constant83); 
			match(input,IDENT,FOLLOW_IDENT_in_constant85); 
			match(input,9,FOLLOW_9_in_constant87); 
			pushFollow(FOLLOW_type_in_constant89);
			type();
			state._fsp--;

			match(input,10,FOLLOW_10_in_constant91); 
			pushFollow(FOLLOW_expression_in_constant93);
			expression();
			state._fsp--;

			match(input,11,FOLLOW_11_in_constant95); 
			System.out.println("found a constant declaration");
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
	// $ANTLR end "constant"



	// $ANTLR start "variable"
	// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:26:1: variable : 'var' IDENT ( ',' IDENT )* ':' type ';' ;
	public final void variable() throws RecognitionException {
		try {
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:27:3: ( 'var' IDENT ( ',' IDENT )* ':' type ';' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:27:5: 'var' IDENT ( ',' IDENT )* ':' type ';'
			{
			match(input,19,FOLLOW_19_in_variable110); 
			match(input,IDENT,FOLLOW_IDENT_in_variable112); 
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:27:17: ( ',' IDENT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==7) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:27:18: ',' IDENT
					{
					match(input,7,FOLLOW_7_in_variable115); 
					match(input,IDENT,FOLLOW_IDENT_in_variable117); 
					}
					break;

				default :
					break loop2;
				}
			}

			match(input,9,FOLLOW_9_in_variable121); 
			pushFollow(FOLLOW_type_in_variable123);
			type();
			state._fsp--;

			match(input,11,FOLLOW_11_in_variable125); 
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
	// $ANTLR end "variable"



	// $ANTLR start "type"
	// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:30:1: type : ( 'Integer' | 'Real' );
	public final void type() throws RecognitionException {
		try {
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:31:3: ( 'Integer' | 'Real' )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:
			{
			if ( (input.LA(1) >= 13 && input.LA(1) <= 14) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
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
	// $ANTLR end "type"



	// $ANTLR start "expression"
	// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:34:1: expression : INTEGER ;
	public final void expression() throws RecognitionException {
		try {
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:35:3: ( INTEGER )
			// C:\\Users\\Ashraf\\workspace2\\ANTLA\\src\\a\\b\\c\\Sample.g:35:5: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_expression157); 
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
	// $ANTLR end "expression"

	// Delegated rules



	public static final BitSet FOLLOW_18_in_program41 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_IDENT_in_program43 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_program45 = new BitSet(new long[]{0x0000000000098000L});
	public static final BitSet FOLLOW_constant_in_program50 = new BitSet(new long[]{0x0000000000098000L});
	public static final BitSet FOLLOW_variable_in_program54 = new BitSet(new long[]{0x0000000000098000L});
	public static final BitSet FOLLOW_15_in_program60 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_program64 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_IDENT_in_program66 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_program68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_constant83 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_IDENT_in_constant85 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_constant87 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_type_in_constant89 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_constant91 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_constant93 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_constant95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_variable110 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_IDENT_in_variable112 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_7_in_variable115 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_IDENT_in_variable117 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_9_in_variable121 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_type_in_variable123 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_variable125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_expression157 = new BitSet(new long[]{0x0000000000000002L});
}
