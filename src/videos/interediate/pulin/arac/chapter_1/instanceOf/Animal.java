package videos.interediate.pulin.arac.chapter_1.instanceOf;

public class Animal {
    public void feedAnimal(Animal animal) {
        if (animal instanceof Cow) {
            ((Cow) animal).addHay();
        } else if (animal instanceof Bird) {
            ((Bird) animal).addSeed();
        } else if (animal instanceof Lion) {
            ((Lion) animal).addMeat();
        } else {
            throw new RuntimeException("Unsupported animal");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Lion();
        animal.feedAnimal(animal1);
//        animal.feedAnimal(animal);
    }
}

class Cow extends Animal{
 void addHay(){
     System.out.println("Caw");
 }
}

class Bird extends Animal{
    void addSeed(){
        System.out.println("Bird");

    }
}

class Lion extends Animal{
    void addMeat(){
        System.out.println("Lion");

    }
}
