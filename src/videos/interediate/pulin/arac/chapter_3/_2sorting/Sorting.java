package videos.interediate.pulin.arac.chapter_3._2sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers ={2,5,4,6,3,5,6,7};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 8));
    }
}
