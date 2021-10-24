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
    else if(isChar('i'))
    	state(this::imprimir);
    else if(isChar('m'))
    	state(this::mientras);
    else if(isChar('c'))
    	state(this::cadena);
    else if(isChar('e'))
    	state(this::entero);
    else if(isChar('f'))
    	state(this::fin);
    else if(isChar('s'))
    	state(this::Si);
    else if(isIdCharStart())
    	state(this::Id);
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

private void fin() {
	if(isChar('i'))
		state(this::fin1);
	else if(isIdChar())
		state(this::Id);
}

private void fin1() {
	if(isChar('n'))
		state(this::fin2);
	else if(isIdChar())
		state(this::Id);
}

private void fin2() {
	if(isIdChar())
		state(this::Id);
	else token(FIN);
}

private void Id() {
	if(isIdChar())
		state(this::Id);
	else token(ID);
}
private void Si() {
	if(isChar('i'))
		state(this::Si1);
	else if(isIdChar())
		state(this::Id);
		
}
private void Si1() {
	if(isChar('n'))
		state(this::sino);
	else if(isIdChar())
		state(this::Id);
	else token(SI);
		
}
private void sino() {
	if(isChar('o'))
		state(this::sino1);
}
private void sino1() {
	if(isIdChar())
		state(this::Id);
	else token(SINO);
}
private void entero() {
	if(isChar('n'))
		state(this::entero1);
	else if(isIdChar())
		state(this::Id);
}
private void entero1() {
	if(isChar('t'))
		state(this::entero2);
	else if(isIdChar())
		state(this::Id);
}
private void entero2() {
	if(isChar('e'))
		state(this::entero3);
	else if(isIdChar())
		state(this::Id);
}
private void entero3() {
	if(isChar('r'))
		state(this::entero4);
	else if(isIdChar())
		state(this::Id);
}
private void entero4() {
	if(isChar('o'))
		state(this::entero5);
	else if(isIdChar())
		state(this::Id);
}
private void entero5() {
	if(isIdChar())
		state(this::Id);
	else token(ENTERO);
}
private void cadena() {
	if(isChar('a'))
		state(this::cadena1);
		else if(isIdChar())
			state(this::Id);
}
private void cadena1() {
	if(isChar('d'))
		state(this::cadena2);
		else if(isIdChar())
			state(this::Id);
}
private void cadena2() {
	if(isChar('e'))
		state(this::cadena3);
		else if(isIdChar())
			state(this::Id);
}
private void cadena3() {
	if(isChar('n'))
		state(this::cadena4);
		else if(isIdChar())
			state(this::Id);
}
private void cadena4() {
	if(isChar('a'))
		state(this::cadena5);
		else if(isIdChar())
			state(this::Id);
}
private void cadena5() {
		if(isIdChar())
			state(this::Id);
		else token(CADENA);
}
private void mientras() {
	if(isChar('i'))
		state(this::mientras1);
		else if(isIdChar())
			state(this::Id);
}
private void mientras1() {
	if(isChar('e'))
		state(this::mientras2);
		else if(isIdChar())
			state(this::Id);
}
private void mientras2() {
	if(isChar('n'))
		state(this::mientras3);
		else if(isIdChar())
			state(this::Id);
}
private void mientras3() {
	if(isChar('t'))
		state(this::mientras4);
		else if(isIdChar())
			state(this::Id);
}
private void mientras4() {
	if(isChar('r'))
		state(this::mientras5);
		else if(isIdChar())
			state(this::Id);
}
private void mientras5() {
	if(isChar('a'))
		state(this::mientras6);
		else if(isIdChar())
			state(this::Id);
}
private void mientras6() {
	if(isChar('s'))
		state(this::mientras7);
		else if(isIdChar())
			state(this::Id);
}
private void mientras7() {
		if(isIdChar())
			state(this::Id);
		else token(MIENTRAS);
}
private void imprimir() {
	if(isChar('m'))
		state(this::imprimir1);
	else if(isIdChar())
		state(this::Id);
}
private void imprimir1() {
	if(isChar('p'))
		state(this::imprimir2);
	else if(isIdChar())
		state(this::Id);
}
private void imprimir2() {
	if(isChar('r'))
		state(this::imprimir3);
	else if(isIdChar())
		state(this::Id);
}
private void imprimir3() {
	if(isChar('i'))
		state(this::imprimir4);
	else if(isIdChar())
		state(this::Id);
}
private void imprimir4() {
	if(isChar('m'))
		state(this::imprimir5);
	else if(isIdChar())
		state(this::Id);
}
private void imprimir5() {
	if(isChar('i'))
		state(this::imprimir6);
	else if(isIdChar())
		state(this::Id);
}
private void imprimir6() {
	if(isChar('r'))
		state(this::imprimir7);
	else if(isIdChar())
		state(this::Id);
}
private void imprimir7() {
	if(isIdChar())
		state(this::Id);
	else token(IMPRIMIR);
}
}



 // AFD
