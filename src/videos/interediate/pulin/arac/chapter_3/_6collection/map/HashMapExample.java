package videos.interediate.pulin.arac.chapter_3._6collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "bamboo");
        map.put(2, "meat");
        map.put(3, "leaf");
        String food = map.get("koala");
        for(Integer key: map.keySet()){
            System.out.println(key+" - "+ map.values());
        }
        System.out.println();
        for(String key: map.values()){
            System.out.print(key+", ");
        }
//        System.out.println(food);
    }
}
