package book.ocp.chapter3.list.set.map.queue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Page139 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala");
        System.out.println(food);
        for (String key: map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

        System.out.println(map.containsKey("lion"));
        System.out.println(map.containsValue("lion"));
        System.out.println(map.size());

    }
}
