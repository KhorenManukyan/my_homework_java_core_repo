package videos.ITVDN.javaEssential.lesson5.ex004;

import videos.Tigrani.daseric.lesson5.Arr;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,13,24, 4, 56};
        int[] arr2 = {244, 44, 6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 12));
        System.out.println(arr.equals(arr2));
        Arrays.fill(arr, 12);
        System.out.println(Arrays.toString(arr));


    }
}
