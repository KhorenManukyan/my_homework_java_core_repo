package videos.ITVDN.javaEssential.lesson4.interfaces.ex003;

public class Main {
    public static void main(String[] args) {
        DerivedClass d = new DerivedClass();
        d.method();
        d.method1();
        d.method2();

        System.out.println("--------------------------");

        BaseClass b = (BaseClass) d;
        b.method();

        Interface1 i1 = (Interface1) b;
        i1.method1();

        Interface2 i2 = (Interface2) i1;
        i2.method2();
    }
}
