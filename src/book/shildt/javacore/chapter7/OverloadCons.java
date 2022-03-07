package book.shildt.javacore.chapter7;

public class OverloadCons {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(42);
        Box box2 = new Box(40,8,5);

        System.out.println(box.value());
        System.out.println(box1.value());
        System.out.println(box2.value());
    }
}
