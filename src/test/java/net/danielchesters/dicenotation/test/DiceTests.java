package net.danielchesters.dicenotation.test;

import net.danielchesters.dicenotation.DiceNotation;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.assertThat;

/**
 * @author Daniel Chesters (on 26/07/16).
 */
public class DiceTests {

    @Test
    public void testD6() {
        assertThat(DiceNotation.roll("d6"), allOf(greaterThanOrEqualTo(1),
            lessThanOrEqualTo(6)));
    }
}
