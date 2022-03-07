package videos.interediate.pulin.arac.chapter_2._8immutable.strategy;

import java.util.*;

public final class Animal1 {
    private final List<String> favoriteFoods;


    public Animal1(List<String> favoriteFoods) {
        if (favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public List<String> getFavoriteFoods(){
        return favoriteFoods;
    }
}
