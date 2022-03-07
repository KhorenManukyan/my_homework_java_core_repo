package videos.Tigrani.daseric.lesson17.generics;

import videos.Tigrani.daseric.lesson5.Arr;

import java.util.Arrays;

public class Main<F> {
    public static void main(String[] args) {
        String[] textArray = {"a", "b", "c"};
        Integer[] intArray = {7, 8, 9};
        Float[] floatArray = {4.5f, 9.6f, 7.3f};

//        printArray(textArray);
        printArray(intArray, "aaa");
//        printArray(floatArray, 3);
    }

    public static <E extends Number, K extends String> void printArray(E[] param, K arg) {
        for (E el : param) {
//            PorcnakanArrays.toString(el);
            System.out.print(el.toString());
        }
        System.out.println();
        System.out.println(arg);

    }
}
