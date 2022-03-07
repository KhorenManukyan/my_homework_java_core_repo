package videos.ITVDN.javaEssential.lesson1.im.ex_002_access_madifiers;

public class Shape {
    private int length;
    private long height;
    public double square;

    Shape() {

    }

    Shape(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void sReturn() {
        System.out.println(length);
        System.out.println(height);
        System.out.println(square);
    }
}
