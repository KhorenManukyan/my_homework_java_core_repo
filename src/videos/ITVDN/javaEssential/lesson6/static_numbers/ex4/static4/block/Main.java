package videos.ITVDN.javaEssential.lesson6.static_numbers.ex4.static4.block;

public class Main {
    public static void main(String[] args) {
        int a = NotStaticClass.x;
        int f = 4;
        System.out.println(a);
        NotStaticClass notStaticClass = new NotStaticClass(1111);
        System.out.println(notStaticClass.x);

        System.out.println(NotStaticClass.x);

    }
}
