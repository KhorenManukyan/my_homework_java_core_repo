package videos.interediate.pulin.arac.chapter_2._10factory.pattern;

public class Pellets extends Food{
    public Pellets(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Pellets eaten: "+getQuantity());
    }
}
