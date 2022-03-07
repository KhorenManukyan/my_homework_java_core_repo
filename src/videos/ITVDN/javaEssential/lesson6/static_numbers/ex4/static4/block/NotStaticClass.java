package videos.ITVDN.javaEssential.lesson6.static_numbers.ex4.static4.block;

public class NotStaticClass {
     static int x;
    static {
        x = 1;
        System.out.println(x);
    }

    static {
        x = 23;
        System.out.println(x);
    }

    static {
        x = 99;
        System.out.println(x);
    }


    /*
    {
        x = 1;
        System.out.println(x);
    }

    {
        x = 23;
        System.out.println(x);
    }

    {
        x = 99;
        System.out.println(x);
    }

    public NotStaticClass() {
        System.out.println("Constructor x = " + x);
    }
    */

    public NotStaticClass(int x) {
        this.x = x;
        System.out.println("Constructor x = " + x);
    }
}
