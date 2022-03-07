package videos.telegramic.das12.neo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClMain {
    public static void main(String[] args) {
        Collection<Integer> collection1 = new ArrayList<>();
        Collection<Integer> collection2 = new ArrayList<>();
        System.out.println(collection2.size());

        collection1.add(1);
        collection1.add(2);
        collection1.add(3);
        collection1.add(4);
        collection2.addAll(collection1);
        System.out.println(collection2.size());

        collection1.remove(2);

        Iterator iterator = collection1.iterator();
        while (iterator.hasNext()){
            Integer x = (Integer) iterator.next();

                    System.out.println(x);
        }
        System.out.println();
        for (Integer integer : collection1) {
            System.out.println(integer);
        }

        if (collection1.contains(3)){
            System.out.println("ka 3");
        } else {
            System.out.println("chka 3");

        }
    }
}
