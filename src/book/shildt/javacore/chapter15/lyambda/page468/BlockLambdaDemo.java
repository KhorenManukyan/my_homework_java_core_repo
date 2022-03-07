package book.shildt.javacore.chapter15.lyambda.page468;

public class BlockLambdaDemo{
    public static void main(String[] args) {
        NumericFunc numericFunc = n -> {
            int result =1;
            for (int i = 1; i <= n; i++) {
                result *=i;
            }
            return result;
        };
        System.out.println(numericFunc.func(6));
    }

}

interface NumericFunc{
    int func(int n);
}
