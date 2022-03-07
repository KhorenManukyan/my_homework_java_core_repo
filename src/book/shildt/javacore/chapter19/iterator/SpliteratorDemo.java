package book.shildt.javacore.chapter19.iterator;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);
        System.out.print("Coдepжимoe списочного массива vals:\n");

        Spliterator<Double> spliterator = arrayList.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n + " ")));
        System.out.println();

        spliterator = arrayList.spliterator();
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        while (spliterator.tryAdvance((n) -> doubleArrayList.add(Math.sqrt(n))));
        System.out.println("Содержимое списочного массива doubleArrayList:");
        spliterator = doubleArrayList.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));

    }
}
