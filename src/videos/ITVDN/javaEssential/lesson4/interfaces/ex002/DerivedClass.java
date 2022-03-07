package videos.ITVDN.javaEssential.lesson4.interfaces.ex002;

public class DerivedClass implements Interface1,Interface2{
    @Override
    public void method1() {
        System.out.println("method 1");
    }

    @Override
    public void method2() {
        System.out.println("method 2");
    }
}
