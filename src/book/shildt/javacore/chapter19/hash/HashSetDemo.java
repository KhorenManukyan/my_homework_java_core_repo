package book.shildt.javacore.chapter19.hash;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Бета");
        hashSet.add("Альфа");
        hashSet.add("Эта");
        hashSet.add("Гамма");
        hashSet.add("Эпсилон");
        hashSet.add("Омега");
        System.out.println(hashSet);
    }
}
