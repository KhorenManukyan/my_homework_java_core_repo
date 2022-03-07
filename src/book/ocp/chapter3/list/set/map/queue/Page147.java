package book.ocp.chapter3.list.set.map.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Page147 {
    public static void main(String[] args) {
        Comparator<Duck> byWeight = (o1, o2) -> o1.getWeight() - o2.getWeight();

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack",7));
        ducks.add(new Duck("Puddles",10));

        Collections.sort(ducks);
        System.out.println(ducks);

        Collections.sort(ducks,byWeight);
        System.out.println(ducks);


    Comparator<Duck> byWeight1 = (d1, d2) -> d1.getWeight() - d2.getWeight();
    Comparator<Duck> byWeight2 = (d1, d2) -> d1.getWeight() - d2.getWeight();
    Comparator<Duck> byWeight3 = (d1, d2) -> d1.getWeight() - d2.getWeight();
    }
}
