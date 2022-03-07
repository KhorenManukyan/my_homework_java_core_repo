package book.shildt.javacore.chapter19.hash;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("Джон Доу", new Double(3434.34));
        treeMap.put("Toм Смит", new Double(123.22));
        treeMap.put("Джейн Бейкер", new Double(1378.00));
        treeMap.put ("Тод Холл", new Double ( 99.22));
        treeMap.put("Paльф Смит", new Double(-19.08));

        Set<Map.Entry<String,Double>> set = treeMap.entrySet();

        for (Map.Entry<String, Double> me: set){
            System.out.println(me.getKey() + " " + me.getValue());
        }
        System.out.println();
//        double balance = treeMap.get("Джон Доу");
        treeMap.put("Джон Доу", treeMap.get("Джон Доу") + 1000);
        System.out.println("Hoвый остаток на счете Джона Доу: "
                + treeMap.get ("Джон Доу"));
    }
}
