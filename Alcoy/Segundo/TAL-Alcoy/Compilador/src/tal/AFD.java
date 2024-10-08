package tal;

import java.io.*;
import static tal.Token.Type.*;

/**
 * Analizador léxico implementado mediante un
 * autómata finito determinista.
 * <p>Cada estado del autómata se implementa con un objeto Runnable.
 */
public class AFD extends ALex
{
/**
 * Construye el autómata.
 * @param fichero Fichero de texto que se debe analizar.
 * @throws IOException
 */
public AFD(String fichero) throws IOException
{
    super(fichero);
    setStart(this::inicio);
}

private void inicio()
{
    if(isDigitChar())
        state(this::intval);
    else if(isChar('f'))
    	state(this::fin);
    else if(isChar('e'))
    	state(this::entero);
    else if(isChar('c'))
    	state(this::cadena);
    else if(isChar('s'))
    	state(this::si);
    else if(isChar('m'))
    	state(this::mientras);
    else if(isChar('i'))
    	state(this::imprimir);
    else if(isIdCharStart())
    	state(this::id);
    else if(isChar('"'))
    	stateNoChar(this::strval);
    else if(isChar('='))
    	state(this::asign);
    else if(isChar('!'))
    	state(this::neg);
    else if(isChar('<'))
    	state(this::rel);
    else if(isChar('>'))
    	state(this::rel);
    else if(isChar('+') || isChar('-'))
    	state(this::sum);
    else if(isChar('*'))
    	state(this::mul);
    else if(isChar('/'))
    	state(this::mulCom);
    else if(isChar('|'))
    	state(this::or);
    else if(isChar('&'))
    	state(this::and);
    else if(isChar('('))
    	state(this::ipar);
    else if(isChar(')'))
    	state(this::dpar);
    else if(isSpaceChar())
        restart();
    else if(isEofChar())
        token(EOF);
    else
        error();
}

private void intval()
{
    if(isDigitChar())
        state(this::intval);
    else if(isIdChar())
        error();
    else
        token(INTVAL);
}

private void id()
{
	if(isIdChar())
		state(this::id);
	else 
		token(ID);
}

private void fin()
{
 if(isChar('i'))
	 state(this::fin1);
 else if(isIdChar())
	 state(this::id);
 else
	 token(ID);
} 
private void fin1()
{
	if(isChar('n'))
		state(this::fin2);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void fin2()
{
	if(isIdChar())
		state(this::id);
	else
		token(FIN);
}

private void entero() 
{
	if(isChar('n'))
		state(this::entero1);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}

private void entero1() 
{
	if(isChar('t'))
		state(this::entero2);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}

private void entero2() 
{
	if(isChar('e'))
		state(this::entero3);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void entero3() 
{
	if(isChar('r'))
		state(this::entero4);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void entero4() 
{
	if(isChar('o'))
		state(this::entero5);
	else
		token(ID);
}
private void entero5() 
{
	if(isIdChar())
		state(this::id);
	else
		token(ENTERO);
}

private void cadena()
{
	if(isChar('a'))
		state(this::cadena2);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void cadena2()
{
	if(isChar('d'))
		state(this::cadena3);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void cadena3()
{
	if(isChar('e'))
		state(this::cadena4);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void cadena4()
{
	if(isChar('n'))
		state(this::cadena5);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void cadena5()
{
	if(isChar('a'))
		state(this::cadena6);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}

private void cadena6()
{
	if(isIdChar())
		state(this::id);
	else
		token(CADENA);
}

private void si()
{
	if(isChar('i'))
		state(this::si1);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}

private void si1()
{
	if(isChar('n'))
		state(this::sino);
	else if(isIdChar())
		state(this::id);
	else
		token(SI);
}

private void sino()
{
	if(isChar('o'))
		state(this::sino1);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}

private void sino1()
{
	if(isIdChar())
		state(this::id);
	else
		token(SINO);
}

private void mientras()
{
	if(isChar('i'))
		state(this::mientras1);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void mientras1()
{
	if(isChar('e'))
		state(this::mientras2);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void mientras2()
{
	if(isChar('n'))
		state(this::mientras3);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void mientras3()
{
	if(isChar('t'))
		state(this::mientras4);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void mientras4()
{
	if(isChar('r'))
		state(this::mientras5);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void mientras5()
{
	if(isChar('a'))
		state(this::mientras6);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void mientras6()
{
	if(isChar('s'))
		state(this::mientras7);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void mientras7()
{
	if(isIdChar())
		state(this::id);
	else
		token(MIENTRAS);
}
private void imprimir()
{
	if(isChar('m'))
		state(this::imprimir2);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void imprimir2()
{
	if(isChar('p'))
		state(this::imprimir3);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void imprimir3()
{
	if(isChar('r'))
		state(this::imprimir4);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void imprimir4()
{
	if(isChar('i'))
		state(this::imprimir5);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void imprimir5()
{
	if(isChar('m'))
		state(this::imprimir6);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void imprimir6()
{
	if(isChar('i'))
		state(this::imprimir7);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void imprimir7()
{
	if(isChar('r'))
		state(this::imprimir8);
	else if(isIdChar())
		state(this::id);
	else
		token(ID);
}
private void imprimir8()
{
	if(isIdChar())
		state(this::id);
	else
		token(IMPRIMIR);
}
private void strval()
{
	if(isChar('"'))
		stateNoChar(this::strval1);
	else
		state(this::strval);
}
private void strval1()
{
	token(STRVAL);
}
private void asign()
{
	if(isChar('='))
		state(this::rel1);
	else
		token(ASIGN);
}
private void neg()
{
	if(isChar('='))
		state(this::rel1);
	else
		token(NEG);
}
private void rel()
{
	if(isChar('='))
		state(this::rel1);
	else
		token(REL);
}
private void rel1()
{
	token(REL);
}
private void sum()
{
	token(SUM);
}
private void mul()
{
	token(MUL);
}
private void or()
{
	if(isChar('|'))
		state(this::or1);
	else
		error();
}
private void or1()
{
	token(OR);
}
private void and()
{
	if(isChar('&'))
		state(this::and1);
	else
		error();
}
private void and1()
{
	token(AND);
}
private void ipar()
{
	token(IPAR);
}
private void dpar()
{
	token(DPAR);
}

private void mulCom()
{
	if(isChar('/'))
		stateNoChar(this::comLin);
	else if(isChar('*'))
		stateNoChar(this::comBloq);
	else
		token(MUL);
}

private void comLin()
{
	if(isChar('\n') || isEofChar())
		restart();
	else
		state(this::comLin);
}

private void comBloq()
{
	if(isChar('*'))
		state(this::comBloq1);
	else
		state(this::comBloq);
}

private void comBloq1()
{
	if(isChar('/'))
		restart();
	else if(isChar('*'))
		stateNoChar(this::comBloq1);
	else
		state(this::comBloq);
}

} // AFD
