package net.danielchesters.dicenotation.parser;

import net.danielchesters.dicenotation.model.Dice;
import net.danielchesters.dicenotation.model.MultipleDice;
import net.danielchesters.dicenotation.model.SimpleDice;

/**
 * @author Daniel Chesters (on 26/07/16).
 */
public class DiceListenerImpl extends DiceBaseListener {

    private Dice dice;
    private int numberDices;

    @Override public void enterNumberDices(DiceParser.NumberDicesContext ctx) {
        numberDices = Integer.parseInt(ctx.getText());
    }

    @Override public void enterDiceType(DiceParser.DiceTypeContext ctx) {
        String faces = ctx.numberFaces().getText();
        int numberFaces;
        switch (faces) {
            case "%" :
                numberFaces = 100;
                break;
            default:
                numberFaces = Integer.parseInt(faces);
                break;
        }
        if (numberDices > 1) {
            dice = new MultipleDice(numberFaces, numberDices);
        } else {
            dice = new SimpleDice(numberFaces);
        }
    }

    public int roll() {
        return dice.roll();
    }
}
