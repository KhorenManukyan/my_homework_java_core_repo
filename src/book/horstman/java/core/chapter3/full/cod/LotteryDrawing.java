package book.horstman.java.core.chapter3.full.cod;

import java.util.Arrays;
import java.util.Scanner;


/**
 * This program demonstrates array manipulation.
 * @version 11 2021-02-28
 * @author Khoren
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = scanner.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = scanner.nextInt();

        // fill in array with numbers 1 2 3 . . . n
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }

        //draw k numbers and put them a second array
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            //make a random index between 0 and n-1
            int r = (int) (Math.random() * n);

            // pick the element into the random location
            numbers[r] = numbers[n - 1];
            n--;
        }

//        print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination");
        for (int r:result) {
            System.out.println(r);
        }
    }
}
