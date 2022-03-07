package videos.ITVDN.javaEssential.lesson4.abstraction.ex004;

public class ConcreteDerivedClass extends AbstractBaseClass {
    @Override
    public void method2(){
        super.method2();
        System.out.println("over ConcreteClass method 2");
    }
    @Override
    public void method3() {
        System.out.println("abstr ConcreteClass method 3");
    }
}
