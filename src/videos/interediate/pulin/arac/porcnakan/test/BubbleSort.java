package videos.interediate.pulin.arac.porcnakan.test;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        boolean flag = true;
        while (flag) {

            flag= false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag= true;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{ 5,2, 9, 6, 3, 7,};

        System.out.println("before sort " + Arrays.toString(array));
        System.out.println("after sort " + Arrays.toString(bubbleSort(array)));


    }
}

