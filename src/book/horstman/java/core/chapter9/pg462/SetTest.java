package book.horstman.java.core.chapter9.pg462;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * В этой программе выводятся все неповторяющиеся
 * слова, введенные в множество из стандартного
 * потока System.in
 * @version 11 2021-05-21
 * @author Khoren
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        long totalTime = 0;

        try(Scanner scanner = new Scanner(System.in)){
            while (scanner.hasNext()){
                String word = scanner.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() -callTime;
                totalTime += callTime;
            }
        }

        Iterator<String> iterator = words.iterator();
        for (int i =1; i<=20 && iterator.hasNext(); i++){
            System.out.println(iterator.next());
        }

        System.out.println(". . .");
        System.out.println(words.size() + " distinct words. " + totalTime +
                " milliseconds.");
    }
}
