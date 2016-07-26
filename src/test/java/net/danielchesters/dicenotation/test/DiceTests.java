package net.danielchesters.dicenotation.test;

import net.danielchesters.dicenotation.DiceNotation;
import org.junit.Test;

/**
 * @author Daniel Chesters (on 26/07/16).
 */
public class DiceTests {

    @Test
    public void testD6() {
        DiceNotation.roll("d6");
    }
}
