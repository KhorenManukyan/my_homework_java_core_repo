package videos.ITVDN.javaEssential.lesson7.anonymous.ex1;

public class Main {
    public static void main(String[] args) {
        Interface instance = new Interface() {
            @Override
            public void method() {
                System.out.println("Call method from anonymous class");
            }
        };
        instance.method();
        System.out.println(instance.getClass().toString());
        System.out.println(instance.getClass().toString());
    }
}
