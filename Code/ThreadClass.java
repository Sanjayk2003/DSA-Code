public class ThreadClass {
    public static void main(String[] args) {
        int n=10;
        Runnable r=()->{
            int sum=0;
          for(int i=0;i<n;i++){
            sum+=i;
          }
          System.out.println(Thread.currentThread().getName()+" "+sum);
        };
        
        Thread t=new Thread(r);
        t.start();
    }
}
