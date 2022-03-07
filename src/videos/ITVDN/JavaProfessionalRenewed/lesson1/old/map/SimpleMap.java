package videos.ITVDN.JavaProfessionalRenewed.lesson1.old.map;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
//        ArrayList<Integer> a = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("World", 100);
//        System.out.println(map.size());
        map.put("World1", null);
        map.put(null, null);
        map.put("World3", 350);
//        System.out.println(map.size());
        System.out.println(map);

        for (Map.Entry<String, Integer> temp : map.entrySet()){
            System.out.println(temp.getKey() + " " + temp.getValue());
        }

    }
}
