package videos.ITVDN.JavaProfessionalRenewed.lesson3.a2;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleIdentityHashMap {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put((new Integer(1)), "one");
        identityHashMap.put((new Integer(11)), "two");
        identityHashMap.put((new Integer(23)), "three");
        identityHashMap.put((new Integer(1)), "one");
        identityHashMap.put((new Integer(23)), "five");
        Set set = identityHashMap.entrySet();
        for (Object o : set) {
            Map.Entry<Integer, String > map = (Map.Entry<Integer, String>)o ;
            System.out.println(map.getKey() + " " + map.getValue());
        }
        System.out.println();


        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put((new Integer(1)), "one");
        hashMap.put((new Integer(11)), "two");
        hashMap.put((new Integer(23)), "three");
        hashMap.put((new Integer(1)), "one");
        hashMap.put((new Integer(23)), "five");
        Set set1 = hashMap.entrySet();
        for (Object o : set1) {
            Map.Entry<Integer, String > map = (Map.Entry<Integer, String>)o ;
            System.out.println(map.getKey() + " " + map.getValue());


        }
    }
}
