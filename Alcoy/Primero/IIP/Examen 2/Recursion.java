public class Recursion {
    //Ejemplo recursion suma elementos array

    public static int sumaelementos(int e[],int n){
        
        
        if(n == e.length-1) {
            return e[n] ;
        }else{
            return e[n]+sumaelementos(e,n+1);
        
        }
    }





    public static int masgrande(int e[]){//Recursividad devolver numero mas grande array
        int i=0;
        int masgrande=0;
        while (i<e.length-1){
            if(masgrande < e[i]){
                masgrande=e[i];
                
            }
        i++;
        }
        return masgrande;
    }
    public static int maspequeño(int e[]){
        int i=0;
        int maspequeño=e[0];
        while (i<e.length-1){
            if(maspequeño > e[i]){
                maspequeño=e[i];
                
            }
        i++;
        }
        return maspequeño;
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
    
    int a[]={6,2,3,4,7,8,435,1};
    int n=0;
    int suma;

    suma =Recursion.sumaelementos(a, n);
    System.out.println("La suma es "+suma);


    int grande;
    grande = Recursion.masgrande(a);
    System.out.println("El numero mas grande es: "+grande);
    

    }
}
