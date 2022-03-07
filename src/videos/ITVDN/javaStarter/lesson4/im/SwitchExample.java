package videos.ITVDN.javaStarter.lesson4.im;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        int numberOfDay = 0;
        System.out.println("1-7 days of week");
        Scanner scanner = new Scanner(System.in);
        numberOfDay = scanner.nextInt();

        switch (numberOfDay){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The -"+numberOfDay+"- isn't day of week!!!");
        }
    }
}
