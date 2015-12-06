// $ANTLR 3.5.2 C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g 2015-12-06 17:16:58

	package org.alprojects.antlr_test;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SampleParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "'('", "')'", "'*'", 
		"'+'", "'-'", "'/'"
	};
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int INT=4;
	public static final int WS=5;

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
	@Override public String getGrammarFileName() { return "C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g"; }



	// $ANTLR start "rule"
	// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:17:1: rule returns [double res] : a1= sum_expr ;
	public final double rule() throws RecognitionException {
		double res = 0.0;


		double a1 =0.0;

		try {
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:17:26: (a1= sum_expr )
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:18:2: a1= sum_expr
			{
			pushFollow(FOLLOW_sum_expr_in_rule49);
			a1=sum_expr();
			state._fsp--;

			res = a1;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "rule"



	// $ANTLR start "atom"
	// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:20:1: atom returns [double res] : ( INT | '(' a2= sum_expr ')' ) ;
	public final double atom() throws RecognitionException {
		double res = 0.0;


		Token INT1=null;
		double a2 =0.0;

		try {
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:20:25: ( ( INT | '(' a2= sum_expr ')' ) )
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:21:2: ( INT | '(' a2= sum_expr ')' )
			{
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:21:2: ( INT | '(' a2= sum_expr ')' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INT) ) {
				alt1=1;
			}
			else if ( (LA1_0==6) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:22:3: INT
					{
					INT1=(Token)match(input,INT,FOLLOW_INT_in_atom69); 
					res =  Integer.parseInt((INT1!=null?INT1.getText():null)); 
					}
					break;
				case 2 :
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:24:3: '(' a2= sum_expr ')'
					{
					match(input,6,FOLLOW_6_in_atom81); 
					pushFollow(FOLLOW_sum_expr_in_atom86);
					a2=sum_expr();
					state._fsp--;

					res = a2;
					match(input,7,FOLLOW_7_in_atom90); 
					}
					break;

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
		return res;
	}
	// $ANTLR end "atom"



	// $ANTLR start "mult_expr"
	// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:27:1: mult_expr returns [double res] : a1= neg_atom ( ( '/' a2= neg_atom | '*' a3= neg_atom ) )* ;
	public final double mult_expr() throws RecognitionException {
		double res = 0.0;


		double a1 =0.0;
		double a2 =0.0;
		double a3 =0.0;

		try {
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:27:30: (a1= neg_atom ( ( '/' a2= neg_atom | '*' a3= neg_atom ) )* )
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:28:2: a1= neg_atom ( ( '/' a2= neg_atom | '*' a3= neg_atom ) )*
			{
			pushFollow(FOLLOW_neg_atom_in_mult_expr110);
			a1=neg_atom();
			state._fsp--;

			res =a1;
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:29:5: ( ( '/' a2= neg_atom | '*' a3= neg_atom ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==8||LA3_0==11) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:29:7: ( '/' a2= neg_atom | '*' a3= neg_atom )
					{
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:29:7: ( '/' a2= neg_atom | '*' a3= neg_atom )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==11) ) {
						alt2=1;
					}
					else if ( (LA2_0==8) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:29:8: '/' a2= neg_atom
							{
							match(input,11,FOLLOW_11_in_mult_expr121); 
							pushFollow(FOLLOW_neg_atom_in_mult_expr126);
							a2=neg_atom();
							state._fsp--;

							res /= a2;
							}
							break;
						case 2 :
							// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:29:41: '*' a3= neg_atom
							{
							match(input,8,FOLLOW_8_in_mult_expr132); 
							pushFollow(FOLLOW_neg_atom_in_mult_expr137);
							a3=neg_atom();
							state._fsp--;

							res *= a3;
							}
							break;

					}

					}
					break;

				default :
					break loop3;
				}
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
		return res;
	}
	// $ANTLR end "mult_expr"



	// $ANTLR start "sum_expr"
	// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:32:1: sum_expr returns [double res] : a1= mult_expr ( ( '-' a2= mult_expr | '+' a3= mult_expr ) )* ;
	public final double sum_expr() throws RecognitionException {
		double res = 0.0;


		double a1 =0.0;
		double a2 =0.0;
		double a3 =0.0;

		try {
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:32:29: (a1= mult_expr ( ( '-' a2= mult_expr | '+' a3= mult_expr ) )* )
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:33:2: a1= mult_expr ( ( '-' a2= mult_expr | '+' a3= mult_expr ) )*
			{
			pushFollow(FOLLOW_mult_expr_in_sum_expr160);
			a1=mult_expr();
			state._fsp--;

			res =a1;
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:34:2: ( ( '-' a2= mult_expr | '+' a3= mult_expr ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 9 && LA5_0 <= 10)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:34:4: ( '-' a2= mult_expr | '+' a3= mult_expr )
					{
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:34:4: ( '-' a2= mult_expr | '+' a3= mult_expr )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==10) ) {
						alt4=1;
					}
					else if ( (LA4_0==9) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:34:5: '-' a2= mult_expr
							{
							match(input,10,FOLLOW_10_in_sum_expr168); 
							pushFollow(FOLLOW_mult_expr_in_sum_expr173);
							a2=mult_expr();
							state._fsp--;

							res-=a2;
							}
							break;
						case 2 :
							// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:34:36: '+' a3= mult_expr
							{
							match(input,9,FOLLOW_9_in_sum_expr178); 
							pushFollow(FOLLOW_mult_expr_in_sum_expr183);
							a3=mult_expr();
							state._fsp--;

							res+=a3;
							}
							break;

					}

					}
					break;

				default :
					break loop5;
				}
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
		return res;
	}
	// $ANTLR end "sum_expr"



	// $ANTLR start "neg_atom"
	// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:36:1: neg_atom returns [double res] : ( ( '-' a1= neg_atom ) | ( '+' a2= neg_atom ) | (a3= atom ) );
	public final double neg_atom() throws RecognitionException {
		double res = 0.0;


		double a1 =0.0;
		double a2 =0.0;
		double a3 =0.0;

		try {
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:36:30: ( ( '-' a1= neg_atom ) | ( '+' a2= neg_atom ) | (a3= atom ) )
			int alt6=3;
			switch ( input.LA(1) ) {
			case 10:
				{
				alt6=1;
				}
				break;
			case 9:
				{
				alt6=2;
				}
				break;
			case INT:
			case 6:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:37:2: ( '-' a1= neg_atom )
					{
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:37:2: ( '-' a1= neg_atom )
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:37:3: '-' a1= neg_atom
					{
					match(input,10,FOLLOW_10_in_neg_atom204); 
					pushFollow(FOLLOW_neg_atom_in_neg_atom209);
					a1=neg_atom();
					state._fsp--;

					res = -a1; 
					}

					}
					break;
				case 2 :
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:39:2: ( '+' a2= neg_atom )
					{
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:39:2: ( '+' a2= neg_atom )
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:39:3: '+' a2= neg_atom
					{
					match(input,9,FOLLOW_9_in_neg_atom219); 
					pushFollow(FOLLOW_neg_atom_in_neg_atom224);
					a2=neg_atom();
					state._fsp--;

					res = a2; 
					}

					}
					break;
				case 3 :
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:41:2: (a3= atom )
					{
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:41:2: (a3= atom )
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:41:3: a3= atom
					{
					pushFollow(FOLLOW_atom_in_neg_atom237);
					a3=atom();
					state._fsp--;

					res = a3; 
					}

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
		return res;
	}
	// $ANTLR end "neg_atom"

	// Delegated rules



	public static final BitSet FOLLOW_sum_expr_in_rule49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_6_in_atom81 = new BitSet(new long[]{0x0000000000000650L});
	public static final BitSet FOLLOW_sum_expr_in_atom86 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_atom90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_neg_atom_in_mult_expr110 = new BitSet(new long[]{0x0000000000000902L});
	public static final BitSet FOLLOW_11_in_mult_expr121 = new BitSet(new long[]{0x0000000000000650L});
	public static final BitSet FOLLOW_neg_atom_in_mult_expr126 = new BitSet(new long[]{0x0000000000000902L});
	public static final BitSet FOLLOW_8_in_mult_expr132 = new BitSet(new long[]{0x0000000000000650L});
	public static final BitSet FOLLOW_neg_atom_in_mult_expr137 = new BitSet(new long[]{0x0000000000000902L});
	public static final BitSet FOLLOW_mult_expr_in_sum_expr160 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_10_in_sum_expr168 = new BitSet(new long[]{0x0000000000000650L});
	public static final BitSet FOLLOW_mult_expr_in_sum_expr173 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_9_in_sum_expr178 = new BitSet(new long[]{0x0000000000000650L});
	public static final BitSet FOLLOW_mult_expr_in_sum_expr183 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_10_in_neg_atom204 = new BitSet(new long[]{0x0000000000000650L});
	public static final BitSet FOLLOW_neg_atom_in_neg_atom209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_neg_atom219 = new BitSet(new long[]{0x0000000000000650L});
	public static final BitSet FOLLOW_neg_atom_in_neg_atom224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_neg_atom237 = new BitSet(new long[]{0x0000000000000002L});
}
