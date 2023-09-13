public class qewrgfqwf {
    
    Monitor Test {
        int num = 0;
        int max = 3;
        condition cond;
        entry void increment() {
        while (num >= max){ cond.wait(); }
        num++;
        }
        entry void decrement() {
        num--;
        while (num < max) { cond.notify(); }
        }
       }
}
