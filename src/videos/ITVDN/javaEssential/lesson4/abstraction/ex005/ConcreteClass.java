package videos.ITVDN.javaEssential.lesson4.abstraction.ex005;

public class ConcreteClass extends AbstractBaseClass {
    @Override
    public void simpleMethod() {
        super.simpleMethod();
        System.out.println("Concrete simpleMethod");
    }

    @Override
    public void absMethod() {
        System.out.println("ConcreteClass abs");
    }
}
