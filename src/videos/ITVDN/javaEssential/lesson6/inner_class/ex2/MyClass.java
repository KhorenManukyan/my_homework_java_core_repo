package videos.ITVDN.javaEssential.lesson6.inner_class.ex2;

public class MyClass {
    private static int field = 0;

    public MyClass() {
    }

    public class Inner{

        public void method(int a){
            field = a;
            System.out.println(field);
        }
    }

}
