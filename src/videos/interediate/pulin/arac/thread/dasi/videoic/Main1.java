package videos.interediate.pulin.arac.thread.dasi.videoic;

import java.util.concurrent.atomic.AtomicInteger;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        Counter co = new Counter();

        Thread thread1 = new Thread(() ->{
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 500000; i++) {
                co.count.incrementAndGet();
            }
        });

        Thread thread2 = new Thread(() ->{
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 500000; i++) {
                co.count.incrementAndGet();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
//        Thread.sleep(1);
        System.out.println(co.count);
//        Thread.sleep(1);
//        System.out.println(co.count);

    }
}

class Counter{
    public AtomicInteger count = new AtomicInteger(0);
}

