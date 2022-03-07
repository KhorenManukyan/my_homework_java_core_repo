package videos.Tigrani.daseric.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        marge();

    }

    static int[] arr1Meth() {
        System.out.print("Mutqagreq arajin zangvaci chapser@ ");
        int arr1Number = scanner.nextInt();
        int[] arr1 = new int[arr1Number];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("mutqagreq te vor elementin inch tiv poxancenq " + i + ": ");
            arr1[i] = scanner.nextInt();
        }
        return arr1;

    }

    static int[] arr2Meth() {
        System.out.print("Mutqagreq erkrord zangvaci chapser@ ");
        int arr2Number = scanner.nextInt();
        int[] arr2 = new int[arr2Number];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("mutqagreq te vor elementin inch tiv poxancenq " + i + ": ");
            arr2[i] = scanner.nextInt();
        }
        return arr2;
    }

    static void marge() {
        int a = arr1Meth().length;
        int b = arr2Meth().length;
        int[] c= new int[a + b];
        for (int i = 0; i < c.length; i++) {
        }
        System.out.println(Arrays.toString(c));
    }
}
