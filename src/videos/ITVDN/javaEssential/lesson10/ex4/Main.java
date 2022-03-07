package videos.ITVDN.javaEssential.lesson10.ex4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        IContainer<Shape> iContainer = new Container<>(new Circle());

        System.out.println(iContainer.getFigure().toString());
    }
}
