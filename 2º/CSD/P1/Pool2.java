// CSD feb 2015 Juansa Sendra

public class Pool2 extends Pool{ //max kids/instructor
    private int kids=0;
    private int inst=0;
    private int ki;
    public void init(int ki, int cap){this.ki=ki;}
    public synchronized void kidSwims()throws InterruptedException{
        while(kids+1>ki*inst){
            log.waitingToSwim();
            wait();
        }kids++;
        log.swimming();
    }
    public synchronized void kidRests(){
        kids--;
        log.resting();
        notifyAll(); 
    }
    public synchronized void instructorSwims(){
        inst++;
        log.swimming();
        notifyAll();
    }
    public synchronized void instructorRests()throws InterruptedException{
        while(kids>inst-1){
            log.waitingToRest();
            wait();
        }inst--;
        log.resting();
    }
}
