package book.shildt.javacore.chapter8.osnovi.inher;

public class SimpleInheritance {
    public static void main(String[] args) {
        AInheritance superA = new AInheritance();
        BInheritance subB = new BInheritance();

        superA.i = 10;
        superA.j = 20;

        superA.showij();
        subB.sum();

        subB.i = 7;
        subB.j = 8;
        subB.k = 9;
        subB.showij();
        subB.showk();

//        System.out.println();
        subB.sum();
    }
}
