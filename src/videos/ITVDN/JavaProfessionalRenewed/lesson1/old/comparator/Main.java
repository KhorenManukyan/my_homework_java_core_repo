package videos.ITVDN.JavaProfessionalRenewed.lesson1.old.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 20, 4000);
        Animal bird = new Animal("King Penguin", 15, 8,50000);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.price - o2.price;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });

        for (Animal animal : c) {
            System.out.println(animal);
        }

        System.out.println();

        Arrays.sort(c, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.speed - o2.speed;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });

        for (Animal animal : c) {
            System.out.println(animal);
        }

        System.out.println();


        Arrays.sort(c, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.breed.compareTo(o2.breed);
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });

        for (Animal animal : c) {
            System.out.println(animal);
        }


       /*
        PorcnakanArrays.sort(c, new ComparatorByPrice());

        for (Animal animal : c) {
            System.out.println(animal);
        }

        System.out.println();

        PorcnakanArrays.sort(c, new ComparatorBySpeed());

        for (Animal animal : c) {
            System.out.println(animal);
        }

        System.out.println();


        PorcnakanArrays.sort(c, new ComparatorByColor());

        for (Animal animal : c) {
            System.out.println(animal);
        }

*/
    }
}
