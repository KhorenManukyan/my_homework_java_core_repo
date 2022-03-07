package book.ocp.chapter2.interfaces;

public interface StaticInterfaceExample {
    static void walk() {
        System.out.println("Ну, я пошел...");
    }
}

class Main{
    public static void main(String[] args) {
        StaticInterfaceExample.walk();
    }
}
