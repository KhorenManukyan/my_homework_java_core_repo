package videos.ITVDN.javaStarter.lesson9.im;

public class ArraysFill {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int a:arr)
            System.out.print(a + " ");

        System.out.println();

    }
}
