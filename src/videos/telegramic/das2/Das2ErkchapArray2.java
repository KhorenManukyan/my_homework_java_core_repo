package videos.telegramic.das2;

public class Das2ErkchapArray2 {
    public static void main(String[] args) {
        int[][] arr;

        arr = new int[][]{
                {2},
                {1, 4, 5},
                {3, 6, 7, 6, 4},
                {2, 5}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
