package book.ocp.chapter2.Encapsulation.page62;

public class Lemur extends Primate implements HasTail{
    public int age = 10;

    @Override
    public int isTailStriped() {
        return 1;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());
    }
}
