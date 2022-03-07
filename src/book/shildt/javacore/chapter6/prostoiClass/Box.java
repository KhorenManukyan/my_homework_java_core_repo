package book.shildt.javacore.chapter6.prostoiClass;

public class Box {
    double width;
    double height;
    double depth;
}

class DemoBox{
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = box;
        box = null;
        box1.height = 28;
        System.out.println(box1.height);
        double vol;
//        box.height = 22;
//        System.out.println(box.height);
//        box.width = 10;
//        box.depth = 20;
//        box.height = 15;
//        vol = box.width * box.height * box.depth;
//        System.out.println(vol);

    }
}
