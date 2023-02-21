public class Estudiante {
    // Ejemplo tupla(objeto), si es private hay que hacer sus propios metodos.
    private int DNI;
    String nombre;
    String apellido;
    double nota;
    char letradni;




    public Estudiante(int dni,String n, String a,double nota, char ldni){

        this.DNI=dni;
    }
    
    
    
    public void setDNI(int dni){
        this.DNI=dni;
    }
    
    
    
    public int getDNI(){
        return this.DNI;
    }















public static int[][] createMatrix(int[] v1, int[] v2){
    int res;
    if(v1.length>v2.length){
        res = v1.length;
    } else{
        res=v2.length; 
    }
    int[][] array=new int[2][res];
    
    for(int i=0;i<v1.length;i++){
       array[0][i]=v1[i];    
    }
    for(int j=0;j<v2.length;j++){
        array[1][j] =v2[j];    
    }
    
    
    
    
    
    return array;
}
}