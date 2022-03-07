package videos.ITVDN.javaStarter.lesson4.im.koder;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Nsheq Bajaki chapser@: 1 - poqr, 2 - mijin, 3 - mec");
        System.out.print("Katereq dzer @ntrutyun@ ");

        Scanner scanner = new Scanner(System.in);
        String coffeeSize = scanner.next();

        int cost = 0;

        switch (coffeeSize) {
            case "1":
                cost += 50;
            case "2":
                cost += 25;
            case "3":
                cost +=25;
                break;
            default:
                System.out.println("Sxal @ntrutyun: Asacinq @ntreq 1,2 kam 3");
        }

        if (cost != 0){
            System.out.println("mutqagreq " + cost +  "dram");
        } else {
            System.out.println("krkin katareq @ntrutyun");
        }
    }
}
