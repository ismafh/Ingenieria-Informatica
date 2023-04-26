public class Ejer1 extends Thread{
    protected int n;
    public Ejer1(int n) {this.n = n;}
    
    private void randomSleep() {
    
    try {Thread.sleep (Math.round (Math.random() * 5)); }
    catch(InterruptedException ie) {ie.printStackTrace();}
    }
    
    public void run() {
    String name = Thread.currentThread().getName();
    
    for (int i=0; i<n; i++) {
    System.out .println(name +" doing iteration "+i);
    randomSleep();
    }
    System.out.println("End of thread "+ name);
    }
    public static void main(String[] argv) {
    System.out.println("--- Begin of execution ---- ");
    for (int i=0; i<10; i++)
    new Ejer1(i).start();
    System.out.println("--- End of execution ---- ");
    }
    }