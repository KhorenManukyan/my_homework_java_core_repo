package book.shildt.javacore.chapter19.hash;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSetDemo = new LinkedHashSet<>();
        linkedHashSetDemo.add("Бета");
        linkedHashSetDemo.add("Альфа");
        linkedHashSetDemo.add("Эта");
        linkedHashSetDemo.add("Гамма");
        linkedHashSetDemo.add("Эпсилон");
        linkedHashSetDemo.add("Омега");
        System.out.println(linkedHashSetDemo);

    }
}
