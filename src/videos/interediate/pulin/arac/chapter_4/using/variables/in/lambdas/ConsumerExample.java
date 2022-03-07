package videos.interediate.pulin.arac.chapter_4.using.variables.in.lambdas;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x-> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");
    }
}
