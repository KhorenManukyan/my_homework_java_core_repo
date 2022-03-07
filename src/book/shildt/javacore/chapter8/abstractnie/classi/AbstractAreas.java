package book.shildt.javacore.chapter8.abstractnie.classi;

public class AbstractAreas {
    public static void main(String[] args) {
//        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);

        Figure figure;
//        figure = f;
//        System.out.println(figure.area());
        figure = r;
        System.out.println(figure.area());
        System.out.println(t.area());
    }
}
