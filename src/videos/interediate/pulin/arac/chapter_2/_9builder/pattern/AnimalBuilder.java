package videos.interediate.pulin.arac.chapter_2._9builder.pattern;

import videos.interediate.pulin.arac.chapter_2._8immutable.strategy.Animal;


import java.util.List;

public class AnimalBuilder {
    private String species;
    private int age;
    private List<String> favoriteFoods;

    public AnimalBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public AnimalBuilder setSpecies(String species){
        this.species = species;
        return this;
    }

    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods){
        this.favoriteFoods = favoriteFoods;
        return this;
    }

    public Animal build(){
        return new Animal(species, age, favoriteFoods);
    }
}
