package book.shildt.javacore.chapter15.lyambda.page468;

public class GenericFunctionalinterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<Integer> integerSomeFunc = integer -> {
        int result = 1;
            for (int i = 1; i < integer; i++) {
                result *= i;
            }
        return result;
        };

        System.out.println(integerSomeFunc.func(10));

        SomeFunc<String> stringFuncSomeFunc = stringFunc -> {
            String str = "";

            for (int i = stringFunc.length()-1; i >=0 ; i--) {
                str += stringFunc.charAt(i);
            }
            return str;
        };
        System.out.println(integerSomeFunc.func(10));

        System.out.println(stringFuncSomeFunc.func("Arman"));



    }
}

interface SomeFunc<T>{
    T func(T t);
}
