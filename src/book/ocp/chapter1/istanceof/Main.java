package book.ocp.chapter1.istanceof;

public class Main {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo;
        boolean b2 = hippo instanceof HeavyAnimal;
        boolean b3 = hippo instanceof Elephant;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        boolean b4 = hippo instanceof Object;
        boolean b5 = null instanceof Object;
        System.out.println(b4);
        System.out.println(b5);
        boolean b6 = hippo instanceof Mother;
        System.out.println(b6);

    }
}
