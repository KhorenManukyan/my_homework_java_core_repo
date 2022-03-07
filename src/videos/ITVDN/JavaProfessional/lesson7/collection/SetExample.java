package videos.ITVDN.JavaProfessional.lesson7.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set set =  new HashSet();
        set.add("one");
        set.add("two");
        set.add("3");
        set.add(new Integer(4));
        set.add(new Float(6.0f));
        set.add("two");
        set.add(new Integer(4));

        System.out.println(set);
    }

}
