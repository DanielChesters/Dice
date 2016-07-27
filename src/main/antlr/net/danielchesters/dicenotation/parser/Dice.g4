grammar Dice;

@header {
package net.danielchesters.dicenotation.parser;
}

diceSentence : dice;

dice : numberDices? diceType;

diceType : 'd'numberFaces;

numberFaces : POS_INT;

numberDices : POS_INT;

POS_INT : [0-9]+;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
