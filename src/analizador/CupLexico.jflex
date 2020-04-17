package analizador;

/**
 *
 * @author Ricardo
 */

import java_cup.runtime.Symbol;
import estructuras.*;
import compartido.*;
%%
numero =[0-9]+
decimal = (numero"."numero)
letra =([a-zA-Z]|ñ|Ñ)
id=({letra})({letra}|{numero}| "_" | "-")*
cadena= "\"" ([^"\""])+ "\""




%{

%}

%cupsym CupSimbolos
%class CupLexico
%cup
%public
%line
%column
%char
%public

%%

/* Simbolos utilizados en la gramatica*/
";" 	{ return new Symbol(CupSimbolos.punto_coma, yycolumn,yyline,new String(yytext())); }
"=" 	{ return new Symbol(CupSimbolos.igual, yycolumn,yyline,new String(yytext())); }
"(" 	{ return new Symbol(CupSimbolos.par_a, yycolumn,yyline,new String(yytext())); }
")" 	{ return new Symbol(CupSimbolos.par_c, yycolumn,yyline,new String(yytext())); }
"{" 	{ return new Symbol(CupSimbolos.llaveA, yycolumn,yyline,new String(yytext())); }
"}" 	{ return new Symbol(CupSimbolos.llaveC, yycolumn,yyline,new String(yytext())); }


"var" 	{ return new Symbol(CupSimbolos.var, yycolumn,yyline,new String(yytext())); }
"imprimir" 	{ return new Symbol(CupSimbolos.imprimir, yycolumn,yyline,new String(yytext())); }
"si" 	{ return new Symbol(CupSimbolos.s_if, yycolumn,yyline,new String(yytext())); }
"sino" 	{ return new Symbol(CupSimbolos.s_else, yycolumn,yyline,new String(yytext())); }

/* expresiones regulares */
"nulo"          { return new Symbol(CupSimbolos.nulo, yycolumn,yyline,new String(yytext())); }
"verdadero"     { return new Symbol(CupSimbolos.verdadero, yycolumn,yyline,new String(yytext())); }
"falso" 	{ return new Symbol(CupSimbolos.falso, yycolumn,yyline,new String(yytext())); }
{numero} 	{ return new Symbol(CupSimbolos.numero, yycolumn,yyline,new String(yytext())); }
{decimal} 	{ return new Symbol(CupSimbolos.decimal, yycolumn,yyline,new String(yytext())); }
{id} 		{ return new Symbol(CupSimbolos.id, yycolumn,yyline,new String(yytext())); }

{cadena} 	{ 
                    String txt = yytext(); 
                    txt = FuncionesCompartidas.getString(txt);
                    return new Symbol(CupSimbolos.cadena, yyline, yycolumn, txt );
                }

/* caracteres de escape */
[ \t\r\f\n]+ {}
/* errores */
. 	{ 
            System.out.println( "ERROR LEXICO-> Caracter: " + yytext() + " Linea: "+yyline+ " Columna: "+yychar ); 
            Constantes.addError(
                new ErrorAnalisis(
                    ErrorAnalisis.TipoError.LEXICO, 
                    yyline, 
                    yychar,
                    "Caracter: " + yytext()
                )
            );
	}