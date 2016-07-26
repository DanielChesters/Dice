grammar Dice;

@header {
package net.danielchesters.dicenotation.parser;
}

diceSentence : dice;

dice : 'd'NUMBER_FACES;

NUMBER_FACES : [0-9]+;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
