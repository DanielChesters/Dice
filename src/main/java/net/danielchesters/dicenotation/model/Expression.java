package net.danielchesters.dicenotation.model;

/**
 * @author Daniel Chesters (on 27/07/16).
 */
public class Expression implements Dice {
    private Dice leftDice;
    private Dice rightDice;
    private Operation operation;
    public Expression(Dice leftDice, Dice rightDice, Operation operation) {
        this.leftDice = leftDice;
        this.rightDice = rightDice;
        this.operation = operation;
    }

    @Override public int roll() {

        switch (operation) {
            case PLUS:
                return leftDice.roll() + rightDice.roll();
            case MINUS:
                return leftDice.roll() - rightDice.roll();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public enum Operation {
        PLUS, MINUS
    }
}
