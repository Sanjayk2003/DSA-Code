import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Streams {
    private final Lock l=new ReentrantLock();
    int c=0;
    void inc(){
        // l.lock();
        if(l.tryLock()){
       try{
       c++;}finally{
        l.unlock();
       }
    }
    }
    void dec(){
        // l.lock();
        if(l.tryLock()){
       try{
       c--;}finally{
        l.unlock();
       }
    }
    }
    public static void main(String[] args) throws InterruptedException {
        Streams s=new Streams();
        Thread t= new Thread(()->{
            for(int i=0;i<100;i++){
                s.inc();
            }
        });
        Thread t1= new Thread(()->{
            for(int i=0;i<=100;i++){
                s.dec();
            }
        });
        t.start();
        t1.start();
        t.join();
        t1.join();
        System.out.println(s.c);
    }
}
