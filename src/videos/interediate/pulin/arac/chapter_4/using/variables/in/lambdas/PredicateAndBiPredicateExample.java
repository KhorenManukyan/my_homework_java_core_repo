package videos.interediate.pulin.arac.chapter_4.using.variables.in.lambdas;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateAndBiPredicateExample {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        System.out.println();


        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (s,p) -> s.startsWith(p);

        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));
    }
}
