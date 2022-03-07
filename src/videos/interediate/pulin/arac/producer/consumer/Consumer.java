package videos.interediate.pulin.arac.producer.consumer;

import java.util.Random;

public class Consumer extends Thread{
    public static void consumer() throws InterruptedException {
        Random random = new Random();

        while (true) {
            Thread.sleep(10);

            if(random.nextInt(10) == 0){
                Integer value = WareHouse.queue.take();

                System.out.println("Produce value: " + value+ "; Consume value: "+ WareHouse.queue.size());
            }
        }
    }
}