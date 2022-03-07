package videos.ITVDN.JavaProfessionalRenewed.lesson2.queue;

public class QueueMain {
    public static void main(String[] args) {
        SimpleQueue simpleQueue = new SimpleQueue(4);
        simpleQueue.insert(10);
        simpleQueue.insert(20);
        simpleQueue.insert(30);
        simpleQueue.insert(40);
        simpleQueue.remove();
        simpleQueue.insert(110);
        simpleQueue.insert(120);
        simpleQueue.insert(130);
        simpleQueue.insert(140);
        simpleQueue.remove();
//        simpleQueue.remove();

        while (!simpleQueue.isEmpty()) {
            long n = simpleQueue.remove();
            System.out.print(n + " ");
        }
    }
}
