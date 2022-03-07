package videos.ITVDN.JavaProfessionalRenewed.lesson1.old.one;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(3);
        list1.add(4);
//        list1.clear();
        System.out.println(list1);
//        System.out.println(list.add(2));
//        System.out.println(list.size());

        Collection<Integer> list2 = new ArrayList<>();
        System.out.println(list2.size());
        list2.addAll(list1);
        System.out.println(list2.size());
        System.out.println(list2);
        System.out.println("///////////////////////////////////////");

        list2.clear();
        System.out.println(list1);
        System.out.print(list2 + "   ");
        System.out.println(list2.size());
        System.out.println("///////////////////////////////////////");
        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());
        System.out.println("///////////////////////////////////////");
        Object[] arr = list1.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arr.length);



    }
}



















