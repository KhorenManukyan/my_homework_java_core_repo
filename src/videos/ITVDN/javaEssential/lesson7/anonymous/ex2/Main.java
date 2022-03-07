package videos.ITVDN.javaEssential.lesson7.anonymous.ex2;

public class Main {
    public static void main(String[] args) {

        Interface inst = new Interface() {
            public double d = 1.3;
            protected String str = "Anonymous class";
            private int num = 10;


            @Override
            public void method() {
                num = 1234;
                System.out.println("instance1: d = " + d + ", str = " + str + ", num = " + num );
            }
        };

        inst.method();
    }
}
