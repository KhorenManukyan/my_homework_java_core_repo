package book.shildt.javacore.chapter19.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String > priorityQueueDemo = new PriorityQueue<>();
        priorityQueueDemo.add("Бета");
        priorityQueueDemo.add("Альфа");
        priorityQueueDemo.add("Эта");
        priorityQueueDemo.add("Гамма");
        priorityQueueDemo.add("Эпсилон");
        priorityQueueDemo.add("Омега");
        System.out.println(priorityQueueDemo);

    }
}
