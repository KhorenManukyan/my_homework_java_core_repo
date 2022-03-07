package videos.interediate.pulin.arac.chapter_4.stream.grqic;

import java.util.stream.Stream;

public class StreamCount {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("alsjkfslkfj", "ss", "monkey", "gorilla", "bonobo", "bonobo", "bonobo", "bonobo");
//        System.out.println(s.count());

//        Stream<String> sa = Stream.of("monkey", "gorilla", "bonobo", "abbsas");
//        Optional<String> min = sa.min((s1,s2) -> s1.length()- s2.length());
//        min.ifPresent(System.out::println);

//        Optional<?> minEmpty = Stream.empty().min((s1,s2) -> 0);
//        System.out.println(minEmpty.isPresent());

/*        Stream<String> infinite = Stream.generate(() -> "chimp");
        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);*/

/*        List<String > list = PorcnakanArrays.asList("monkey\", \"2\", \"chimp");
        Stream<String> stringSystem = Stream.generate(() -> "chimp");
        Predicate<String > predicate = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(predicate));
        System.out.println(list.stream().allMatch(predicate));
        System.out.println(list.stream().noneMatch(predicate));
        System.out.println(stringSystem.anyMatch(predicate));*/



    }
}
