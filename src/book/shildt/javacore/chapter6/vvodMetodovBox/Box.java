package book.shildt.javacore.chapter6.vvodMetodovBox;

public class Box {
    double width;
    double height;
    double depth;

    Box(double width,double height,double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double vol(){
       return width * height * depth;
    }

    public double setDim(double width,double height,double depth){
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box(10,20,15);


//        box.width = 10;
//        box.depth = 20;
//        box.height = 15;

        System.out.println(box.vol());
        System.out.println(box.setDim(10,20,15));
    }
}