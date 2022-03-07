package videos.interediate.pulin.arac.porcnakan.test1.porcer;

//class Laptop extends Computer {
//    public void startup() {
//        System.out.print("laptop-");
//    }
//}
//
//public class Computer {
//    public void startup() {
//        System.out.print("computer-");
//    }
//
//    public static void main(String[] args) {
//        Computer computer = new Laptop();
//        Laptop laptop = new Laptop();
//        computer.startup();
//        laptop.startup();
//    }
//}
class Laptop extends Computer {
    String type = "laptop";
    public void startup() {
        System.out.print("laptop-");
    }
}

public class Computer {
    String type = "computer";
    public void startup() {
        System.out.print("computer-");
    }

    public static void main(String[] args) {
        Computer computer = new Laptop();
        Laptop laptop = new Laptop();
        System.out.print(computer.type + "," + laptop.type);
        System.out.println();
        computer.startup();
        laptop.startup();
    }
}