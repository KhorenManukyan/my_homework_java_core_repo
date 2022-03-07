package videos.telegramic.das12.neo;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();

        map.put(1, "mek");
        map.put(2, "erku");
        map.put(3, "ereq");


        Set<Integer> set = map.keySet();
        for (Integer key: set){
            System.out.println(key + " " + map.get(key));
        }


    }
}
