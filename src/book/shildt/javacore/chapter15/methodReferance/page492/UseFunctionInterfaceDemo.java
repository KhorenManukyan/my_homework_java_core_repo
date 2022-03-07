package book.shildt.javacore.chapter15.methodReferance.page492;

import java.util.function.Function;

public class UseFunctionInterfaceDemo{
    public static void main(String[] args) {
        Function<Integer, Integer> function = integer -> {
            int result = 1;
            for (int i = 1; i <= integer; i++) {
                result *= i;
            }

            return result;
        };

        System.out.println(function.apply(3));
    }
}
