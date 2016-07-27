package net.danielchesters.dicenotation;

import net.danielchesters.dicenotation.parser.DiceLexer;
import net.danielchesters.dicenotation.parser.DiceParser;
import net.danielchesters.dicenotation.parser.DiceListenerImpl;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @author Daniel Chesters (on 26/07/16).
 */
public class DiceNotation {
    public static int roll(String notation) {
        DiceLexer lexer = new DiceLexer(new ANTLRInputStream(notation));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DiceParser parser = new DiceParser(tokens);
        DiceParser.DiceSentenceContext diceSentenceContext = parser.diceSentence();
        ParseTreeWalker walker = new ParseTreeWalker();
        DiceListenerImpl listener = new DiceListenerImpl();
        walker.walk(listener, diceSentenceContext);

        return listener.roll();
    }
}
