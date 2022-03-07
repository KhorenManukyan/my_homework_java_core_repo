package videos.ITVDN.javaEssential.lesson4.abstraction.ex001;

public class Main {
    public static void main(String[] args) {
        AbstractClass c = new ConcreteClass();
        System.out.println(c.move());
    }
}
