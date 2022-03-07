package book.horstman.java.core.chapter3.full.cod;

import java.util.Scanner;

/**
 * This program demonstrates a while loop.
 * @version 11 26.02.2021
 * @author Khoren Manukyan
 */
public class Retirement {
    public static void main(String[] args) {
        //read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much money do you need to retire? ");
        double goal = scanner.nextDouble();

        System.out.print("How much money will you contribute every year ");
        double payment = scanner.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = scanner.nextDouble();

        double balance = 0;
        int years = 0;

        // update account balance while goal isn't reached
        while (balance > goal){
            // add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate/ 100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in " + years + " years.");

    }
}
