package videos.interediate.pulin.arac.chapter_4.test4;

import java.util.function.*;

class Bank {
    private int savingsInCents;

    private static class ConvertToCents {
        static DoubleToIntFunction f = p -> (int) (p*100);
    }

    public static void main(String... currency) {
        Bank creditUnion = new Bank();
        creditUnion.savingsInCents = 100;
        double deposit = 1.5;
        creditUnion.savingsInCents +=
                ConvertToCents.f.applyAsInt(deposit); // j1
        System.out.print(creditUnion.savingsInCents);
    }
}
