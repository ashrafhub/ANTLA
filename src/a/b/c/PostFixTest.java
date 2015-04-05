package a.b.c;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class PostFixTest {

	public static void main(String[] args) throws RecognitionException {
		// TODO Auto-generated method stub
		CharStream charStream = new ANTLRStringStream("9+3-2");
		PostFixLexer lexer = new PostFixLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		PostFixParser parser = new PostFixParser(tokenStream);
		parser.expr();
		System.out.println("\ndone!");
	}

}
