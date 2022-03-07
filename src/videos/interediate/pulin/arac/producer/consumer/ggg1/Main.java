package videos.interediate.pulin.arac.producer.consumer.ggg1;

public class Main {
    public static void main(String[] args) {
        WareHouse wareHouse = new WareHouse();
        Producer producer = new Producer(wareHouse);
        Consumer consumer = new Consumer(wareHouse);

        Thread pro = new Thread(producer);
        Thread con = new Thread(consumer);

        pro.start();
        con.start();
    }
}
