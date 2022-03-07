package book.shildt.javacore.chapter19.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-20);
        linkedList.add(8);

        Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(linkedList,comparator);

        System.out.print("Cпиcoк отсортирован в обратном порядке:");

        for (int i: linkedList) {
            System.out.print(i + " ");
        }
            System.out.println();
            Collections.shuffle(linkedList);

            System.out.print("Cпиcoк перетасован:");

        for (int i: linkedList) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Min: "+Collections.min(linkedList));
        System.out.println("Max: "+Collections.max(linkedList));

    }
}
