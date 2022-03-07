package book.horstman.java.core.chapter5.ex5_6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
////        Size.SMALL.toString();
        Size s = Enum.valueOf(Size.class, "SMALL");
        System.out.println(s);
        Size[] values = Size.values();

        System.out.println(Arrays.toString(values));

        var in = new Scanner(System.in);
        System.out.print("Enter а size: "
                + "(SМALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next() .toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation="
                + size.getAbbreviation() );
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job--you "
                    + "paid attention to the .");

    }
}
