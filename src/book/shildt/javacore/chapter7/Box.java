package book.shildt.javacore.chapter7;

public class Box {
    double width;
    double height;
    double depth;

    public Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(double depth){
        this.height = 10;
        this.depth = depth;
        this.width = 2;
    }

    public double value(){
        double val;
        val = width + height + depth;
        return val;
    }
}
