package videos.ITVDN.javaEssential.lesson6.static_numbers.ex5.constructor;

public class Main {
    public static void main(String[] args) {
        NotStaticClass notStaticClass = new NotStaticClass();
        NotStaticClass notStaticClass1 = new NotStaticClass();
        NotStaticClass.staticMethod();
//        NotStaticClass.notStaticMethod();
    }
}
