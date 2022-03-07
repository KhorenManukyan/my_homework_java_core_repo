package book.horstman.java.core.chapter8.generic.pair2;

import book.horstman.java.core.chapter8.generic.Pair;

import java.time.LocalDate;

/**
 * @version 11 2021-04-25
 * @author Khoren
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 9), // G. Hopper
                LocalDate.of(1815, 12, 10), //А. Lovelace
                LocalDate.of(1903, 12, 3), // J. von Neumann
                LocalDate.of(1910, 6, 22), //К. Zuse
        };

        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}
