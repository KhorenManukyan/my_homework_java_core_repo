package videos.ITVDN.javaEssential.lesson4.abstraction.ex006;

public class Main {
    public static void main(String[] args) {
        AbstractClass a = new ConcreteClass();
        System.out.println("------------------------------------");
        a.abstractMethod();
    }
}
