package videos.Tigrani.daseric.lesson5;

public class Arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = -2;
        arr[2] = -3;
        arr[3] = 4;
        arr[4] = -5;

        for (int i = 0; i<arr.length;i++) {
            System.out.print(arr[i] );
            if (arr[i]<0){
                arr[i] = 0;
            }
        }
        System.out.println();

        for (int i : arr) {
            System.out.print(i);
        }
    }
}
