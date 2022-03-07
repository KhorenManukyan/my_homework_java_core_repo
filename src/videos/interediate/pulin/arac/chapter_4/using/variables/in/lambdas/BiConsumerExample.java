package videos.interediate.pulin.arac.chapter_4.using.variables.in.lambdas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        Map<String, String> map= new HashMap<>();
        BiConsumer<String, String> b1 = map::put;
        BiConsumer<String, String> b2 = (k,v) -> map.put(k,v);

    b1.accept("chicken","Cluck");
    b2.accept("chick","Tweep");

        System.out.println(map);
    }
}
