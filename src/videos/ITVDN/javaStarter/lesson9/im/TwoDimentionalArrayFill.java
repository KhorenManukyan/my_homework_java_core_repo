package videos.ITVDN.javaStarter.lesson9.im;

public class TwoDimentionalArrayFill {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = i*j+1;

            }
        }
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {

                System.out.print(ints[j] + ", ");
            }
            System.out.println();
        }
    }
}
