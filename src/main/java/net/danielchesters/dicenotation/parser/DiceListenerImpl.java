package net.danielchesters.dicenotation.parser;

import net.danielchesters.dicenotation.model.Dice;

/**
 * @author Daniel Chesters (on 26/07/16).
 */
public class DiceListenerImpl extends DiceBaseListener {

    private Dice dice;

    @Override public void enterDice(DiceParser.DiceContext ctx) {
        dice = new Dice(Integer.parseInt(ctx.NUMBER_FACES().getText()));
    }

    public int roll() {
        return dice.roll();
    }
}
