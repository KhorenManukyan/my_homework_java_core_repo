package videos.ITVDN.javaEssential.lesson5.ex007;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(3);
        al.add(7);
        al.add(8);
        al.add(9);

        Iterator<Integer> iterator = al.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            System.out.print(i + " ");
        }
        System.out.println();

        ListIterator<Integer> iterator1 = al.listIterator();
        while (iterator1.hasNext()){
            Integer io =iterator1.next() ;
            System.out.print(io + " ");
        }
        System.out.println();

//
//        while (iterator1.hasNext()){
//            Integer io =iterator1.next() ;
//            System.out.print(io + " ");
//        }
    }
}






















