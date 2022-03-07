package videos.ITVDN.JavaProfessionalRenewed.lesson3.treeMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        NavigableMap<String, Animal> navigableMap = new TreeMap<>();

        navigableMap.put("Yevgeni ",new Animal(7000));

        Animal pet = new Animal(8000);
        navigableMap.put("Alex ", pet);
        navigableMap.put("Edward ", new Animal(5000));
        navigableMap.put("Edward ", new Animal(6000));

        System.out.println(navigableMap);
        System.out.println(navigableMap.get("Alex "));
        System.out.println(navigableMap.containsKey("Edward "));
        System.out.println(navigableMap.containsValue(new Animal(8000)));
        System.out.println(navigableMap.containsValue(pet));


        Set<String> nameKeys = navigableMap.keySet();
        Collection<Animal> petsPrice = navigableMap.values();
        System.out.println(nameKeys);
        System.out.println(petsPrice);


        Set<Map.Entry<String , Animal>> keysAndValues = navigableMap.entrySet();
        System.out.println(keysAndValues);
        for (Map.Entry<String , Animal> temp: keysAndValues){
            temp.setValue(new  Animal(10000));
        }
        System.out.println(keysAndValues);



    }
}
