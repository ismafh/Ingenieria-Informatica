public class TercerArray{
  public static void main(String args[]){
    int v[];						// Declarat
    v= new int[5];					// Creat
    for (int i= 0; i < v.length; i++) v[i]= i+1;	// Omplit
    for (int i:v) System.out.printf("%d ",i);		// Volcat
  }
}
