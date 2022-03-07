package book.ocp.chapter3.list.set.map.queue;

import java.util.*;

public class Page133 {
    public static void main(String[] args) {
/*
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);
        for (Integer integer: set){
            System.out.println(integer);
        }
*/

 /*       Set<Integer> set = new TreeSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);
        for (Integer integer: set){
            System.out.println(integer);
        }
  */

        Set<Integer> set = new LinkedHashSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);
        for (Integer integer: set){
            System.out.println(integer);
        }



        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for (int i = 0; i <= 20; i++) {
            navigableSet.add(i);
        }
        System.out.println(navigableSet.lower(10));
        System.out.println(navigableSet.floor(10));
        System.out.println(navigableSet.ceiling(18));
        System.out.println(navigableSet.higher(20));
    }
}
