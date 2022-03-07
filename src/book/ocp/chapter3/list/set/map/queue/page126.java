package book.ocp.chapter3.list.set.map.queue;

import java.util.ArrayList;
import java.util.List;

public class page126 {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal"));
        System.out.println(birds.remove("hawk"));
        System.out.println(birds.remove(0));
        System.out.println(birds);
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());

        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
    }
}
