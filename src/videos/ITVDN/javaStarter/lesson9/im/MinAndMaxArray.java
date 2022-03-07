package videos.ITVDN.javaStarter.lesson9.im;

public class MinAndMaxArray {
    public static void main(String[] args) {
        int[] list = {1, 4, 64, 45, 3, 2, -3, -6, 6, 56, -65, 6, 0, 4, 23, -65, 34, 31};
        int minValue = list[0];
        System.out.print("array is this: [");
        for (int i = 1; i < list.length; i++) {
            System.out.print(list[i] + " ");
            if (list[i] < minValue) {
                minValue = list[i];
            }
        }


        System.out.println("], and min value is: " + minValue);

        int maxValue = list[0];
        System.out.print("array is this: [");
        for (int i = 1; i < list.length; i++) {
            System.out.print(list[i] + " ");
            if (list[i] > maxValue) {
                maxValue = list[i];
            }
        }
        System.out.println("], and max value is: " + maxValue);
    }
}
