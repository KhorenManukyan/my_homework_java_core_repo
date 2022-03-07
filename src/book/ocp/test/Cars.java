package book.ocp.test;

public class Cars {
    private static void drive() {
     /*   static {
            System.out.println("static");
        }*/
        System.out.println("fast");
    }
    public static void main(String[] args) {
        drive();
        drive();
    }
}