package net.danielchesters.dicenotation.model;

/**
 * @author Daniel Chesters (on 27/07/16).
 */
public class Constant implements Dice {
    private int constant;

    public Constant(int constant) {
        this.constant = constant;
    }

    @Override public int roll() {
        return constant;
    }
}
