package videos.interediate.pulin.arac.chapter_3._1array.and.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Fluffy");
        list.add("Webby");

        String[] array = new String[list.size()];
        array[0] = list.get(1);
        array[1] = list.get(0);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "-");

        }
    }
}
