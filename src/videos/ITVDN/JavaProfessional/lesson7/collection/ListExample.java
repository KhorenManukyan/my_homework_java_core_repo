package videos.ITVDN.JavaProfessional.lesson7.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List list =  new ArrayList();
        list.add("one");
        list.add("two");
        list.add("3");
        list.add(new Integer(4));
        list.add(new Float(6.0f));
        list.add("two");
        list.add(new Integer(4));

        System.out.println(list);
    }
}
