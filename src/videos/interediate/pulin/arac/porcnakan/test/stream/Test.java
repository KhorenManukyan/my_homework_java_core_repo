package videos.interediate.pulin.arac.porcnakan.test.stream;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<Integer> myStream = Stream.of(1, 2, 3, 4, 5);
        myStream.forEach(System.out::println);
    }
}
