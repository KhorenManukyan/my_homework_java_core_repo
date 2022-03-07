package book.horstman.java.core.chapter3.full.cod;

import java.util.Scanner;

/**
 * This program demonstrates a for loop.
 *
 * @author Khoren
 * @version 11 28.02.2021
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you need to draw? ");
        int k = scanner.nextInt();
        System.out.print("What the highest number you can draw? ");
        int n = scanner.nextInt();
        /*
        compute binomial coefficient n*(n-1)*(n-2)*...
        *(nk+1)/(1*2*3*...*k)
        */

        int lotteryOdds = 1;

        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1)/i;
        }
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
