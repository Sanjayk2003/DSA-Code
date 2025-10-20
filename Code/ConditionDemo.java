import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BoundedQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity = 5;
    private Lock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    public void produce(int item) throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == capacity) {
                notFull.await(); // wait until there is space
            }
            queue.add(item);
            System.out.println("Produced: " + item);
            notEmpty.signal(); // notify consumer
        } finally {
            lock.unlock();
        }
    }

    public int consume() throws InterruptedException {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                notEmpty.await(); // wait until there is something
            }
            int item = queue.poll();
            System.out.println("Consumed: " + item);
            notFull.signal(); // notify producer
            return item;
        } finally {
            lock.unlock();
        }
    }
}

public class ConditionDemo {
    public static void main(String[] args) {
        BoundedQueue bq = new BoundedQueue();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try { bq.produce(i); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try { bq.consume(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        producer.start();
        consumer.start();
    }
}
