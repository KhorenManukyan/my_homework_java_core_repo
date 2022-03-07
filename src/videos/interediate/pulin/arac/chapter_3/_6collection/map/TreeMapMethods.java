package videos.interediate.pulin.arac.chapter_3._6collection.map;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapMethods {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala");
//        System.out.println(food);
        for (String key: map.keySet()){
            System.out.print(key + ", ");
        }
    }
}
