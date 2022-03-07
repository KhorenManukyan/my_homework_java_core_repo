package videos.intrmediateNow.examples.lesson7;

import java.util.concurrent.atomic.AtomicInteger;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
//            System.out.println(counter.count);
            for (int i = 0; i < 100000; i++) {
//                counter.count.incrementAndGet();
                counter.increment();
            }
        });

        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 100000; i++) {
//                counter.count.incrementAndGet();
                counter.increment();
            }
        });
        thread.start();
        thread1.start();
//        Thread.sleep(1);
        thread.join();
        thread1.join();
        System.out.println(counter.count);
    }
}

class Counter {
//    AtomicInteger count = new AtomicInteger(0);
    public int count = 0;

    public synchronized void increment(){
        count++;
    }
}