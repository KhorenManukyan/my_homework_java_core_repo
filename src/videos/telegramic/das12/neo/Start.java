package videos.telegramic.das12.neo;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        int[] arr = new int[10];
/*
        System.out.println(arr.length);
        arr = PorcnakanArrays.copyOf(arr, arr.length + 5);
        System.out.println(arr.length);

        Scanner scanner = new Scanner(System.in);

//        if (scanner.hasNext()){
            String x = scanner.next();
//        }
*/

        Iterator iterator = new Datarkox("bah klyuch eiminch miban chaynik");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
