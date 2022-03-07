package videos.telegramic.das5;

public class Factorial {
    public static void main(String[] args) {
        result();
    }

    private static void result() {
        System.out.println(factorial(7));
    }

    static int result = 1;
    static int factorial(int num) {
        if (num > 0) {
            result *= num;
            factorial(--num);
        }
        return result;
    }
}
