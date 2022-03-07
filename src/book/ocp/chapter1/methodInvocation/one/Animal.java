package book.ocp.chapter1.methodInvocation.one;

public abstract class Animal {
    public abstract void feed();
}

class Cow extends Animal {
    @Override
    public void feed() {
        addHay();
    }

    private void addHay() {
        System.out.println("cow");
    }


}

class Bird extends Animal {
    @Override
    public void feed() {
        addSeed();
    }

    private void addSeed() {

    }

}

class Lion extends Animal{

    @Override
    public void feed() {
        addMeet();
    }

    private void addMeet(){

    }
}

class Main{
    public static void feedAnimal(Animal animal){
        animal.feed();
    }
    public static void main(String[] args) {
        feedAnimal(new Cow());
    }
}

