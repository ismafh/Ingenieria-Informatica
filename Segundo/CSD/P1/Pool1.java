// CSD feb 2015 Juansa Sendra

public class Pool1 extends Pool {   //no kids alone
    private int inst=0;
    private int kid=0;
    public void init(int ki, int cap)           {}
    public synchronized void kidSwims()throws InterruptedException{
        while(inst==0){
                log.waitingToSwim();
                wait();
        }kid++;
        log.swimming();
    }
    public synchronized void kidRests(){
        kid--;
        log.resting();
        notifyAll(); 
    }
    public synchronized void instructorSwims(){
        inst++;
        log.swimming();
        notifyAll();
    }
    public synchronized void instructorRests()throws InterruptedException{
        while(inst==1 && kid>0){
            log.waitingToRest();
            wait();
        }
        inst--;
        log.resting(); 
    }
}
