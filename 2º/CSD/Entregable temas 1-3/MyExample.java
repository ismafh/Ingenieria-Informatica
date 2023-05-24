public class MyExample 1{
    public synchronized void test1() (
    SC1;
    }
    
    public synchronized void test2() {
    SC2;
    }
    }
    
    public class AnotherExanple {
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
    }
    