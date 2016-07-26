package net.danielchesters.dicenotation.model;

import java.util.Random;

/**
 * @author Daniel Chesters (on 26/07/16).
 */
public class Dice {

    public Dice(int faces) {
        this.faces = faces;
    }

    private int faces;

    public int roll() {
        return 1 + new Random().nextInt(faces);
    }
}
