package videos.ITVDN.javaEssential.lesson6.inner_class.ex2;

public class Main {
    public static void main(String[] args) {
        MyClass.Inner inner = new MyClass().new Inner();
        inner.method(1);
    }
}
