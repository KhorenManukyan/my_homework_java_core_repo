package book.shildt.javacore.chapter19.comparator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String,Double> tm = new TreeMap<>(new TComp());
        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Toм Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put ("Тод Холл", new Double ( 99.22));
        tm.put("Paльф Смит", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for(Map.Entry<String, Double> me:set){
            System.out.println(me.getKey()+ ": " + me.getValue());
        }

        System.out.println();

        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Hoвый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
    }
}
