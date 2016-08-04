package net.danielchesters.dicenotation.test;

import net.danielchesters.dicenotation.DiceNotation;
import org.hamcrest.Matcher;
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
        assertThat(DiceNotation.roll("d6"), getExpectedValue(1, 6));
    }

    @Test
    public void testD4() {
        assertThat(DiceNotation.roll("d4"), getExpectedValue(1, 4));
    }

    @Test
    public void testD8() {
        assertThat(DiceNotation.roll("d8"), getExpectedValue(1, 8));
    }

    @Test
    public void testD10() {
        assertThat(DiceNotation.roll("d10"), getExpectedValue(1, 10));
    }

    @Test
    public void testD12() {
        assertThat(DiceNotation.roll("d12"), getExpectedValue(1, 12));
    }

    @Test
    public void testD20() {
        assertThat(DiceNotation.roll("d20"), getExpectedValue(1, 20));
    }

    @Test
    public void test2D6() {
        assertThat(DiceNotation.roll("2d6"), getExpectedValue(2, 12));
    }

    @Test
    public void testD1() {
        assertThat(DiceNotation.roll("d1"), equalTo(1));
    }

    @Test
    public void testPercentileDice() {
        assertThat(DiceNotation.roll("d%"), getExpectedValue(1, 100));
    }

    @Test
    public void test2D6Plus5() {
        assertThat(DiceNotation.roll("2d6+5"), getExpectedValue(7, 17));
    }

    @Test
    public void test3D10Minus6() {
        assertThat(DiceNotation.roll("3d10-6"), getExpectedValue(-3, 24));
    }

    @Test
    public void testD6PlusD4() {
        assertThat(DiceNotation.roll("d6+d4"), getExpectedValue(2, 10));
    }

    @Test
    public void testD6MinusD4() {
        assertThat(DiceNotation.roll("d6-d4"), getExpectedValue(-3, 5));
    }

    private Matcher<Integer> getExpectedValue(int min, int max) {
        return allOf(greaterThanOrEqualTo(min),
            lessThanOrEqualTo(max));
    }
}
