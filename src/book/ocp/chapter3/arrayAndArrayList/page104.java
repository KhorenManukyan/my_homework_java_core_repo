package book.ocp.chapter3.arrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class page104 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Fluffy");
        list.add("Webby");

        String[] array = new String[list.size()];
        array[0] = list.get(1);
        array[1] = list.get(0);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
        System.out.println();
        String[] array1 = {"gerbil", "mouse"};
        List<String> list1 = Arrays.asList(array1);
        list1.set(1, "test");
        array1[0] = "new";
        System.out.println(array1[0] + list1.get(1));
//        String[] array2 = (String[]) list1.toArray();
//        list1.remove(1);
    }

}
