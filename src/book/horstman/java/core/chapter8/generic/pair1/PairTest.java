package book.horstman.java.core.chapter8.generic.pair1;

import book.horstman.java.core.chapter8.generic.Pair;

public class PairTest {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "а", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}
