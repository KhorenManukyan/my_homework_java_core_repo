package book.shildt.javacore.chapter7;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1(10,20,15);
        Box1 myBox2 = new Box1();
        Box1 myCube = new Box1(7);

        Box1 myClone = new Box1(myBox1);

        System.out.println(myBox1.volume());
        System.out.println(myBox2.volume());
        System.out.println(myCube.volume());
        System.out.println(myClone.volume());
    }
}
