package videos.ITVDN.javaStarter.lesson7.im;

public class Method {
    public static void main(String[] args) {
        meth1(7);
        meth1(5);
        meth1(4);
        meth1(6);
    }

    static void meth1 (int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = a ; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
