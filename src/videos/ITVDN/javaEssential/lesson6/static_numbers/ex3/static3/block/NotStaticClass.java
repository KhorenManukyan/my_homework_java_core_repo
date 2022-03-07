package videos.ITVDN.javaEssential.lesson6.static_numbers.ex3.static3.block;

public class NotStaticClass {
    public static final int X;
    static {
        X = 10;
        System.out.println("Static block "+X);
    }

    public NotStaticClass() {
//        X = 4;
        System.out.println("Constructor " + X);
    }
}
