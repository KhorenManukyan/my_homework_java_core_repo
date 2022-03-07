package videos.interediate.pulin.arac.chapter_1.nested.classes.local.classes;

public class Outer {
    private int length = 5;


    public void calculate() {
        final int width = 20;
        class Inner {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.isItFinal();
//        int y = 28;
//        y = 38;
//        Outer o = new Outer();
//        o.calculate();
    }
}
