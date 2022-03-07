package book.ocp.chapter3.list.set.map.queue;

import java.util.ArrayList;
import java.util.List;

public class page127 {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
//        birds.clear();
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());

        System.out.println(birds.contains("hawk"));
        System.out.println(birds.contains("robin"));
    }
}
