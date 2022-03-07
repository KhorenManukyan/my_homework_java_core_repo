package videos.ITVDN.javaStarter.lesson7.im;

import java.util.Scanner;

public class Methods5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number --- ");
        String number = scanner.next();
        int result = Integer.parseInt(number);
        System.out.println("The result value --- " + result);
        result = 10;
        result = add(result);

        System.out.println(add(result));
        System.out.println(result);


    }

    private static int add(int result) {
        result += 2;
        System.out.println("result is: " +result);
        return result;
    }
}
