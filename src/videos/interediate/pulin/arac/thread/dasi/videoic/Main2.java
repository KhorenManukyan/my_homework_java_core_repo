package videos.interediate.pulin.arac.thread.dasi.videoic;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter = new Counter1();

        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());

            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());

            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}

class Counter1 {
    public int count = 0;

    public void increment() {
        count++;
    }
}
