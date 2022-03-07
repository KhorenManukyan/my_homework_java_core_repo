package videos.ITVDN.JavaProfessionalRenewed.lesson3.hashMap;

import java.util.HashMap;

public class SimpleHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(null, 25);
        hashMap.put(null, 50);
        hashMap.put(null, 70);
        System.out.println(hashMap.get(null));
    }
}
