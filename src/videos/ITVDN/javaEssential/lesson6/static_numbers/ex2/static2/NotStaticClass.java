package videos.ITVDN.javaEssential.lesson6.static_numbers.ex2.static2;

public class NotStaticClass {
    private int ID;

    public NotStaticClass(int ID){
        this.ID = ID;
    }

    public static void method(){
//        System.out.println(ID);
        System.out.println("Can not invoke non static field");
    }
}
