import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Threado {
    int n=0;
    int m=0;
    Lock l=new ReentrantLock();

     void print(int n) throws InterruptedException{
         l.lock();
         
        if(n%2==0){
           
        this.n++;
        System.out.println("nnnn"+n);
        // Thread.sleep(1000);
    
       }
       else{
        m++;
        System.out.println("mmmmmmm"+m);
       }
       
    }
    public static void main(String[] args) {
        Threado ob=new Threado();
        Thread t=new Thread(()->{
            for(int i=0;i<10;i+=2){
                try {
                    ob.print(i);
                    
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Thread t1=new Thread(()->{
            for(int i=1;i<10;i+=2){
                try {
                    ob.print(i);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        t.start();
        t1.start();
        try {
            t.join();
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
