package book.shildt.javacore.chapter8.mnogourovenni.irarxia;

public class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
    }

    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}
























