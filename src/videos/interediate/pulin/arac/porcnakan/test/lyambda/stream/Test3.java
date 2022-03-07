package videos.interediate.pulin.arac.porcnakan.test.lyambda.stream;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {

    public static void main(String[] args) {
        Supplier<Integer> numb = new Random()::nextInt;
        System.out.println(numb.get());

        Test3.method(()->"hello supl");
        Test3.method1(a-> System.out.println("ajssf"));
    }

    public static void method(Supplier supplier){
        System.out.println(supplier.get());
    }

    public static void method1(Consumer cc){
        cc.accept("aaaaaddddddd");
    }
}
