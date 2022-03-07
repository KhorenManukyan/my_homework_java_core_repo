package videos.interediate.pulin.arac.chapter_3._3wrapper.classis.and.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Wrapp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(new Integer(4));
        numbers.add(new Integer(5));
        numbers.remove(2);
        System.out.println(numbers);
    }
}
