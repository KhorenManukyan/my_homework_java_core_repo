package book.horstman.java.core.chapter3;

public class ForExample3 {
    public static void main(String[] args) {
        int size = 7;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
