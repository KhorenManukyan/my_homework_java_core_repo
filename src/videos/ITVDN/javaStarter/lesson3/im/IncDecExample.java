package videos.ITVDN.javaStarter.lesson3.im;

public class IncDecExample {
    public static void main(String[] args) {
        byte a = 5, b = 3;
        byte c = (byte) (a++ + ++b);
        System.out.println(c + " " +a +" " +b);
    }
}
