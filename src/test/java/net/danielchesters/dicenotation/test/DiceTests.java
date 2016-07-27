package net.danielchesters.dicenotation.test;

import net.danielchesters.dicenotation.DiceNotation;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.*;
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

    @Test
    public void testD4() {
        assertThat(DiceNotation.roll("d4"), allOf(greaterThanOrEqualTo(1),
            lessThanOrEqualTo(4)));
    }

    @Test
    public void testD8() {
        assertThat(DiceNotation.roll("d8"), allOf(greaterThanOrEqualTo(1),
            lessThanOrEqualTo(8)));
    }

    @Test
    public void testD10() {
        assertThat(DiceNotation.roll("d10"), allOf(greaterThanOrEqualTo(1),
            lessThanOrEqualTo(10)));
    }

    @Test
    public void testD12() {
        assertThat(DiceNotation.roll("d12"), allOf(greaterThanOrEqualTo(1),
            lessThanOrEqualTo(12)));
    }

    @Test
    public void testD20() {
        assertThat(DiceNotation.roll("d20"), allOf(greaterThanOrEqualTo(1),
            lessThanOrEqualTo(20)));
    }

    @Test
    public void test2D6() {
        assertThat(DiceNotation.roll("2d6"), allOf(greaterThanOrEqualTo(2),
            lessThanOrEqualTo(12)));
    }

    @Test
    public void testD1() {
        assertThat(DiceNotation.roll("d1"), equalTo(1));
    }

    @Test
    public void testPercentileDice() {
        assertThat(DiceNotation.roll("d%"), allOf(greaterThanOrEqualTo(1), lessThanOrEqualTo(100)));
    }
}
