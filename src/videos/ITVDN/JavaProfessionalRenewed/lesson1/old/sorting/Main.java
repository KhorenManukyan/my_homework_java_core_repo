package videos.ITVDN.JavaProfessionalRenewed.lesson1.old.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal bird = new Animal("Penguin", 15, 8, 50000);
        Animal bird1 = new Animal("King Penguin", 35, 8, 40000);
        Animal dog = new Animal("Labrador", 30, 20, 4000);
        Animal dog1 = new Animal("Labrador1", 301, 21, 40100);


        Animal[] a = {cat, dog, bird, bird1, dog1};

        Arrays.sort(a);
        System.out.println(cat);

        for (Animal animal : a) {
            System.out.println(animal);
        }
    }
}
