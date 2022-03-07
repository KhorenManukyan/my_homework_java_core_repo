package videos.ITVDN.javaEssential.lesson4.interfaces.ex005;

public class Main {
    public static void main(String[] args) {
        ConcreteMethod c = new ConcreteMethod();
        c.method();

        Interface1 interface1 = (Interface1) c;
        interface1.method();

        Interface2 interface2 = (Interface2) c;
        interface2.method();
    }
}
