package org.alprojects.entry_point;

import org.alprojects.antlr_test.SampleLexer;
import org.alprojects.antlr_test.SampleParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;


public class App {

	/**
	 * @param args
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws RecognitionException {
		// TODO Auto-generated method stub
		// CharStream stm = new ANTLRStringStream( "-1 + 3 * 15 + (1+2) * - ( -8 + 123 )" );
		// CharStream stm = new ANTLRStringStream( "(1+3) - 8 * ( (-2+4) + 11 ) * 9" );
		
		if ( args.length != 1 )
		{
			System.err.println( "Please provide math expression with integer vales" );
			System.err.println( "Example: \"-1 + 3 * 15 + (1+2) * - ( -8 + 123 )\"" );
			System.exit(1);
		}
		
		System.out.println( args[0] );
		
		CharStream stm = new ANTLRStringStream( args[0] );
		
		SampleLexer sl = new SampleLexer( stm );
		TokenStream ts = new CommonTokenStream(sl);
		SampleParser sp = new SampleParser(ts);
		
		double rv = sp.rule();
		System.out.println( "done" );
		System.out.println( "result is : " + Double.toString(rv) );
	}

}

