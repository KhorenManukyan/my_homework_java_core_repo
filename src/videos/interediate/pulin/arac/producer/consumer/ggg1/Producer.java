package videos.interediate.pulin.arac.producer.consumer.ggg1;


public class Producer implements Runnable{
    WareHouse producer;

    Producer(WareHouse producer){
        this.producer = producer;
    }



    @Override
    public void run() {
        try {
            producer.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
