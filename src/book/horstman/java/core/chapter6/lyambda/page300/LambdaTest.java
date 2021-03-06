package book.horstman.java.core.chapter6.lyambda.page300;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
import javax.swing.Timer;

/**
 * В этой программе демонстрируется
 * применение лямбда-выражений
 *
 * @author Khoren Manukyan
 * @version 11 2021-06-10
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets ={"Mercury", "Venus", "Earth",
                "Mars", "Jupiter", "Saturn",
                "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
