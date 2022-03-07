package videos.ITVDN.javaEssential.lesson10.ex1;

public class Main {
    public static void main(String[] args) {
        MyClass<String> myClass = new MyClass<String>("ABC");
        myClass.method();
        MyClass<Integer> myClass1 = new MyClass<>(123);
        myClass1.method();
    }
}
