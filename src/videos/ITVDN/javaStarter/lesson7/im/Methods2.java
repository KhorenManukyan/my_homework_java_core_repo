package videos.ITVDN.javaStarter.lesson7.im;

public class Methods2 {
    static boolean add(boolean a, boolean b) {
        return a || b;
    }

    public static void main(String[] args) {
        boolean statement1 = true, statement2 = false;
        boolean result = add(statement1, statement2);
        System.out.println(statement1 + " || " + statement2 + " = " + result);
    }
}
