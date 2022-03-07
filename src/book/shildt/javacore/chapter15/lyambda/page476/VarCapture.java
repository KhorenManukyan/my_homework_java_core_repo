package book.shildt.javacore.chapter15.lyambda.page476;

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;

        MyFunc myFunc = n -> {
            int v = num + n;
            return v;
        };
        System.out.println(myFunc.func(10));
    }
}

interface MyFunc{
    int func(int n);
}
