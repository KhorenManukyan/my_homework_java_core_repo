package book.horstman.java.core.chapter4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1990, 6, 28);
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        LocalDate aThousandDayLater = date.plusDays(11226);
        System.out.println(aThousandDayLater);
    }
}
