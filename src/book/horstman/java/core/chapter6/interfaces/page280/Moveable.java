package book.horstman.java.core.chapter6.interfaces.page280;

public interface Moveable {
    void move(double x, double y);
}

interface Powered extends Moveable{
    double milesPerGallon();
    double SPEED_LIMIT = 95;
}
