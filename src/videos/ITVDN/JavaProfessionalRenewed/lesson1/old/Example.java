package videos.ITVDN.JavaProfessionalRenewed.lesson1.old;

import videos.Tigrani.daseric.lesson5.Arr;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] mass = {1, 5, 4868, 8, 48};
        System.out.println(mass);
        System.out.println(mass.length);
        System.out.println(Arrays.toString(mass));
//        mass = PorcnakanArrays.copyOf(mass,mass.length -3);
        System.out.println(Arrays.toString(mass));
        mass = Arrays.copyOf(mass,mass.length +5);
        System.out.println(Arrays.toString(mass));

    }
}
