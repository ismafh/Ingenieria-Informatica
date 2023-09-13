public class Ejer1 extends Thread{
   protected int i;
   protected String nombrehilo;
   public Ejer1(int i, String nombrehilo){
    this.i=i;
    this.setName(nombrehilo);
  }

   public void run() {
    for(int j=0; j<5;j++){
      System.out.println(Thread.currentThread().getName()+ " Iteracion " + j);
    }
   }
   
    public static void main(String[] args) {
      
      for(int i=0; i<3; i++){
        String nombrehilo="Hilo: " + i;
         Ejer1 hilo = new Ejer1(i,nombrehilo);
        hilo.start();
      }
    }
}