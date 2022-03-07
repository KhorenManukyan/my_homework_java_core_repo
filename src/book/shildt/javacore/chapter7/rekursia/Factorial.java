package book.shildt.javacore.chapter7.rekursia;

public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factorial(1));
        System.out.println(f.factorial1(1));
    }
    int result = 1;
    int factorial(int a) {
        if (a > 0) {
            result *= a--;
//            a--;
            factorial(a);
        }

        return result;

    }

    int factorial1(int a){
        int result;

        if (a == 1){
            return 1;
        }
        result = factorial1(a - 1) * a;
        return result;
    }

}
