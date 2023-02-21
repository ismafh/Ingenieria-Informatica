public class MisMetodos {
    public static void main(String[] args) {
		
		
		int M[][] = {{1,2,0},{0,5,6}};
		int M1[][] = {{1,2},{30,4},{5,6}};
		
		int T[][] =Metodos.matrizTranspuesta(M);
		
		Metodos.print2D(M);
		System.out.println("Matriz transpuesta");
		Metodos.print2D(T);
		
		int ceros = Metodos.vecesValorXen2DIterAsc(M, -9);
		System.out.println("El valor indicado está repetido "+ ceros + " veces");
		
		int v[] = {-1,-2,-3,-9,-5,-6,-7};
		
		int suSuma = Metodos.suma1DIter(v);
		int suSumaRec = Metodos.suma1DRecAsc(v, 0);
		
		System.out.println(suSuma +" " +suSumaRec);
		
		int prodMatriz[][] = Metodos.productoMatrices(M, M1);
		
		System.out.println("-----------");
		
		Metodos.print2D(prodMatriz);
		
		System.out.println(MyMath.decimal2HexadecimalRec(16));
		
		if(Metodos.estaOrdeAscArray1D(v)) {
			System.out.println("Está ordenado");
		}else {
			System.out.println("No está ordenado");
		}
		if(Metodos.estaOrdeAscArray1DRec(v, 0)) {
			System.out.println("Está ordenado");
		}else {
			System.out.println("No está ordenado");
		}
		
		
		System.out.println(MyMath.invierteNumeroIter(-1002));
		System.out.println(Metodos.valorMaximoDelArray(v));
		System.out.println(Metodos.valorMinimoDelArray(v));
		System.out.println(Metodos.valorMaximoDelArray(M1));
		
		int zz[]= {1,2,3,5,0,0,0,0};
		
		System.out.println(Metodos.cerosConsecAlFinal(zz));
		System.out.println(Metodos.cerosConsecAlFinalRecDes(zz, zz.length-1));
		
		int[]g=Metodos.invierteVector(zz);

		Metodos.print1D(zz);
		System.out.println();
		Metodos.print1D(g);
	}

}
