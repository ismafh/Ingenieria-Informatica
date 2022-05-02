public class Metodos {
    public static void print2D(int[][] M) {
		for(int f=0; f<M.length; f++) {
			for(int c=0; c<M[f].length; c++) {
				System.out.print(M[f][c]+" ");
			}
			System.out.println();
		}
		
	}
	public static void print2D(double [][] M) {
		for(int f=0; f<M.length; f++) {
			for(int c=0; c<M[f].length; c++) {
				System.out.print(M[f][c]+" ");
			}
			System.out.println();
		}
		
	}
	public static void print1D(int[] v) {
		for(int f=0; f<v.length; f++) {
			System.out.print(v[f]+" ");
			
		}
		
	}
	public static void print1D(double v[]) {
		for(int f=0; f<v.length; f++) {
		
				System.out.print(v[f]+" ");
		}
		
	}
	
	public static int[][] matrizTranspuesta(int M[][]){
		
		int[][] T = new int[M[0].length][M.length];
		
		for(int f=0; f<M.length; f++) {
			for(int c=0; c<M[f].length; c++) {
				T[c][f]=M[f][c];
			}
		}
		return T;
	}
	
	public static double[][] matrizTranspuesta(double M[][]){
		
		double[][] T = new double[M[0].length][M.length];
		
		for(int f=0; f<M.length; f++) {
			for(int c=0; c<M[f].length; c++) {
				T[c][f]=M[f][c];
			}
		}
		return T;
	}
	
	public static int vecesValorXen2DIterAsc(int Q[][], int x) {
		int veces=0;
		for(int f=0; f<Q.length; f++) {
			for(int c=0; c<Q[f].length; c++) {
				if(Q[f][c]==x) {
					veces++;
				}
			}
		}
		return veces;
		
	}
	public static int vecesValorXen2DIterAsc(double Q[][], double x) {
		int veces=0;
		for(int f=0; f<Q.length; f++) {
			for(int c=0; c<Q[f].length; c++) {
				if(Q[f][c]==x) {
					veces++;
				}
			}
		}
		return veces;
		
	}
	
	public static int suma1DIter(int v[]) {
		int suma=0;
		for(int e=0; e<v.length; e++) {
			suma += v[e];
		}
		return suma;
	}
	public static int suma1DRecAsc(int [] v, int elemento) {
		if(elemento==v.length-1) {
			return v[v.length-1];
		}else {
			return v[elemento]+ suma1DRecAsc(v,elemento+1);
		}
	}
	
	public static int[][] sumaMatrices(int M1[][], int M2[][]){
		int [][] matrizSuma = new int [M1.length][M1[0].length];
		
		for(int f=0; f<matrizSuma.length; f++) {
			for(int c=0; c<matrizSuma[f].length; c++) {
				matrizSuma[f][c] = M1[f][c]+M2[f][c];
			}
		}
		return matrizSuma;
	}
	public static double[][] sumaMatrices(double M1[][], double M2[][]){
		double [][] matrizSuma = new double [M1.length][M1[0].length];
		
		for(int f=0; f<matrizSuma.length; f++) {
			for(int c=0; c<matrizSuma[f].length; c++) {
				matrizSuma[f][c] = M1[f][c]+M2[f][c];
			}
		}
		return matrizSuma;
	}
	
	public static int[][] productoMatrices(int M1[][], int M2[][]){
		
		int[][] matrizProducto = new int [M1.length][M2[0].length];
		
		for(int f=0; f<matrizProducto.length; f++) {
			for(int c=0; c<matrizProducto.length; c++) {
				//Suma acumulada del producto fila por columna para obtener 
				//el elemento [f][c] de la matriz producto
				for(int k=0; k<M2.length; k++) {
					matrizProducto[f][c]+=M1[f][k]*M2[k][c];
				}
			}
		}
		return matrizProducto;
		
	}
	public static boolean estaOrdeAscArray1D(int[] w) {
		for(int  k=0; k<=w.length-2; k++) {
			if(w[k]>w[k+1]) {
				return false;
			}
		}
		return true;
	}
	public static boolean estaOrdeAscArray1D(double[] w) {
		for(int  k=0; k<=w.length-2; k++) {
			if(w[k]>w[k+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean estaOrdeAscArray1DRec(int[] z, int pos) {
		if(pos>=z.length-1) {
			return true;
		}else if(z[pos]>z[pos+1]) {
			return false;
		}else {
			return estaOrdeAscArray1DRec(z,pos+1);
		}
	}
	public static boolean estaOrdeAscArray1DRec(double[] z, int pos) {
		if(pos>=z.length-1) {
			return true;
		}else if(z[pos]>z[pos+1]) {
			return false;
		}else {
			return estaOrdeAscArray1DRec(z,pos+1);
		}
	}
	public static int valorMaximoDelArray(int v[]) {
		int max=v[0];
		for(int i=1; i<v.length; i++) {
			if(max<v[i]) {
				max=v[i];
			}
		}
		return max;
	}
	public static double valorMaximoDelArray(double v[]) {
		double max=v[0];
		for(int i=1; i<v.length; i++) {
			if(max<v[i]) {
				max=v[i];
			}
		}
		return max;
	}
	public static int valorMinimoDelArray(int v[]) {
		int min=v[0];
		for(int i=1; i<v.length; i++) {
			if(min>v[i]) {
				min=v[i];
			}
		}
		return min;
	}
	public static int valorMaximoDelArray(int[][] M) {
		int max=M[0][0];
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M[i].length; j++) {
				if(max<M[i][j]) {
					max=M[i][j];
				}
			}
		}
		return max;
		
	}
	public static int[] reshape(int M[][]) {
		int w[] = new int[M.length*M[0].length];
		int k=0;
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M[i].length; j++) {
				w[k]=M[i][j];
				k++;
			}
		}
		return w;
		
	}
	public static int cerosConsecAlFinal(int v[]) {
		int contador=0;
		for(int i=v.length-1; i>=0; i--) {
			if(v[i]==0) {
				contador++;
			}else {
				return contador;
			}
		}
		return contador;
	}
	
	public static int cerosConsecAlFinalRecDes(int w[], int pos) {
		if(pos<0) {
			return 0;
		}else if(w[pos]!=0) {
			return 0;
		}else {
			return 1+cerosConsecAlFinalRecDes(w,pos-1);
		}
	}
	
	public static boolean dentroRango(double v[], double rango[]) {
		
		for(int k=0; k<v.length; k++) {
			if(v[k]<rango[0] || v[k]>rango[1]) {
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean esSimetrica(double w[][]){
		for(int f=0; f<w.length; f++) {
			for(int c=0; c<w[0].length; c++) {
				if(w[f][c]!=w[c][f]) {
					return false;
				}
			}
			
		}
		return true;
	
	}
	public static boolean sumaMasqueX(double w[], double x){
		double suma=w[0];
		for(int f=0; f<w.length-1; f++) {
			if(suma>=x){
					return true;
			}else {
				suma+=suma+w[f+1];
			}
			
		}
		return false;
	
	}
	
	
	public static int[] invierteVector(int a[]) {
		int v[] = new int[a.length];
		for(int e=0; e<a.length/2; e++) {
			v[e]=a[a.length-1-e];
			v[a.length-1-e]=a[e];
		}
		return v;
	}
	

}


