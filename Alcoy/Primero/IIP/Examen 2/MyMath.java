public class MyMath {
    //Método convierte un número decimal a hexadecimal (base 16)
	
	public static String decimal2HexadecimalRec(int decimal) {
		
		if(decimal<10) {
			return Integer.toString(decimal);
		}else if(decimal<16) {
			switch(decimal) {
				case 10 : return "A";
				case 11 : return "B";
				case 12 : return "C";
				case 13 : return "D";
				case 14 : return "E";
				default : return "F";
			}
		}else{
			return decimal2HexadecimalRec(decimal/16)+decimal%16;
		}
		
	}
	
	public static int invierteNumeroIter(int numero) {
		boolean negativo=false;
		if(numero<0) {
			numero=Math.abs(numero);
			negativo =true;
			
		}
		int numInv=0;
		while(numero!=0) {
			int cifra =numero%10;
			numero/=10;
			numInv=numInv*10+cifra;
		}
		if(negativo) {
			return numInv*(-1);
		}else {
			return numInv;
		}
	}
	public static int valorMaximo(int a, int b) {
		if(a>=b) {
			return a;
		}else {
			return b;
		}
	}
	public static int valorMaximo(int a, int b, int c) {
		return valorMaximo(valorMaximo(a,b),c);
	}


}
