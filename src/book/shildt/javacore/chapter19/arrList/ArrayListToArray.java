package book.shildt.javacore.chapter19.arrList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("Coдepжимoe списочного массива al: " + arrayList);

        Integer[] ia = new Integer[arrayList.size()];
        ia =arrayList.toArray(ia);
        int sum = 0;

        for (int integer : ia) {
            System.out.println(integer);
            sum += integer;
        }

        System.out.println(sum);
    }

    @Override
    public String toString() {
        return "ArrayListToArray{}";
    }
}
