public class Ejer1 extends Thread{
    protected int n;
    public Ejer1(int n) {this.n = n;}
    
    private void randomSleep() {
        try {Thread.sleep (Math.round (Math.random() * 5)); }
        catch(InterruptedException ie) {ie.printStackTrace();}
    }
    
    public void run() {
        //String name = Thread.currentThread().getName();
        String hilo = "Hilo" + n;
        Thread.currentThread().setName(hilo);
        System.out.println(hilo + " Begin");

        for (int i=0; i<n; i++) {
            System.out .println(hilo +" doing iteration "+i);
            randomSleep();
        }
        System.out.println(hilo + " End");
    }
    
    public static void main(String[] argv) {
        System.out.println("--- Begin of execution ---- ");
        for (int i=0; i<10; i++) {
            Ejer1 thread = new Ejer1(i);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("--- End of execution ---- ");
    }
}