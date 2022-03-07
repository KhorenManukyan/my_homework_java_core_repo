package book.shildt.javacore.chapter9.interfaces;

public class NestedIFDemo {
    public static void main(String[] args) {
        AIntfClass.NestedIf nestedIf= new BIntfClass();
        if (nestedIf.isNotNegative(10)){
            System.out.println("drakan");
        }
        if (nestedIf.isNotNegative(12)){
            System.out.println("drakan");
        }
    }
}
