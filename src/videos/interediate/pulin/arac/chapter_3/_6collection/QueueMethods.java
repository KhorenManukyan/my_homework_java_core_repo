package videos.interediate.pulin.arac.chapter_3._6collection;

import java.util.ArrayDeque;

public class QueueMethods {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.push(110);
        queue.push(4);
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
