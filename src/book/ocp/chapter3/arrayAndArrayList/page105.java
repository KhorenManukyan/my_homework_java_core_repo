package book.ocp.chapter3.arrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class page105 {
    public static void main(String[] args) {
/*        int[] numbers = {5, 6, 1, 8, 3, 9};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 2));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 7));*/

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.remove(1);
        numbers.remove(new Integer(5));
        System.out.println(numbers);
    }
}
