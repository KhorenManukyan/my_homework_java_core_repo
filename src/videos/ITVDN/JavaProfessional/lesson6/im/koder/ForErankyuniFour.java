package videos.ITVDN.JavaProfessional.lesson6.im.koder;

public class ForErankyuniFour {
    public static void main(String[] args) {
        int number = 8;
        for (int i = 0; i < number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
