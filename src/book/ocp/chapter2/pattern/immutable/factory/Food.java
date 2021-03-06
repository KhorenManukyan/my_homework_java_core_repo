package book.ocp.chapter2.pattern.immutable.factory;

public abstract class Food {
    private int quantity;

    public Food(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract void consumed();
}

class Pellets extends Food{

    public Pellets(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Pallets eaten: " + getQuantity());
    }

}
class Fish extends Food{

    public Fish(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Fish eaten: " + getQuantity());
    }
}
class Hay extends Food{

    public Hay(int quantity) {
        super(quantity);
    }
    @Override
    public void consumed() {
        System.out.println("Hay eaten: " + getQuantity());
    }

}
