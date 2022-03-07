package videos.interediate.pulin.arac.porcnakan.test;

import java.util.Arrays;

public class SelectedSort {
    public static int[] selectedSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 9, 6, 3, 7, 1};

        System.out.println("before sort " + Arrays.toString(array));
        System.out.println("after sort " + Arrays.toString(selectedSort(array)));


    }

}
