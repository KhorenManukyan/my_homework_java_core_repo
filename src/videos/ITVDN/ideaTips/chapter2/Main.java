package videos.ITVDN.ideaTips.chapter2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("videos.telegramic.Main.main");
        System.out.println("args = " + args);
        for (int i = 0; i < 20; i++) {
            System.out.println("i = " + i);
        }

        List<String> names = Arrays.asList("Roman", "Andrey");
        for (Iterator<String> iterator = names.iterator();
             iterator.hasNext(); ) {
            String next =  iterator.next();
        }
    }
}
