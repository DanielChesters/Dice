package net.danielchesters.dicenotation.model;

/**
 * @author Daniel Chesters (on 27/07/16).
 */
public class MultipleDice extends SimpleDice implements Dice {
    private int dices;

    public MultipleDice(int faces, int dices) {
        super(faces);
        this.dices = dices;
    }

    @Override public int roll() {
        int total = 0;
        for (int i = 0; i < dices; i++) {
            total += super.roll();
        }
        return total;
    }
}
