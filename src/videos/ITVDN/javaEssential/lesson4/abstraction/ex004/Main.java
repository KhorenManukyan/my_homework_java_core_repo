package videos.ITVDN.javaEssential.lesson4.abstraction.ex004;

public class Main {
    public static void main(String[] args) {
        AbstractBaseClass conc = new ConcreteDerivedClass();
        conc.method1();
        conc.method2();
        conc.method3();
    }
}
