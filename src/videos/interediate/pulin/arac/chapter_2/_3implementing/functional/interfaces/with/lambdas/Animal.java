package videos.interediate.pulin.arac.chapter_2._3implementing.functional.interfaces.with.lambdas;

public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean isCanHop(){
        return canHop;
    }

    public boolean isCanSwim(){
        return canSwim;
    }

    public String toString(){
        return species;
    }
}
