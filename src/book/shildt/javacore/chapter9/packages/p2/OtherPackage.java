package book.shildt.javacore.chapter9.packages.p2;

public class OtherPackage {
    OtherPackage(){
        book.shildt.javacore.chapter9.packages.p1.Protection p = new book.shildt.javacore.chapter9.packages.p1.Protection();
        System.out.println("кoнcтpyктop из другого пакета");
        // доступно только для данного класса или пакета
        // System.out.println("n = " + p.n);
        // доступно только для данного класса
        // System.out.println("n_pri =" + p.n_pri);
        // доступно только для данного класса,
        // подкласса или пакета
        // System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
