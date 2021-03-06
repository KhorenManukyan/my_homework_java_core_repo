package book.ocp.chapter3.list.set.map.queue;

import java.util.ArrayList;
import java.util.List;

public class page130 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SD"); // [SD]
        System.out.println(list);
        list.add(0, "NY"); // [NY,SD]
        System.out.println(list);

        list.set(1, "FL"); // [NY,FL]
        System.out.println(list);

        list.remove("NY"); // [FL]
        System.out.println(list);

        list.remove(0); // []
        System.out.println(list);

        list.add("OH"); // [OH]
        System.out.println(list);

        list.add("CO"); // [OH,CO]
        System.out.println(list);

        list.add("NJ"); // [OH,CO,NJ]
        System.out.println(list);

        String state = list.get(0); // OH
        System.out.println(state);

        int index = list.indexOf("NJ"); // 2
        System.out.println(index);


    }
}
