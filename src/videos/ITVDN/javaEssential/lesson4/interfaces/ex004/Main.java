package videos.ITVDN.javaEssential.lesson4.interfaces.ex004;

public class Main {
    public static void main(String[] args) {
        ConcreteClass c = new ConcreteClass();
        c.method1();
        c.method2();

//        Interface i = new ConcreteClass();
//        i.method1();
        Interface1 i1 = (Interface1) c;
        i1.method1();
//        i1.method2();

        Interface2 i2 = (Interface2) c;
        i2.method1();
        i2.method2();
    }
}
