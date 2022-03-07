package book.horstman.java.core.chapter9.examples;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Bob");
        linkedHashSet.add("Amy");
        linkedHashSet.add("Carl");
        System.out.println(linkedHashSet);
    }
}
