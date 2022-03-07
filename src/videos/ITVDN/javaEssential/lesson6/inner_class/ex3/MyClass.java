package videos.ITVDN.javaEssential.lesson6.inner_class.ex3;

public class MyClass {
    private int field = 0;

    public static class Inner{
        MyClass myClass = new MyClass();
        public void method(int a){
            myClass.field = a;
            System.out.println(myClass.field);
        }
    }
}
