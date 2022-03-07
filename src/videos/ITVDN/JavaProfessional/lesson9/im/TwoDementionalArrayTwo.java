package videos.ITVDN.JavaProfessional.lesson9.im;

public class TwoDementionalArrayTwo {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6,7,8,9},
                {10,11},
                {12,13,14}
        };

        for (int[] i :arr) {
            for (int j:i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
