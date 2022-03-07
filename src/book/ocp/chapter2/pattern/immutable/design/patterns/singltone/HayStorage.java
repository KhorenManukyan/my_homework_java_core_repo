package book.ocp.chapter2.pattern.immutable.design.patterns.singltone;

public class HayStorage {
    private int quantity = 0;

    private HayStorage() {
    }

    private static final HayStorage instance = new HayStorage();

    public static HayStorage getInstance(){
        return instance;
    }

    public synchronized void addHay(int amount){
        quantity += amount;
    }

    public synchronized boolean removeHay(int amount){
        if (quantity<amount)return false;
        quantity -= amount;
        return true;
    }

    public synchronized int getQuantity(){
        return quantity;
    }
}

class LamaTrainer{
    public boolean feedLamas(int numberOfLamas){
        int amountNeeded = 5 *   numberOfLamas;
        HayStorage hayStorage = HayStorage.getInstance();
        if (hayStorage.getQuantity() < amountNeeded){
            hayStorage.addHay(amountNeeded + 10);
        }

        boolean fed = hayStorage.removeHay(amountNeeded);
        if (fed){
            System.out.println("Lamas have been fed");
        }
        return fed;
    }
}

class  StaffRegister{
    private static final StaffRegister instance;

    static {
        instance = new StaffRegister();
    }

    private StaffRegister(){}

    public static StaffRegister getInstance(){
        return instance;
    }
}

