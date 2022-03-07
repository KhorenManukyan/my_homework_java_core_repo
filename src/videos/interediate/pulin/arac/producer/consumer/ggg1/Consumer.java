package videos.interediate.pulin.arac.producer.consumer.ggg1;

public class Consumer implements Runnable {
    WareHouse consumer;

    Consumer(WareHouse consumer){
        this.consumer = consumer;
    }

    @Override
    public void run() {
        try {
            consumer.serve();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}