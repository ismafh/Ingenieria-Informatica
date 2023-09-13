/*public class MyExample 1{
    public synchronized void test1() (
    SC1;
    }
    
    public synchronized void test2() {
    SC2;
    }
    }
    
    public class AnotherExample {
    private Object o1, o2;
    
    AnotherExample() {
    o1 = new Object();
    o2 = new Object();
    
    }
    
    public void test1() {
    synchronized(o1) { SC1; }
    }
    
    public void test2() {
    synchronized(o2) { SC2; }
    }
    }*/
    
    Monitor Galar {
    int pikachus, eevees, waiting, evolution;
    condition grookevolve, notalone_evee, notalone_pika;
    
    public Galar() {
        pikachus = eevees = waiting = 0; 
        evolution = 5;
    }
    
    entry void enter_Eevee() {
        waiting++;
        while (pikachus > 0) {
            notalone_evee.wait();
        }
        waiting--;
        eevees++;
        if (eevees >= evolution) {
            grookevolve.notify();
        }
    }
    
    entry void exit_Eevee() {
        eevees--;
        if (waiting > 0 && pikachus == 0) {
            notalone_evee.notify();
        }
    }
    
    entry void enter_Pikachu() {
        waiting++;
        while (eevees > 0) {
            notalone_pika.wait();
        }
        waiting--;
        pikachus++;
        if (pikachus >= evolution) {
            grookevolve.notify();
        }
    }
    
    entry void exit_Pikachu() {
        pikachus--;
        if (waiting > 0 && eevees == 0) {
            notalone_pika.notify();
        }
    }
    
    entry void evolve_grooky() {
        if (pikachus < evolution && eevees < evolution) {
            grookevolve.wait();
        }
    }
} 