/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Desespero;

// Parser Rules

//Escopo do programa


prog : INICIO CHAVESABRE funcoes CHAVESFECHA FIM;

//*Escopo de funções
funcoes: (tipoComVoid ID PARENTESEABRE parametros PARENTESEFECHA bloco funcoes)?;
parametros : (tipo ID (VIRGULA tipo ID)*)?;

//**Escopo de bloco
bloco: CHAVESABRE comandos CHAVESFECHA ;

//*** Comandos
comandos: (condicionais|((retorno|declaracoes|atribuicoes|chamadaFuncao)PONTOEVIRGULA))*;
//**** Retorno
retorno: RETORNO expressao;

//**** Chamada de Funcao
chamadaFuncao: ID PARENTESEABRE parametrosChamada PARENTESEFECHA;
parametrosChamada: (expressao (VIRGULA expressao)*)? ;

//**** Condicionais
condicionais: ifdes | whiledes | fordes | dodes PONTOEVIRGULA | switchdes;

ifdes: IFDES PARENTESEABRE expressao PARENTESEFECHA bloco (ifdeselse|ifdeselseif)?;
ifdeselse: ELSE bloco;
ifdeselseif: ELSE ifdes ;
whiledes: WHILEDES PARENTESEABRE expressao PARENTESEFECHA bloco;
fordes: FORDES PARENTESEABRE (declaracoes|atribuicoes) PONTOEVIRGULA expressao PONTOEVIRGULA atribuicoes PARENTESEFECHA bloco;
dodes: DODES bloco WHILEDES PARENTESEABRE expressao PARENTESEFECHA;
switchdes: SWITCHDES PARENTESEABRE expressao PARENTESEFECHA CHAVESABRE switchCase defaultdes CHAVESFECHA;
switchCase: (CASE expressao DOISPONTOS comandos (BREAK)?)* ;
defaultdes: (DEFAULTDES DOISPONTOS comandos (BREAK)?)? ;
//**** Declaracoes
declaracoes: tipo ID ((IGUAL expressao)|(multidimensional(IGUAL declaracoesArray)?))?;
multidimensional: (COLCHETESABRE CONSTINTEIRO COLCHETESFECHA)+;

declaracoesArray: CHAVESABRE (subArrayDeclaracoes|declaracoesArray) CHAVESFECHA (VIRGULA CHAVESABRE (subArrayDeclaracoes|declaracoesArray) CHAVESFECHA)*;
subArrayDeclaracoes: expressao (VIRGULA expressao)* ;

//**** Atribuições
atribuicoes: ID (multidimensional)? ((atribuicoesIncEDec)|(IGUAL expressao));
atribuicoesIncEDec: MAIS MAIS|MENOS MENOS;

//Definições gerais
tipoComVoid: VOID | tipo;
tipo: INT | STRING | DOUBLE | BOOL | BIN | HEXA;

// NEW Expressões
expressao: (op_neg)?(val_final)((operations)(val_final))*;

operations : op_rel | op_neg | op_bitwise | op_arit_baixa | op_logica;
op_rel : MAIORQUE | MENORQUE | MAIOROUIGUAL | MENOROUIGUAL | IDENTICO | DIFERENTE;
op_neg : MENOS | BITNOT | NOT;
op_bitwise : BITSHIFTLEFT | BITSHIFTRIGHT;
op_arit_baixa : MAIS;
op_logica : AND | OR2 | NOT | AND2 ;
val_final : CONSTINTEIRO | CONSTSTRING | CONSTLOGICO | CONSTREAL | ID | chamadaFuncao | ID multidimensional | PARENTESEABRE expressao PARENTESEFECHA;
//// Expressões
//expressao : expressao OR exp1 | exp1;
//exp1 : exp1 AND exp2 | exp2;
//exp2 : exp2 OR2 exp3 | exp3;
//exp3 : exp3 NOT exp4 | exp4;
//exp4 : exp4 AND2 exp5 | exp5;
//exp5 : exp5 op_rel exp6 | exp6;
//exp6 : exp6 op_bitwise exp7 | exp7;
//exp7 : exp7 op_arit_baixa exp8 | exp8;
////exp8 : exp8 op_arit_alta exp9 | exp9 ; SEM SUPORTE ORIGINAL
//exp8 : exp9 ; //Alterada
//exp9 : op_neg exp10 | exp10;
//exp10 : CONSTINTEIRO | CONSTSTRING | CONSTLOGICO | CONSTREAL | ID | chamadaFuncao | ID multidimensional | PARENTESEABRE expressao PARENTESEFECHA;

