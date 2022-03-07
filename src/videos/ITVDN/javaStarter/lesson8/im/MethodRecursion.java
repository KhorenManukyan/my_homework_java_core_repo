package videos.ITVDN.javaStarter.lesson8.im;

public class MethodRecursion {
    public static void main(String[] args) {
        method(3);
    }

    private static void method(int i) {
        System.out.println("method - " + i);
        recursion(i);
        System.out.println("2 method - " + i);
    }

    private static void recursion(int i) {
        i --;
        System.out.println("recursion - " + i);
        if (i != 0){
            method(i);
        }
        System.out.println("2 recursion - " + i);
    }
}
