package book.ocp.chapter3.list.set.map.queue;

import java.util.*;

public class Page150 {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        List<Rabbit> list = new ArrayList<>();
        list.add(new Rabbit());
//        Collections.sort(list);
        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
        Collections.sort(list, c);

        List<String> names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> comparator = Comparator.reverseOrder();
        int index = Collections.binarySearch(names, "Hoppy", comparator);
        System.out.println(index);

    }
}
