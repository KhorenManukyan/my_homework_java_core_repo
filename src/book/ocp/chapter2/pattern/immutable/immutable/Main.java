package book.ocp.chapter2.pattern.immutable.immutable;

import book.ocp.chapter2.pattern.immutable.immutable.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("lion", 5, Arrays.asList("meat", "more meat"));

        List<String> favoriteFoods = new ArrayList<>();
        for (int i = 0; i < lion.getFavoriteFoodsCount(); i++) {
            favoriteFoods.add(lion.getFavoriteFood(i));
        }

        Animal updatedLion = new Animal(lion.getSpecies(), lion.getAge() + 1, favoriteFoods);

/*

        System.out.println(lion.toString());
        System.out.println(updatedLion.toString());

*/

        String a = "aaa";
        String b = " bbb";
        a = b +" sjfdl";

        System.out.println(a);

    }
}
