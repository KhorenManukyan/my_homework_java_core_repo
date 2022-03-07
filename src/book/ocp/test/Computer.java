package book.ocp.test;

class Laptop extends Computer {
    public void startup() {
        System.out.print("laptop-");
    }
}

public class Computer {
    public void startup() {
        System.out.print("computer-");
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer computer1 = new Laptop();
        Laptop laptop = new Laptop();
        computer.startup();
        System.out.print("  ");
        computer1.startup();
        System.out.print("  ");
        laptop.startup();
    }
}
