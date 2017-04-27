package net.danielchesters.dicenotation.model;

/**
 * @author Daniel Chesters (on 27/07/16).
 */
public class Constant implements Dice {
    private int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override public int roll() {
        return value;
    }
}
