package videos.interediate.pulin.arac.chapter_4.test15;

import java.util.*;

public class Cheater {

    int count = 0;

    public void sneak(Collection<String> coll) {
        coll.stream().peek(r -> {count++; System.out.println(r); }).findFirst();
    }

    public static void main(String[] args) {
        Cheater c = new Cheater();
        c.sneak(Arrays.asList("weasel"));
    }

   /* public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Deque<String> queue = new ArrayDeque<>();
        queue.push("all queued up");
        queue.push("last");
    }
    private static void withFlatMap(Collection<?> coll) {
        Stream.of(coll)
                .flatMap(x -> x.stream())
                .forEach(System.out::print);
        System.out.println();
    }
    private static void withoutFlatMap(Collection<?> coll) {
        Stream.of(coll)
                .filter(x -> !x.isEmpty())
                .map(x -> x)
                .forEach(System.out::print);
        System.out.println();
    }*/

}
