package videos.interediate.pulin.arac.chapter_2._10factory.pattern;

public abstract class Food {
    private int quantity;

    public Food (int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public abstract void consumed();
}
