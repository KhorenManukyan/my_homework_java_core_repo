package videos.interediate.pulin.arac.chapter_4.test4;

import java.util.function.*;

public class Magician {
    public static void magic(BinaryOperator<Long> lambda) {
        lambda.apply(3L, 7L);
    }

    public static void main(String[] args) {
//        magic((a) -> a);
//        magic((b,w) -> (long)w.intValue());
//        magic((c,m) -> {long c=4; return c+m;});
//        magic((Integer d, Integer r) -> (Long)r+d);
    }
}
