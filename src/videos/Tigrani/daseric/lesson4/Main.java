package videos.Tigrani.daseric.lesson4;

public class Main {
    public static void main(String[] args) {
        drawRectangle(60, 7, '*');
    }

    public static void drawRectangle(int length, int width, char fillRectangle) {
       int copyLength;
        while (width != 0) {
            copyLength = length;
            while (copyLength != 0) {
                System.out.print(fillRectangle);
                copyLength--;
            }
            System.out.println();
            width--;
        }
    }
}
