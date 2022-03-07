package book.shildt.javacore.chapter8.prakticheski.primer;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(double width, double height, double depth, double weight){
        super(width,height,depth);
        this.weight = weight;
    }
}
