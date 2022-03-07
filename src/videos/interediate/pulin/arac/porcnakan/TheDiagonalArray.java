package videos.interediate.pulin.arac.porcnakan;

public class TheDiagonalArray {
    public static void main(String[] args) {
        int[][] ivar = {{1, 4, 5, 8, 9},
                {4, 8, 5, 4, 8},
                {4, 8, 9, 8, 1},
                {2, 3, 4, 5, 6},
                {5, 5, 7, 8, 0}
        };
        System.out.println("result is --- " + diagArr(ivar));
    }

    public static int diagArr(int[][] arr) {
        int sum1 = 0;
        int sum2 = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i] == arr[j]) {
                    sum1 += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("sum 1 is --- " + sum1);
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == arr.length - 1) {
                    sum2 += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
//        -------------------------------------------
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (i + j == arr.length - 1) {
                    sum2 += arr[i][j];
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
//        -------------------------------------------
        System.out.println();
        System.out.println("sum 2 is --- " + sum2);
        result = sum1 + sum2;

        return result;

    }
}
