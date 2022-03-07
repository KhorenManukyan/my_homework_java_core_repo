package book.shildt.javacore.chapter8.mnogourovenni.irarxia;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob){
        super(ob);
        this.weight = weight;
    }

    BoxWeight(double width, double height, double depth, double weight){
        super(width,height,depth);
        this.weight = weight;
    }

    BoxWeight(){
        super();
        weight = -1;
    }

    BoxWeight(double len, double weight){
        super(len);
        this.weight = weight;
    }
}
