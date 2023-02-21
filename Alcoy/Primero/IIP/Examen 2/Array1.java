public class Array1 {
    
        
    
    
    
    
    public static void main(String[] args) {
       
        Estudiante e1 = new Estudiante(213498612,"Juan","Joel",6.5,'J');
        int dni;
        dni=e1.getDNI();
        System.out.println(dni);
        dni=e1.getDNI();
        System.out.println(dni);
        e1.setDNI(123451235);
        dni=e1.getDNI();
        System.out.println(dni);
    }
}
