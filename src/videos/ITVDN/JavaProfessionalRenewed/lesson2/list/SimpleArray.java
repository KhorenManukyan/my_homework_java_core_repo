package videos.ITVDN.JavaProfessionalRenewed.lesson2.list;

import java.util.ArrayList;

public class SimpleArray {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("Simple");
//        list.add(25);

        ArrayList<Integer> list = new ArrayList<>();

//        list2.add((Integer) list.get(0));
//        System.out.println(list2);

    /*    list2.add(10);
        list2.add(20);
        list2.add(1, 30);
        list2.add(40);

        for (Integer integer : list2) {
            System.out.println(integer);
        }*/
        for (int i = 0; i < 100; i++) {
            list.add(i);
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n" + list.size());


        for (int i = 0; i < 50; i++) {
            list.remove(0);
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n" + list.size());
    }
}
