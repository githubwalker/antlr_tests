// $ANTLR 3.5.2 C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g 2015-12-06 17:16:58

	package org.alprojects.antlr_test; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SampleLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g"; }

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:11:6: ( '(' )
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:11:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:12:6: ( ')' )
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:12:8: ')'
			{
			match(')'); 
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
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:13:6: ( '*' )
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:13:8: '*'
			{
			match('*'); 
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
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:14:6: ( '+' )
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:14:8: '+'
			{
			match('+'); 
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
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:15:7: ( '-' )
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:15:9: '-'
			{
			match('-'); 
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
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:16:7: ( '/' )
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:16:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:44:4: ( ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+ )
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:44:6: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
			{
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:44:6: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:45:5: ( ( '0' .. '9' )+ )
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:45:7: ( '0' .. '9' )+
			{
			// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:45:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:
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
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | WS | INT )
		int alt3=8;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt3=1;
			}
			break;
		case ')':
			{
			alt3=2;
			}
			break;
		case '*':
			{
			alt3=3;
			}
			break;
		case '+':
			{
			alt3=4;
			}
			break;
		case '-':
			{
			alt3=5;
			}
			break;
		case '/':
			{
			alt3=6;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt3=7;
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
			alt3=8;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:1:10: T__6
				{
				mT__6(); 

				}
				break;
			case 2 :
				// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:1:15: T__7
				{
				mT__7(); 

				}
				break;
			case 3 :
				// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:1:20: T__8
				{
				mT__8(); 

				}
				break;
			case 4 :
				// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:1:25: T__9
				{
				mT__9(); 

				}
				break;
			case 5 :
				// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:1:30: T__10
				{
				mT__10(); 

				}
				break;
			case 6 :
				// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:1:36: T__11
				{
				mT__11(); 

				}
				break;
			case 7 :
				// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:1:42: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// C:\\PROJECTS\\antlr_galileo\\ANTLR_TEST\\src\\org\\alprojects\\antlr_test\\Sample.g:1:45: INT
				{
				mINT(); 

				}
				break;

		}
	}



}
