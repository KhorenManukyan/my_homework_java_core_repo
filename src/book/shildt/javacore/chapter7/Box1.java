package book.shildt.javacore.chapter7;

public class Box1 {
    double width;
    double height;
    double depth;

    Box1(Box1 ob){
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    Box1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box1(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len){
        width = depth = height = len;
    }

    double volume(){
        return width * height * depth;
    }
}
