package videos.ITVDN.javaEssential.lesson7.anonymous.ex6;

public class ConcreteClass implements Interface{
    protected int protectedField = 10;

    @Override
    public void method() {
        System.out.println("ConcreteClass: method() ");
    }

    @Override
    public int getValue() {
        return protectedField;
    }
}
