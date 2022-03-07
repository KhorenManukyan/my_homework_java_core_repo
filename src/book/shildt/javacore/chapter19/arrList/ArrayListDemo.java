package book.shildt.javacore.chapter19.arrList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        System.out.println("Haчaльный размер списочного массива al: " + arrayList.size());

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(1, "A2");


        System.out.println("размер списочного массива al: " + arrayList.size());
        System.out.println("Coдepжимoe списочного массива al: " + arrayList);
        System.out.println();
        arrayList.remove("F");
        System.out.println("Coдepжимoe списочного массива al: " + arrayList);
        arrayList.remove(2);
        System.out.println("Coдepжимoe списочного массива al: " + arrayList.toString());
        System.out.println("размер списочного массива al: " + arrayList.size());


    }
}
