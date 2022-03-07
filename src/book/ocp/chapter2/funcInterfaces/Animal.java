package book.ocp.chapter2.funcInterfaces;

public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isCanHop() {
        return canHop;
    }

    public boolean isCanSwim() {
        return canSwim;
    }
}

interface CheckTrait{
    public boolean test(Animal a);
}

class FindMatchingAnimals{
    private static void print(Animal animal, CheckTrait trait){
        if (trait.test(animal)){
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        print(new Animal("fish", false, true), a -> a.isCanHop());
        print(new Animal("kangaroo", true, false),a -> a.isCanSwim());
    }
}
















