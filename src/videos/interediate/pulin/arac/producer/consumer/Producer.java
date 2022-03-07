package videos.interediate.pulin.arac.producer.consumer;

import java.util.Random;

public class Producer extends Thread{
    public static void producer() throws InterruptedException{
        Random random = new Random();

        while (true){
            WareHouse.queue.put(random.nextInt(10));

        }
    }
}
