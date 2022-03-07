package videos.ITVDN.javaEssential.lesson3.ex009;

public class Main {
    public static void main(String[] args) {
        SomeClass instance = new SomeClass();
        instance.method1();
        instance.method2();
        instance.method3();
        System.out.println("+++++++++++++++++++++++++++++++++");

        SomeInterface1 interface1 = instance;
        interface1.method1();

        SomeInterface2 interface2 = instance;
        interface2.method2();
    }
}
