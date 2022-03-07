package book.shildt.javacore.chapter19.queue;

import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("Бета");
        deque.push("Альфа");
        deque.push("Эта");
        deque.push("Гамма");
        deque.push("Эпсилон");
        deque.push("Омега");
        System.out.println(deque);
    }
}
