package videos.telegramic.das9.hin;

import videos.Tigrani.daseric.lesson5.Arr;

import java.util.*;

public class Lm {
    public static void main(String[] args) {
        int[] mass = {1, 5, 4868, 8, 48};
 /*        System.out.println(PorcnakanArrays.toString(mass));
        System.out.println(mass);
        mass = PorcnakanArrays.copyOf(mass,mass.length -1);
        System.out.println(PorcnakanArrays.toString(mass));
        Object[] objectsMass = {"a", 15, 84f};*/

        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);
        collection.add(7);
        collection.add(8);

        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            int i = (int) iterator.next();
            if (i == 2) {
                iterator.remove();
            }
            System.out.print(i + " ");
//            System.out.println(PorcnakanArrays.toString(iterator));
        }
        System.out.println();
        System.out.println("/////////////////////////");

        for (Object o : collection) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println("/////////////////////////");

//        System.out.println(collection.addAll(collection));
//        System.out.println(collection.toArray());

        List<String> list = new ArrayList<>();

        list.add("Hopar");
        list.add("vzgo");
        list.add("mi ban");

        list.set(1, "apush");

        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("/////////////////////////");
        list.add(1, "ay qez ban");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("/////////////////////////");

        list.set(list.indexOf("mi ban"), "erku ban");

        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("/////////////////////////");

//        list.sort();


        Set<String> setu = new TreeSet<>();
        setu.add("aaa");
        setu.add("bbb");
        setu.add("ccc");
        setu.add("cccbbb");
        setu.add("bbb");
        setu.add("vv");
        setu.add("aacca");

        System.out.println(setu.size());

        Map<Integer, String> orinak = new HashMap<>();
        orinak.put(1, "mek");
        orinak.put(5, "mek");
        orinak.put(2, "erku");
        orinak.put(3, "ereq");
        orinak.put(2, "mek");
        for (int i = 0; i < orinak.size(); i++) {
            System.out.println(orinak.get(i));
        }
        System.out.println(orinak.size());
        System.out.println(orinak.get("mek"));

        System.out.println("/////////////////////////");

        Map<String, User> users = new HashMap<>();
        users.put("Hopar", new User("vzgo", 18));
        users.put("harevan", new User("Xcho", 23));
        users.put("vomn", new User("Vomik", 81));
        System.out.println(users.get("Hopar"));

        if (users.containsKey("vomn")){
            System.out.println(users.get("vomn"));
        }

        System.out.println(users.containsValue(new User("Xcho", 23)));

        Set<String> stringSet = users.keySet();
        Set<String> stringSeta = (Set<String>) users.get("vomn");
        System.out.println(stringSeta);
        for (String key: stringSet){
            System.out.println(users.get(key));
        }
    }
}



















