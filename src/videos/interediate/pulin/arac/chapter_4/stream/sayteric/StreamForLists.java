package videos.interediate.pulin.arac.chapter_4.stream.sayteric;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamForLists {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream<String> stream = list.stream();

        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).
                filter(x -> x<90)
                .map(x -> x + 10)
                .limit(3)
                .forEach(System.out::println);
    }
}
