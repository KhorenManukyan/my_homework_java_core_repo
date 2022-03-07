package videos.ITVDN.javaEssential.lesson8.exceptions.ex_011;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        int a = 5, b = 0;
        try {
            System.out.println(arr[8]);
            System.out.println(a/b);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
