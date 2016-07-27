package net.danielchesters.dicenotation.model;

import java.util.Random;

/**
 * @author Daniel Chesters (on 27/07/16).
 */
public class SimpleDice implements Dice {

    private int faces;

    public SimpleDice(int faces) {
        this.faces = faces;
    }

    @Override public int roll() {
        return 1 + new Random().nextInt(faces);
    }
}
