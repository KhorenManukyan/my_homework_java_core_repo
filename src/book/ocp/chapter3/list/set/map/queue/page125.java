package book.ocp.chapter3.list.set.map.queue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class page125 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow"));
        System.out.println(list.add("Sparrow"));
        System.out.println(list.add("Sparrow"));

        Set<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow"));
        System.out.println(set.add("Sparrow"));
        System.out.println(set.add("Sparrow"));

    }
}
