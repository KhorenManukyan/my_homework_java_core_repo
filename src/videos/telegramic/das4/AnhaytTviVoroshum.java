package videos.telegramic.das4;

import java.util.Random;
import java.util.Scanner;


public class AnhaytTviVoroshum {
    public static void main(String[] args) {
        Random random = new Random();
        int hish = random.nextInt(41);
        int hashvich = 0;
        System.err.println("mutqagreq 0-ic 40 cankacac tiv: ");
        while (hashvich < 5) {
            Scanner scanner = new Scanner(System.in);
            int asacTiv = scanner.nextInt();
            hashvich++;
            if (asacTiv < 0 || asacTiv > 40) {
                System.out.println("lav ches ara");
                continue;
            }

            if (asacTiv == hish) {
                System.err.println("DUQ HAXTECIQ!!!");
                break;
            } else {
                if (hish > asacTiv) {
                    System.out.println("du asacir poqr tiv");
                } else {
                    System.out.println("du asacir mec tiv");
                }
            }
        }

        if (hashvich == 5) {
            System.out.println("gna xaxal sovori 'ARA!!!'");
        }
    }
}
