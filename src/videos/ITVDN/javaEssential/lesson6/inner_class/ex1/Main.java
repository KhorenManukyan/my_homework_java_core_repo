package videos.ITVDN.javaEssential.lesson6.inner_class.ex1;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method();
        MyClass.Inner mi = new MyClass().new Inner();
        mi.method();

//        MyClass.Inner inner = new MyClass.Inner();
    }
}
