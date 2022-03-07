package videos.interediate.pulin.arac.chapter_2._8immutable.strategy;

import java.util.List;

public final class Animal {
    private final String spaces;
    private final int age;
    private final List<String> favoriteFoods;

    public Animal(String spaces, int age, List<String> favoriteFoods) {
        this.spaces = spaces;
        this.age = age;
        if (favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = favoriteFoods;
    }

    public String getSpaces(){
        return spaces;
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
}
