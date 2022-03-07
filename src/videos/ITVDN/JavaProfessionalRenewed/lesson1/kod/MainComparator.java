package videos.ITVDN.JavaProfessionalRenewed.lesson1.kod;

import java.util.Arrays;
import java.util.Comparator;

public class MainComparator {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 20, 4000);
        Animal bird = new Animal("King Penguin", 7, 8,50000);

        Animal[] animals = {cat, dog, bird};

        Arrays.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.weight - o2.weight;
            }
        });

        Arrays.sort(animals,new ComparatorByPrice());
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println();
        Arrays.sort(animals,new ComparatorBySpeed());
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println();

        Arrays.sort(animals, new ComparatorByColor());
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println();
    }
}
