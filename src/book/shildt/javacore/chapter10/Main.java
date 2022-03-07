package book.shildt.javacore.chapter10;

public class Main {
    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);
        try {
//            int b = 42 / a;
            int[] c = {1};
            c[11] = 11;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
