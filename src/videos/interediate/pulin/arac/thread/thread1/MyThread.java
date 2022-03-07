package videos.interediate.pulin.arac.thread.thread1;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
