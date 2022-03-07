package book.shildt.javacore.chapter19.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        System.out.println("Исходное содержимое списочного массива al:");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        ListIterator<String > listIterator = arrayList.listIterator();

        while (listIterator.hasNext()){
            String element = listIterator.next();
            listIterator.set(element + "+ ");
        }

        System.out.println("Измененное содержимое списочного массива al:");

        iterator = arrayList.iterator();

        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Измeнeнный в обратном порядке список:");

        while (listIterator.hasPrevious()){
            String element = listIterator.previous();
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
