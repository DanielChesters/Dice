grammar Dice;

@header {
package net.danielchesters.dicenotation.parser;
}

line : expression EOF;

expression : left = expression operator=(PLUS|MINUS) right = expression
           | dice
           | constant;

dice : numberDices? diceType;
diceType : D numberFaces;
numberFaces : (POS_INT | PERCENTILE);
numberDices : POS_INT;
constant : POS_INT;

POS_INT : [0-9]+;
PERCENTILE : '%';
D : 'd';
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C')+ -> skip ;
PLUS : '+';
MINUS : '-';
