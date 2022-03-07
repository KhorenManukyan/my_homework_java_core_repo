package videos.ITVDN.javaStarter.lesson6.im.koder;

public class ForErankyuniSix {
    public static void main(String[] args) {
        int number = 8;
        for (int i = 0; i < number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = -1; j < i ; j++) {
                System.out.print("* " );
            }
            System.out.println();
        }
    }
}
