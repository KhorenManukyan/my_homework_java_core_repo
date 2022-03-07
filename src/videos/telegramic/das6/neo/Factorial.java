package videos.telegramic.das6.neo;

public class Factorial {
    public static void main(String[] args) {
        int tiv = 7;
        int art = fact(tiv);
        System.out.println(art);
    }

    private static int fact(int i) {
//        if (i != 2) {
//            return i * fact(i - 1);
//        } else {
//            return i;
//        }

        return i != 2 ? i * fact(--i) : i;
    }
}
