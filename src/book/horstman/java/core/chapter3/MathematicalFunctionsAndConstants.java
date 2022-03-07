package book.horstman.java.core.chapter3;

public class MathematicalFunctionsAndConstants {
    public static void main(String[] args) {
        double a = 16;
        double b = Math.sqrt(a);
        System.out.println(b);

        int x = 5;
        int y = 2;
        double c = Math.pow(x,y);
        System.out.println(c);
        System.out.println(Math.sqrt(c));

        int n = 123456789;
        float f = n;
        System.out.println(f);

        float f1 = 12f;
        int k = (int) f1;
        System.out.println(k);

        double s = 9.43232;
        int l = (int) Math.round(s);

        System.out.println(l);
    }
}
