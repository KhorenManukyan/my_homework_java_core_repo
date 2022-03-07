package book.shildt.javacore.chapter10.operator_throw_s_finaly;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("thOne");
        throw new IllegalAccessException();
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }
    }
}
