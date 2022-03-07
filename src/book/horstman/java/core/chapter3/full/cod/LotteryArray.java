package book.horstman.java.core.chapter3.full.cod;

/**
 * This program demonstrates a triangular array.
 *
 * @author Khoren
 * @version 11 2021-02-28
 */
public class LotteryArray {
    public static void main(String[] args) {
        final int NMAX = 10;

        // allocate triangular array
        int[][] odds = new int[NMAX + 1][];
        for (int i = 0; i <= NMAX; i++) {
            odds[i] = new int[i + 1];
        }

        // fill triangular array
        for (int i = 0; i < odds.length; i++) {
            for (int j = 0; j < odds[i].length; j++) {
                /* compute binomial coefficient n*(n-1)*(n-2)*...*
                (n-k+1)/(1*2*3*...*k)
                */

                int lotteryOdds = 1;
                for (int k = 1; k <= j; k++) {
                    lotteryOdds = lotteryOdds * (i - k + 1) / k;
                }

                odds[i][j] = lotteryOdds;
            }

            // print triangular array
            for (int[] row : odds) {
                for (int odd : row)
                    System.out.printf("%4d", odd);
                System.out.println();
            }
        }
    }
}
