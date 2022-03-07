package book.ocp.chapter1.methodInvocation.two;

public abstract class Animal {
    String name = "???";
    public void printName(){
        System.out.println(name);
    }
}

class Lion extends Animal{
    String name = "Leo";
}

class PlayWithAnimal{
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.printName();
    }
}

