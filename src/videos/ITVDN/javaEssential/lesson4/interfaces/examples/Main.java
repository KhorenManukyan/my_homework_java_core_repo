package videos.ITVDN.javaEssential.lesson4.interfaces.examples;

public class Main {
    public static void main(String[] args) {
        Bird b = new Strauss();
        Bird b1 = new Penguin();
        Bird b2 = new Swallow();
        Bird[] a = new Bird[4];
        b.move();
        b1.move();
        b2.move();
        a[1] = new Strauss();
        a[2] = new Penguin();
        a[3] = new Swallow();
//        for (Bird s: a) {
//            s.move();
//        }
    }
}
