package book.horstman.java.core.chapter3.full.cod;

/**
 * This program shows how to store tabular data in a 2D array.
 *
 * @author Khoren
 * @version 11 2021-02-28
 */
public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // set interest rates to 10 . . . 15%
        double[] interestRate = new double[NRATES];
        for (int i = 0; i < interestRate.length; i++) {
            interestRate[i] = (STARTRATE + i) / 100.0;
        }

        double[][] balance = new double[NYEARS][NRATES];

        // set initial balance to 10000
        for (int i = 0; i < balance[0].length; i++) {
            balance[0][i] = 10000;
//            System.out.println(balance[i][0]);
        }

        for (int i = 1; i < balance.length; i++) {
            for (int j = 0; j < balance[i].length; j++) {
                //get last year's balances from previous row
                double oldBalance = balance[i - 1][j];

                // compute interest
                double interest = oldBalance * interestRate[j];

                // compute this year's balance
                balance[i][j] = oldBalance + interest;
            }
        }

        // print one row of interest rates
        for (int i = 0; i < interestRate.length; i++) {
            System.out.printf("%9.0f%%", 100 * interestRate[i]);
        }

        System.out.println();
        // print balance table
        for (double[] row: balance){
            //print table row
            for (double b : row) {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
    }
}


















