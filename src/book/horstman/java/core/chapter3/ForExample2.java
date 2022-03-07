package book.horstman.java.core.chapter3;

public class ForExample2 {
    public static void main(String[] args) {

        final int NMAX = 10;
        int[][] magicSquare = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };
//        int[][] odds = new int[NMAX + 1][];
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[i].length; j++) {
                System.out.print(magicSquare[i][j]);
            }
            System.out.println();
        }
    }
}
