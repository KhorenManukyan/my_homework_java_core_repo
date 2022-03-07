package videos.interediate.pulin.arac.chapter_2._9builder.pattern;

import videos.interediate.pulin.arac.chapter_2._8immutable.strategy.Animal;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AnimalBuilder duckBuilder = new AnimalBuilder();
        duckBuilder
                .setAge(4)
                .setFavoriteFoods(Arrays.asList("grass", "fish")).setSpecies("duck");
        Animal flamingo = new AnimalBuilder()
                .setFavoriteFoods(Arrays.asList("algae" , "insects"))
                .setSpecies("flamingo").build();
    }
}
