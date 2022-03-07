package videos.interediate.pulin.arac.chapter_2._10factory.pattern;

public class Fish extends Food{
    public Fish(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Fish eaten: "+getQuantity());
    }
}
