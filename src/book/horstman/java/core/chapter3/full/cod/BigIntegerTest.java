package book.horstman.java.core.chapter3.full.cod;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This program uses big numbers to compute the odds of winning the grand prize in a lottery.
 *
 * @author Khoren
 * @version 11 2021-02-28
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = scanner.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = scanner.nextInt();

        /*
            compute binomial coefficient n*(n-1)*(n-2)*...
        *(nk+1)/(1*2*3*...*k)
         */
        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Goof luck!");

    }
}


















