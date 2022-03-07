package videos.ITVDN.JavaProfessionalRenewed.lesson1.repetition.comparable.ex003;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 20, 4000);
        Animal bird = new Animal("King Penguin", 7, 8,50000);

        Animal[] a = {cat,dog,bird};

        Arrays.sort(a);

        for (Animal animal : a) {
            System.out.println(animal);
        }



    }
}
