package videos.Tigrani.daseric.lesson5;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        System.out.println("You can input number, to calculate sum of input number \nPlease input the number...");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        String n = "0";
        sum += num;
        System.out.println("input another number and put 'A' to add number,or put S to get sum");
        String inputLater = scanner.next();
        int c ;
        while (inputLater.equalsIgnoreCase("a") || inputLater.equalsIgnoreCase("s")){
            System.out.println("mutqagreq 'a' gumarelu hamer, kam sexmeq 's' patasxan@ stanalu hamar");
            n = scanner.next();

            if (n.equalsIgnoreCase("s")){
                break;
            }
            if (n.equalsIgnoreCase("a")){
                c = scanner.nextInt();
                sum += c;
                continue;
            }

//            System.out.println("input another number and put 'A' to add number,or put S to get sum");
//            inputLater = scanner.next();

        }


        System.out.println("Sum is equal = " + sum);
    }
}
