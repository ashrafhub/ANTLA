package a.b.c;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class XLTest {

	public static void main(String[] args) throws RecognitionException {
		// TODO Auto-generated method stub
		CharStream charStream =  new ANTLRStringStream("once upon a time");
		XLLexer lexer = new XLLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		XLParser parser = new XLParser(tokenStream);
		parser.program();
		System.out.println("done!");
	}

}
