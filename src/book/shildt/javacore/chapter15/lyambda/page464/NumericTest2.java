package book.shildt.javacore.chapter15.lyambda.page464;

@FunctionalInterface
public interface NumericTest2 {
    boolean test(int n, int d);
}

class LambdaDemo3{
    public static void main(String[] args) {
        NumericTest2 isFactor = (n,d)->(n%d) == 0;

        if (isFactor.test(10,2)){
            System.out.println("chishta");
        }

        if (!isFactor.test(10,3)){
            System.out.println("sxala");
        }
    }
}
