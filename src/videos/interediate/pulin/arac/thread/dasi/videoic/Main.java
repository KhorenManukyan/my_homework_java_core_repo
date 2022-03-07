package videos.interediate.pulin.arac.thread.dasi.videoic;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(() ->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Test m");
        });
        thread.start();
        Test t = new Test();
        t.start();
    }
}

class Test extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Test t");
    }
}


