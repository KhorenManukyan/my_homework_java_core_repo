package videos.ITVDN.javaEssential.lesson6.inner_class.ex4;


class MyClass {
    public class Inner extends BaseClass {
        public void MethodFromInner() {
            System.out.println("InnerClass");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Inner inner = new MyClass().new Inner();
        inner.MethodFromInner();
        inner.MethodFromBase();
    }
}
