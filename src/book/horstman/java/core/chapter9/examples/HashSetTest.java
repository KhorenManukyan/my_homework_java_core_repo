package book.horstman.java.core.chapter9.examples;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Bob");
        hashSet.add("Amy");
        hashSet.add("Carl");
        System.out.println(hashSet);
    }
}


