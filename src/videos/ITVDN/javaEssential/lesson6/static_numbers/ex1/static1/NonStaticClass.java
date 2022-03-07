package videos.ITVDN.javaEssential.lesson6.static_numbers.ex1.static1;

public class NonStaticClass {
    private int ID;
    public static int field;

    public NonStaticClass(int ID) {
        this.ID = ID;
    }


    public void method() {
        System.out.println(ID + " , " + field);
    }

    public static void method1() {
        System.out.println(field);
    }
}
