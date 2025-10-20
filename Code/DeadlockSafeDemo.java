import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class Resource {
    Lock lock = new ReentrantLock();

    public boolean safeMethod(Resource other) {
        try {
            if (lock.tryLock(500, TimeUnit.MILLISECONDS)) {
                Thread.sleep(100);
                if (other.lock.tryLock(500, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + " acquired both locks");
                    other.lock.unlock();
                    lock.unlock();
                    return true;
                }
            }
        } catch (InterruptedException e) {}
        finally {
            if (((ReentrantLock) lock).isHeldByCurrentThread()) lock.unlock();
        }
        return false;
    }
}

public class DeadlockSafeDemo {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.safeMethod(r2), "Thread-1");
        Thread t2 = new Thread(() -> r2.safeMethod(r1), "Thread-2");

        t1.start();
        t2.start();
    }
}
