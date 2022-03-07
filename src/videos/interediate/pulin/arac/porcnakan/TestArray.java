package videos.interediate.pulin.arac.porcnakan;

public class TestArray {
    public static void main(String[] args) {
//        System.out.println(fn(new int[]{0, 0, 0, 1, 1, 1, 1}, 1));
        fn2(new int[]{15, 4, 5, 86, 7, 4, 4, 1, 8, -8});
    }

    public static int fn(int[] arr, int num) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                x++;
            }
        }
        return x;
    }

    public static void fn2(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min)
                min = arr[i];

        }
        System.out.println(max);
        System.out.println(min);
    }
}
