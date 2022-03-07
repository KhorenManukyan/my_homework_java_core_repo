package videos.ITVDN.javaEssential.lesson7.anonymous.ex4;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        Interface inter = new Interface() {
            public int publicField = 11;

            @Override
            public void method() {
//                n = 399;
                publicField = n;
                System.out.println(publicField);
            }
        };

        inter.method();
    }
}
