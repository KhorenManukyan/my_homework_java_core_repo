package book.shildt.javacore.chapter10.nested.operator_try;

public class MethNestTry {
    static void nestTry(int a) {
        try {
            if (a == 1) {
                a = a / (a - a);
            }

            if (a == 2) {
                int[] c = {1};
                c[33] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        try {
            int a = 2;
            int b = 42 / 0;
            System.out.println(a);
            nestTry(a);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
