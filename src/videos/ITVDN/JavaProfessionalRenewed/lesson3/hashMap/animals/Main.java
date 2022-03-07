package videos.ITVDN.JavaProfessionalRenewed.lesson3.hashMap.animals;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(5000, "Labrador");
        Animal cat = new Animal(7000, "Sphynx");
        Animal bird = new Animal(9000, "Penguin");

        HashMap<Animal, String> hashMap = new HashMap<>();
        hashMap.put(dog,"Mike");
        hashMap.put(cat,"Marsel");
        hashMap.put(bird,"Riko");

        Animal findName = new Animal(9000, "Penguin");
        System.out.println(hashMap.get(findName));


    }
}
