package videos.interediate.pulin.arac.chapter_4.test15;

import java.util.*;

public class Ballot {
    public static void main(String[] args) {
        Optional opt = Optional.empty();
        try {
            apply(opt);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught it");
        }
    }
    private static void apply(Optional<Exception> opt) {
        opt.orElseThrow(IllegalArgumentException::new);
    }
}
