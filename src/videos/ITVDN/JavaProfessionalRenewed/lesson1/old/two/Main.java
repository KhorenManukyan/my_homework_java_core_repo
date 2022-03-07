package videos.ITVDN.JavaProfessionalRenewed.lesson1.old.two;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Sphynx", 10000);
        Animal dog = new Animal("Malamute", 20000);
        Animal bird = new Animal("Crow", 30000);

        Animal[] c = {cat, dog, bird};

        for (Animal animal : c) {
            animal.setPrice(4000);
//            animal.getPrice() ;
            animal = new Animal("Lion", 222);
//            System.out.println(animal.breed + " " + animal.price);
        }
        for (Animal animal : c) {
            System.out.println(animal.toString());
        }

    }
}
