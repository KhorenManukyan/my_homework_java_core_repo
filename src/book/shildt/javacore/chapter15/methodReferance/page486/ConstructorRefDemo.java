package book.shildt.javacore.chapter15.methodReferance.page486;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc myClassCons = MyClass::new;

        MyClass mc = myClassCons.func(100);

        System.out.println(mc.getVal());
    }
}
