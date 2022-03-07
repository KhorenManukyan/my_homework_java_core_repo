package videos.interediate.pulin.arac.chapter_4.stream.grqic;

import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("gorilla", "gorilla", "monkey");
//        s.filter(x -> x.startsWith("b")).forEach(System.out::print);

//s.distinct().forEach(System.out::print);

//        Stream<Integer> se = Stream.iterate(1, n -> n + 1);
////        se.skip(15).limit(4).forEach(System.out::println);
//
//    s.map(String::length).forEach(System.out::print);

/*        List<String> zero = PorcnakanArrays.asList();
        List<String> one = PorcnakanArrays.asList("Bonobo");
        List<String> two = PorcnakanArrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String >> an = Stream.of(zero, one, two);
        an.flatMap(l -> l.stream()).forEach(System.out::println);*/


//        Stream<String> str = Stream.of("brown-", "jj","ass","bear-");
//        str.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(sa -> sa.startsWith("g"))
                .peek(System.out::println)
                .count();
        System.out.println(count);
    }
}
