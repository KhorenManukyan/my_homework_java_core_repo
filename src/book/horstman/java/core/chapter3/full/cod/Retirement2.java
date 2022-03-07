package book.horstman.java.core.chapter3.full.cod;

import java.util.Scanner;

/**
 * This program demonstrates a do/while loop.
 * @version 11 2021.02.26
 * @author Khoren Manukyan
 */
public class Retirement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much money will you contribute every year? ");
        double payment = scanner.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = scanner.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        // update account balance while user isn't read to retire
        do {
            //add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate/100;
            balance += interest;

            year++;

            // print current balance
            System.out.printf("After year %d, your balance is %,.2f%n", year, balance);

            // ask if ready to retire and get input
            System.out.print("Ready to retire? (Y/N)");
            input = scanner.next();
        } while ( input.equals("N"));
    }
}

