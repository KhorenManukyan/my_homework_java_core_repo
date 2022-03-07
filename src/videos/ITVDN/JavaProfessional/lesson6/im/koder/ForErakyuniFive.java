package videos.ITVDN.JavaProfessional.lesson6.im.koder;

public class ForErakyuniFive {
    public static void main(String[] args) {
        int number = 8;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = number; j > i; j--) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
