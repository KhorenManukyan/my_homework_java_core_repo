package book.shildt.javacore.chapter15.methodReferance.page488;

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc<Integer> myClassCons = MyClass<Integer>::new;

        MyClass<Integer> mc = myClassCons.func(100);
        System.out.println(mc.getVal());
    }
}
