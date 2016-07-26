package net.danielchesters.dicenotation.parser;

import net.danielchesters.dicenotation.model.Dice;

/**
 * @author Daniel Chesters (on 26/07/16).
 */
public class RealDiceParserListener extends DiceBaseListener {

    @Override public void enterDice(DiceParser.DiceContext ctx) {
        Dice dice = new Dice(Integer.parseInt(ctx.NUMBER_FACES().getText()));
        System.out.println(dice.roll());
    }
}
