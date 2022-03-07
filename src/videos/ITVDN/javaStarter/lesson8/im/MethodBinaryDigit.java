package videos.ITVDN.javaStarter.lesson8.im;

public class MethodBinaryDigit {
    public static void main(String[] args) {
        int a = 2;

        converter(a);
    }

    private static void converter(int a) {
        int c = a % 2;
        if (a >= 2) {
            converter(a / 2);
        }
        System.out.print(c);
    }
}
