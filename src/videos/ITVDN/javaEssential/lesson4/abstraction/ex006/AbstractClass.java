package videos.ITVDN.javaEssential.lesson4.abstraction.ex006;

public abstract class AbstractClass {
    public AbstractClass(){
        System.out.println("1 AbstractClass");
        this.abstractMethod();
        System.out.println("2 AbstractClass");
    }

    public abstract void abstractMethod();
}
