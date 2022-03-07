package videos.ITVDN.JavaProfessionalRenewed.lesson1.old.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }




    }
}
