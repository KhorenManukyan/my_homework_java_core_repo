package book.ocp.chapter3.list.set.map.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Page143 {
}

class Duck implements Comparable<Duck>{

    private String name;
    int id;
    int weight;

    public Duck() {
    }

    public Duck(String name){
        this.name = name;
    }
    public Duck(String name,int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo( Duck o) {
        return id - o.id;
    }

    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks);
        System.out.println(ducks);

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();

        duck1.id = 5;
        duck2.id = 7;
        System.out.println(duck1.compareTo(duck2));
        System.out.println(duck1.compareTo(duck1));
        System.out.println(duck2.compareTo(duck1));

    }
}
