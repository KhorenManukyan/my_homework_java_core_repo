package book.shildt.javacore.chapter19.iterator;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("Исходное содержимое списочного массива vals:");
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println();
        int sum = 0;

        for (Integer integer : arrayList) {
            sum += integer;
        }

        System.out.print(sum);
    }
}
