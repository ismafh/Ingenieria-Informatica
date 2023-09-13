/*public class Ejer2 extends Thread {
    private int label;
    private String name;
    public Ejer2(int n){
    label=n;
    name="MidThread";
    }
    public void run() {
    label--;
    Ejer2 h = new Ejer2(label);
    h.setName (name + label);
    if (label >= 1)
    h.start();
    System.out.println("End of thread. I am:" + Thread.currentThread().getName());
    }
    
    public static void main(String[] argv) {
    new Thread( () -> {
    System.out.println("I am " + Thread.currentThread().getName());
    new Ejer2(4).start();
    },"BigThread").start();
    
    new Thread( () -> {
    System.out.println("I am " + Thread.currentThread().getName());
    new Ejer2(2).start();
     } ,"SmallThread");
    }
    }*/

    //Ejer 2 recortado
    public class Ejer2 extends Thread {
    private int label;
    public Ejer2(int n) {
        label = n;
    }
    public void run() {
        System.out.println("I am " + Thread.currentThread().getName());
        if (label > 1) {
            Ejer2 h = new Ejer2(label - 1);
            h.start();
            try {
                h.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of thread. I am: " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        new Ejer2(4).start();
    }
} 