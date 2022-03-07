package book.shildt.javacore.chapter19.queue;

import java.util.ArrayDeque;

public class ArrayDqDemo {
    public static void main(String[] args) {
        ArrayDeque<String > arrayDeque = new ArrayDeque<>();
        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");
        System.out.println(arrayDeque);


        while (arrayDeque.peek()!=null){
            System.out.print(arrayDeque.pop()+" ");
        }
        System.out.println();
    }
}
