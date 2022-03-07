package videos.ITVDN.JavaProfessional.lesson3.im;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mutqagreq amboch tiv");
        int number = scanner.nextInt();

        System.out.println("Mutqagreq amboxchov tiv, ogragorceq ,");
        double numberPoint = 0;
        aaa:
        while (true) {
            try {
                 numberPoint = scanner.nextDouble();
                 break;
            } catch (Exception e){
                System.out.println("Esh asinq , ov voch te ketov");

            }
        }

        System.out.println("Mutqagrvac text@ kpatkervi minchev arajin probel@");
        String spaces = scanner.next();

        scanner = new Scanner(System.in);
        System.out.println("Mutqagreq text vor@ kpatkervi amboxchutyamb");
        String text = scanner.nextLine();
        System.out.println();

        System.out.println(number);
        System.out.println(numberPoint);
        System.out.println(spaces);
        System.out.println(text);

    }
}