//op_rel : MAIORQUE | MENORQUE | MAIOROUIGUAL | MENOROUIGUAL | IDENTICO | DIFERENTE;
//op_neg : MENOS | BITNOT | NOT;
//op_bitwise : BITSHIFTLEFT | BITSHIFTRIGHT;
//op_arit_baixa : MAIS | MENOS;
////op_arit_alta : "*" | "/" | "%"; (Sem suporte)

//// Lexer Rules

//*****************Palavras Reservadas*******************//
INICIO: 'CORRAM PARA AS COLINAS!!!';
FIM: 'VAMOS TODOS MORRER';

IFDES : 'POR AQUI!!!';
ELSE : 'NAO, DROGA POR AQUI!!!';
WHILEDES : 'CADE A SAIDA!!!';
FORDES : 'NOS PERDEMOS DE NOVO...';
DODES : 'CORRAM PARA AS COLINAS... DE NOVO';

INT : 'TA TODO MUNDO INTEIRO?!?';
STRING : 'AONDE FICA A CADEIA?!?';
DOUBLE : 'NAO PODE SER REAL...';
BOOL : 'ACHO QUE FOI UM FANTASMA!!!';
BIN : 'OU É VOCE OU EU !';
HEXA : 'ESTOU TROCANDO NUMEROS POR LETRAS';
VOID : 'ESTOU ME SENTINDO TAO VAZIO...';

BREAK : 'YOU SHALL NOT PASS!!!';

SWITCHDES : 'SALVEM-SE QUEM PUDER!!!';
CASE : 'AAAH!!';
DEFAULTDES : 'AAAAAAAAAAAAH!!!!!'; //15

//Operadores Aritméticos

MAIS : 'CARREGUE!!!';
MENOS : 'DESCARREGUE!!!'; //17

//Operadores Relacionais

MAIORQUE : '>;-;>';
MENORQUE : '<;-;<';
MAIOROUIGUAL : '>;-;|';
MENOROUIGUAL : '<;-;|';
IDENTICO : '|;-;|';
DIFERENTE : '!;-;!'; //23

//Operadores Logicos

AND : 'JUNTOS CONSEGUIREMOS!!!';
OR : 'CADA UM POR SI!!!';
AND2 : 'JUNTOS CONSEGUIREMOS!!! MAS SE DER MERDA NEM VOU CONTINUAR';
OR2 : 'CADA UM POR SI!!! MAS SE DER MERDA NEM VOU CONTINUAR';
NOT : 'NAAAAAO!!!'; //26

//Operadores Bit a Bit

BITSHIFTRIGHT : 'CRIANCAS, AVANCAR!!!';
BITSHIFTLEFT : 'CRIANCAS, RECUAR!!!';
BITAND : 'CRIANCAS, JUNTOS CONSEGUIREMOS!!!';
BITOR : 'CRIANCAS, CADA UM POR SI!!!';
BITXOR : 'CRIANCAS, SO UM SOBREVIVERA';
BITNOT : 'CRIANCAS, NAAAAAO!!!'; //32

//Valores Constantes ???

CONSTREAL : [0-9]+'.'[0-9]+;
CONSTINTEIRO : [0-9]+;
CONSTBINARIO : '0b'[01]+;
CONSTHEXA : '0x'[A-Fa-f0-9]+;
CONSTSTRING : '"'(~["\\]|'\\'.)*'"'; //37
CONSTLOGICO : '(VIVO)|(MORTO)';

//Comentarios

COMENTARIOLINHA : 'PSIU'~[\n\r]* -> skip;
COMENTARIOMULTIPLO : 'PSIIIU'(.|'\n')*'COFCOF' -> skip; //39

//DELIMITADORES

PONTO : '.';
IGUAL : ';-;';
PONTOEVIRGULA : ';';
VIRGULA : ',';
DOISPONTOS : ':';
COLCHETESABRE : 'AI';
COLCHETESFECHA : 'AI!';
CHAVESABRE : 'OUCH';
CHAVESFECHA : 'OUCH!'; //47
PARENTESEABRE : 'UI';
PARENTESEFECHA: 'UI!';

//EXTRA

ID : [A-Za-z_][A-Za-z_0-9]*;
RETORNO : 'VOLTEM!VOLTEM!VOLTEM!!!';
//IGNORADOS

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;

//Exemples
/*
ARTICLE : 'the' | 'an' | 'a' ;

OF : 'of' ;

DRINKING_VESSEL : 'cup' | 'pint' | 'shot' | 'mug' | 'glass' ;

TEXT : [a-z]+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
*/