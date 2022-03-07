package videos.ITVDN.javaStarter.lesson6.im;

public class ForErankyunuTarberDzever {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }
            for (int j = -1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
