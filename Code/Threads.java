public class Threads {
    public static void main(String[] args) {
        System.out.println("Main Thread "+Thread.currentThread().getName());
        Thread t= new MyThread();
        t.start();
    }
}
class MyThread extends Thread{
 public void run(){
    System.err.println("First Thread Created "+Thread.currentThread().getName() );
 }
}
