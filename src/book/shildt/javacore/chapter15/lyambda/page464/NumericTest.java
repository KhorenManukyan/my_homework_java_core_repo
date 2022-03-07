package book.shildt.javacore.chapter15.lyambda.page464;

public interface NumericTest {
    boolean test(int n);
}

class LambdaDemo2{
    public static void main(String[] args) {
        System.out.println(10%2);

    NumericTest isEven = n -> (n % 2) == 0;
//        System.out.println(isEven.test(11));

    if (isEven.test(10)){
        System.out.println("ten");
    }

    if (!isEven.test(9)){
        System.out.println("nine");
    }

    NumericTest isNonNeg = (n) -> n>0;

        if (isNonNeg.test(1)){
            System.out.println("one");
        }

        if (!isNonNeg.test(-1)){
            System.out.println("-one");
        }

    }
}
