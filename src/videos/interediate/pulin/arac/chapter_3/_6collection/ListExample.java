package videos.interediate.pulin.arac.chapter_3._6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExample{
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow"));
        System.out.println(list.add("Sparrow"));
        System.out.println("-----------------------");

        Set<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow"));
        System.out.println(set.add("Sparrow"));
        System.out.println(set.add("zoo"));
        System.out.println(set.add("zoo"));*/

        List<String> birds = new ArrayList<>();
//        birds.add("hawk");
//        birds.add("hawk");
//        System.out.println(birds);
//        System.out.println(birds.remove("cardinal"));
//        System.out.println(birds.remove("hawk"));
//        System.out.println(birds);
//        System.out.println(birds.isEmpty());
//        System.out.println(birds.size());
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.contains("hawk"));

        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
        birds.clear();
        System.out.println(birds);
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
        System.out.println(birds.contains("hawk"));



    }
}
























