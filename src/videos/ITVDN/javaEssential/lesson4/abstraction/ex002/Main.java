package videos.ITVDN.javaEssential.lesson4.abstraction.ex002;

public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClassB(12,true);
        abstractClass.method();
        abstractClass.operation();
    }
}
