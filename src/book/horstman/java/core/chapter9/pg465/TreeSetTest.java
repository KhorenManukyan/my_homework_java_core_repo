package book.horstman.java.core.chapter9.pg465;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * В этой программе множество изделий путем
 * сравнения их описаний
 * @version 11 2021-04-21
 * @author Khoren
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Item> parts = new TreeSet<Item>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        TreeSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
