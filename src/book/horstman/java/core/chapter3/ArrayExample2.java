package book.horstman.java.core.chapter3;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[][] magicSquare = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };
//        for (int i = 0; i < magicSquare.length; i++) {
//            for (int j = 0; j < magicSquare[i].length; j++) {
//                System.out.print(magicSquare[3][j] + " ");
//            }
//            break;
//        }

        for (int[] row : magicSquare) {
            for (int value : row) {
                System.out.println(Arrays.deepToString(magicSquare));
//                System.out.print(value + " ");
            }
//            System.out.println();
        }
    }
}
