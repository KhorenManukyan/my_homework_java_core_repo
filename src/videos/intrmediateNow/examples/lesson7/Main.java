package videos.intrmediateNow.examples.lesson7;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
//        Thread thread = new Thread(new Test());
//        Test thread = new Test();
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Test");
        });
        thread.start();


        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Test");
        };
        runnable.run();
    }
}

class Test extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Test");
    }
}




