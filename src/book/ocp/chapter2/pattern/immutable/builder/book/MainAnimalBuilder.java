package book.ocp.chapter2.pattern.immutable.builder.book;

import book.ocp.chapter2.pattern.immutable.immutable.Animal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainAnimalBuilder {
    public static void main(String[] args) {
        AnimalBuilder duckBuilder = new AnimalBuilder();
        duckBuilder
                .setAge(4)
                .setSpecies("duck")
                .setFavoriteFoods(Arrays.asList("grass", "fish"));
        Animal duck = duckBuilder.build();
        Animal flamingo = new AnimalBuilder()
                .setFavoriteFoods(Arrays.asList("algae", "insects"))
                .setSpecies("flamingo").build();

        Set<Animal> animals = new HashSet<>();
        animals.add(flamingo);
        animals.forEach(System.out::println);
    }
}
