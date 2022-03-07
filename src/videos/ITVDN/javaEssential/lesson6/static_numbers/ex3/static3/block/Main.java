package videos.ITVDN.javaEssential.lesson6.static_numbers.ex3.static3.block;

public class Main {
    public static void main(String[] args) {
        System.out.println(NotStaticClass.X);

        NotStaticClass nonStaticClass = new NotStaticClass();
        System.out.println(nonStaticClass.X);
    }
}
