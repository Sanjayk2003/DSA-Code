import java.util.concurrent.TimeUnit;

public class WaitAndNotify {
   int n=10;

   synchronized void run() throws InterruptedException{
    if(n==10){
        wait();
        System.out.println("world");
    }
    // System.out.print("hello ");
   }

   synchronized void give(){
    System.out.print("Hello ");
    notify();
   }


    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify w=new WaitAndNotify();
        Thread r=new Thread(()->{
            try {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                w.run();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        Thread t=new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            w.give();
        });
 
        r.start();
        Thread.sleep(1000);
        t.start();
        r.join();
        t.join();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
        System.out.println("End");
    }
}
