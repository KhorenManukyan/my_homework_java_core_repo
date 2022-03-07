package videos.ITVDN.javaStarter.lesson6.im.koder;

public class Factorial {
    public static void main(String[] args) {
        int count = 4;
        int factorial = 1;
        System.out.print("ays tvi factorial@ " + count + "! = ");

        do {
            factorial *= count--;
//            count--;
        } while (count > 0);
        System.out.print(factorial);
    }
}
