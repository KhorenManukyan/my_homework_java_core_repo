package book.ocp.chapter2.pattern.immutable.immutable;


import java.util.ArrayList;
import java.util.List;

public final class Animal {
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    public Animal(String species, int age,List<String> favoriteFoods){
        this.species = species;
        this.age = age;
        if (favoriteFoods == null){
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public String getSpecies(){
        return species;
    }

    public int getAge(){
        return age;
    }

    public int getFavoriteFoodsCount(){
        return favoriteFoods.size();
    }

    public String getFavoriteFood(int index){
        return favoriteFoods.get(index);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", age=" + age +
                ", favoriteFoods=" + favoriteFoods +
                '}';
    }

    /*
    public List<String> getFavoriteFoods(){
        return favoriteFoods;   // MAKES CLASS MUTABLE!
    }
    */
}
