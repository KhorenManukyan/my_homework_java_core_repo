package videos.ITVDN.javaEssential.lesson4.abstraction.ex002;

public abstract class AbstractClass extends ConcreteClassA {
    int a = 12;
    boolean b;

    public AbstractClass(int a, boolean b) {
        this.a = a;
        this.b = b;
    }

    public abstract void method();
}
