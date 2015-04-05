package a.b.c;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class SampleTest {

	public static void main(String[] args) throws RecognitionException {
		// TODO Auto-generated method stub
		CharStream charStream =  new ANTLRStringStream("program XLSample1 = \r\n" + 
				"constant one : Integer :=1;\r\n" + 
				"constant one : Integer :=2;\r\n" + 
				"var x, y, z         : Integer;\r\n" + 
				"begin\r\n" + 
				"end XLSample1.");
		SampleLexer lexer = new SampleLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SampleParser parser = new SampleParser(tokenStream);
		parser.program();
		System.out.println("done!");
	}

}
