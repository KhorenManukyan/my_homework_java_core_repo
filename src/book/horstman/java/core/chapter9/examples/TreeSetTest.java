package book.horstman.java.core.chapter9.examples;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Bob");
        treeSet.add("Amy");
        treeSet.add("Carl");
        System.out.println(treeSet);
    }
}
