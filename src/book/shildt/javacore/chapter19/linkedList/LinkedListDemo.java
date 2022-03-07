package book.shildt.javacore.chapter19.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        System.out.println(linkedList);
        linkedList.addFirst("A");
        System.out.println(linkedList);
        linkedList.addLast("Z");
        System.out.println(linkedList);
        linkedList.add(1,"A2");
        System.out.println(linkedList);
        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        String val = linkedList.get(2);
        System.out.println(val);
        linkedList.set(2,val + " change");
        System.out.println(linkedList);

        String[] st = new String[linkedList.size()];
        st = linkedList.toArray(st);
        for (int i = 0; i < st.length; i++) {
            System.out.println(st.toString());
            System.out.println(linkedList);
        }

    }
}
