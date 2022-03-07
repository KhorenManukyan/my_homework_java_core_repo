package book.shildt.javacore.chapter19.hash;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String > treeSetDemo = new TreeSet<>();
        treeSetDemo.add("Бета");
        treeSetDemo.add("Альфа");
        treeSetDemo.add("Эта");
        treeSetDemo.add("Гамма");
        treeSetDemo.add("Эпсилон");
        treeSetDemo.add("Омега");
        System.out.println(treeSetDemo);
        System.out.println(treeSetDemo.subSet("Б", "О"));
    }
}
