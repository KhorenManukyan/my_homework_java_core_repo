package videos.ITVDN.javaEssential.lesson4.abstraction.ex006;

public class ConcreteClass extends AbstractClass{
    String s = "First";

    public ConcreteClass(){
        System.out.println("3 ConcreteClass");
        this.s = "Second";
    }
    @Override
    public void abstractMethod() {
        System.out.print("realizacia methoda absClass ");
        System.out.println(s);
    }
}
