package videos.ITVDN.javaEssential.lesson6.static_numbers.ex6.abstractclass;

public abstract class AbstractClass {
    public static AbstractClass CreateObject(){
        return new ConcreteClass();
    }

    public abstract void method();
}
