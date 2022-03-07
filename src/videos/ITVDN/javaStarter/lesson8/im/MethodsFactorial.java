package videos.ITVDN.javaStarter.lesson8.im;

public class MethodsFactorial {
    public static void main(String[] args) {
        int factorialNumber = factorial(0);
        System.out.println(factorialNumber);
    }

    private static int factorial(int factorialNumber) {
        if (factorialNumber == 0){
            return 1;
        } else {
            return factorialNumber*factorial(factorialNumber - 1);
        }
    }
}
