package videos.ITVDN.javaEssential.lesson7.anonymous.ex3;

public class Main {
    public static void main(String[] args) {
        Interface inter = new Interface() {
            public int publicField = 3;

            @Override
            public void method() {
                 publicField = 1234;
                System.out.println("instance1: publicField = " + getPublicField());
            }

            public int getPublicField(){
                return publicField;
            }
        };
        inter.method();
    }
}
