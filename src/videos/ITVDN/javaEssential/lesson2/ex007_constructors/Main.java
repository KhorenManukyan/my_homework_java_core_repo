package videos.ITVDN.javaEssential.lesson2.ex007_constructors;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal(18);
        Animal animal2 =  new Animal(20,50);

        System.out.println(animal.getAge() + " " + animal.getHeight());
        System.out.println(animal1.getAge() + " " + animal1.getHeight());
        System.out.println(animal2.getAge() + " " + animal2.getHeight());
    }
}
