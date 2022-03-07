package book.ocp.chapter1.methodInvocation.three;

public abstract class Animal {
    public void coreFor(){
        play();
    }

    public void play() {
        System.out.println("pet animal");
    }
}

class Lion extends Animal{
    public void play(){
        System.out.println("toss in meat");
    }
}

class Main{
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.coreFor();
    }
}
