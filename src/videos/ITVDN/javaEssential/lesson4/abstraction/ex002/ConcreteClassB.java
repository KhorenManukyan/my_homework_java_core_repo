package videos.ITVDN.javaEssential.lesson4.abstraction.ex002;

public class ConcreteClassB extends AbstractClass{
    public ConcreteClassB(int a, boolean b) {
        super(a, b);
    }

    @Override
    public void method() {
        System.out.println("method");
    }
}
