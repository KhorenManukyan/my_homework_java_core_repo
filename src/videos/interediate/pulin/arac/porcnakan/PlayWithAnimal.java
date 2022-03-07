package videos.interediate.pulin.arac.porcnakan;

 class Animal{
    String name = "???";
    public void printName(){
        System.out.println(name);
    }
}

class Lion extends Animal{
    String name1 = "Leo";
}

public class PlayWithAnimal {
    public static void main(String[] args) {
        Animal animal = new Lion();
        Lion animal1 = new Lion();
        System.out.println(animal.name);
        System.out.println(animal1.name1);
        animal.printName();
    }
}
