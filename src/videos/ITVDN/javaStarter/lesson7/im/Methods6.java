package videos.ITVDN.javaStarter.lesson7.im;

import java.util.Scanner;

public class Methods6 {
    public static void main(String[] args) {
        System.out.println("Input the number");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int result = Integer.parseInt(number);
        System.out.println("1: result is" + result);
        result = add(result);
        System.out.println("2: result is" + result);


    }

    private static int add(int a) {
        a +=2;
        System.out.println("a is:" + a);
        return a;
    }
}
