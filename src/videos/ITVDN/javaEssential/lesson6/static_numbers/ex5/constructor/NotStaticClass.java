package videos.ITVDN.javaEssential.lesson6.static_numbers.ex5.constructor;

public class NotStaticClass {

    public NotStaticClass() {
        System.out.println("Constructor");
    }


    static {
        System.out.println("Static block");
    }

    public static void staticMethod(){
        System.out.println("Static method");
    }

    public void notStaticMethod(){
        System.out.println("Not Static method");
    }
}
