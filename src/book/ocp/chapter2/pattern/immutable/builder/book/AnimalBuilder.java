package book.ocp.chapter2.pattern.immutable.builder.book;

import book.ocp.chapter2.pattern.immutable.immutable.Animal;

import java.util.List;

public class AnimalBuilder {
    private String species;
    private int age;
    private List<String> favoriteFoods;

    public AnimalBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
        return this;
    }

    public Animal build(){
        return new Animal(species,age,favoriteFoods);
    }

    @Override
    public String toString() {
        return "AnimalBuilder{" +
                "species='" + species + '\'' +
                ", age=" + age +
                ", favoriteFoods=" + favoriteFoods +
                '}';
    }
}
