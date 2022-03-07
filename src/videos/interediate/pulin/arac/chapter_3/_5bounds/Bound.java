package videos.interediate.pulin.arac.chapter_3._5bounds;

import java.util.ArrayList;
import java.util.List;

public class Bound {

    public static void printList(List<?> list){
        for (Object x: list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        List<String> keyword = new ArrayList<>();
        keyword.add("java");
        printList(keyword);
    }
}
