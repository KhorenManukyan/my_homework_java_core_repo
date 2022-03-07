package videos.interediate.pulin.arac.chapter_3._6collection.set.methods;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        boolean b1 = set.add(31);
        boolean b2 = set.add(22);

        boolean b6 = set.add(66);
        boolean b4 = set.add(10);
        boolean b3 = set.add(66);
        boolean b5 = set.add(55);

        boolean b7 = set.add(55);
        boolean b8 = set.add(8);
        for (Integer i: set){
            System.out.print(i + ", ");
        }
    }
}
