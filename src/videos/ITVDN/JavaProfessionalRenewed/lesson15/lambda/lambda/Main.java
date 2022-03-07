package videos.ITVDN.JavaProfessionalRenewed.lesson15.lambda.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MyFunc myFunc = (a,b) -> {return a - b;};

        System.out.println(myFunc.func(10,4));
    }
}

@FunctionalInterface
interface MyFunc{
    int func(int a, int b);
}
