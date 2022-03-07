package book.ocp.chapter3.bounds;

import java.util.ArrayList;
import java.util.List;

public class page118 {
/*    public static void printList(List<Object> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }*/

    public static void printList(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<String > keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);

        List<String> numbers = new ArrayList<>();
        numbers.add("aaa");
        List<String> objects = numbers;
        objects.add("forty two");
        System.out.println(numbers.get(1));
    }
}
