package videos.ITVDN.javaEssential.lesson10.ex1;

public class MyClass <T>{
    T field;

    public MyClass(T field) {
        this.field = field;
    }

    public void method(){
        System.out.println(field.getClass());
    }
}
