package tal;

import static tal.Token.Type.*;

/**
 * Analizador sintáctico implementado mediante el método
 * descendente recursivo.
 * <p>En esta clase se debe implementar la gramática del lenguaje.
 */
public class ADR extends ASin
{
/**
 * Construye un analizador descendente recursivo.
 * @param lex Analizador léxico.
 */
public ADR(ALex lex)
{
    super(lex);
}

/**
 * Símbolo inicial de la gramática.
 */
public void programa()
{
    declaracion();
    bloque();
    tokenRead(EOF);
}

private void declaracion()
{
    switch(tokenType())
    {
        case ENTERO:
            tokenRead(ENTERO);
            tokenRead(ID);
			codeVariableInteger();
            declaracion();
			
            break;

        case CADENA:
            tokenRead(CADENA);
            tokenRead(ID);
			codeVariableString();
            declaracion();
            break;
    }
}

private void bloque()
{
	switch(tokenType())
	{
		case ID:
			asignacion();
			bloque();
			break;
		case IMPRIMIR: 
			impresion();
			bloque();
			break;
		case SI: 
			condicion();
			bloque();
			break;
		case MIENTRAS:
			iteracion();
			bloque();
			break;
	}
}
private void asignacion()
{
	tokenRead(ID);
	codeVariableAssignment();
	tokenRead(ASIGN);
	expresion();
	codeAssignment();
}
private void impresion()
{
	tokenRead(IMPRIMIR);
	tokenRead(IPAR);
	expresion();
	tokenRead(DPAR);
	codePrint();
}
private void condicion()
{
	tokenRead(SI);
	tokenRead(IPAR);
	expresion();
	tokenRead(DPAR);
	codeIf();
	bloque();
	sino();
	tokenRead(FIN);
}

private void sino()
{
	if(tokenType() == SINO)
	{
		tokenRead(SINO);
		codeElse();
		bloque();
	}
}

private void iteracion()
{
	tokenRead(MIENTRAS);
	tokenRead(IPAR);
	expresion();
	tokenRead(DPAR);
	bloque();
	tokenRead(FIN);
}
private void expresion()
{
	vor();
	vor1();
}
private void vor()
{
	vand();
	vand1();
}
private void vor1()
{
	if(tokenType() == OR)
	{
		tokenRead(OR);
		vor();
		vor1();
	}
}
private void vand()
{
	if(tokenType() == NEG)
	{
		tokenRead(NEG);
		vrel();
		vrel1();
	}
	else
	{
		vrel();
		vrel1();
	}
}
private void vand1()
{
	if(tokenType() == AND)
	{
		tokenRead(AND);
		vand();
		vand1();
	}
}
private void vrel() 
{
	if(tokenType() == SUM)
	{
		tokenRead(SUM);
		vsum();
		vsum1();
	}
	else
	{
		vsum();
		vsum1();
	}
}
private void vrel1()
{
	if(tokenType() == REL)
	{
		String op = tokenName();
		tokenRead(REL);
		vrel();
		codeOperator(op);
	}
}
private void vsum() 
{
	vmul();
	vmul1();
}
private void vsum1()
{
	if(tokenType() == SUM)
	{
		tokenRead(SUM);
		vsum();
		vsum1();
	}
}
private void vmul()
{
	if(tokenType() == IPAR) 
	{
		tokenRead(IPAR);
		expresion();
		tokenRead(DPAR);
	}
	else
	{
		valor();
	}
}
private void vmul1()
{
	if(tokenType() == MUL)
	{
		tokenRead(MUL);
		vmul();
		vmul1();
	}
}
private void valor() 
{
	if(tokenType() == ID)
	{
		tokenRead(ID);
	}
	else if(tokenType() == INTVAL) 
	{
		tokenRead(INTVAL);
	}
	else
	{
		tokenRead(STRVAL);
	}
}

} // ADR
