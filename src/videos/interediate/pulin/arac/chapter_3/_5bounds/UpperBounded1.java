package videos.interediate.pulin.arac.chapter_3._5bounds;

import videos.interediate.pulin.arac.chapter_1.instanceOf.Animal;

import java.util.ArrayList;
import java.util.List;

public class UpperBounded1 {
    public static void main(String[] args) {
        List<? super Animal> list = new ArrayList<>();

        list.get(0);
    }
}
