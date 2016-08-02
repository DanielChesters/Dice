package net.danielchesters.dicenotation.parser;

import net.danielchesters.dicenotation.model.*;

/**
 * @author Daniel Chesters (on 26/07/16).
 */
public class DiceListenerImpl extends DiceBaseListener {

    private Dice dice;

    @Override public void enterExpression(DiceParser.ExpressionContext ctx) {
        if (dice == null) {
            dice = createDice(ctx);
        }
    }

    private Dice createDice(DiceParser.ExpressionContext ctx) {
        if (ctx.dice() != null) {
            return createRealDices(ctx.dice());
        } else if (ctx.constant() != null) {
            return new Constant(Integer.parseInt(ctx.constant().getText()));
        } else {
            switch (ctx.operator.getText()) {
                case "+":
                    return new Expression(createDice(ctx.left), createDice(ctx.right),
                        Expression.Operation.PLUS);
                case "-":
                    return new Expression(createDice(ctx.left), createDice(ctx.right),
                        Expression.Operation.MINUS);
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    private Dice createRealDices(DiceParser.DiceContext dice) {
        int numberDices = 0;
        int numberFaces;
        if (dice.numberDices() != null) {
            numberDices = Integer.parseInt(dice.numberDices().getText());
        }
        String faces = dice.diceType().numberFaces().getText();
        switch (faces) {
            case "%":
                numberFaces = 100;
                break;
            default:
                numberFaces = Integer.parseInt(faces);
                break;
        }
        if (numberDices > 1) {
            return new MultipleDice(numberFaces, numberDices);
        } else {
            return new SimpleDice(numberFaces);
        }
    }


    public int roll() {
        return dice.roll();
    }
}
