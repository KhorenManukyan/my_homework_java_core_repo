package videos.ITVDN.JavaProfessionalRenewed.linkedHashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String > linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("arbuz", "a");
        linkedHashMap.put("dinya", "d");
        linkedHashMap.put("banana", "b");

        Set<Map.Entry<String,String>> set = linkedHashMap.entrySet();

        for (Map.Entry<String,String> stringStringEntry: set){
            System.out.println(stringStringEntry.getKey()+ " " + stringStringEntry.getValue());
        }
    }
}
