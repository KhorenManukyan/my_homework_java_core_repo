package videos.ITVDN.JavaProfessionalRenewed.lesson3.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] people = new String[]{"Evgenii", "Alexander", "Karina", "Veronika", "Tamara", "Sergei" };

        HashMap<String, Human> map = addHumansToMap(people);

for (Map.Entry<String, Human> pair: map.entrySet()){
    System.out.println(pair.getKey() + " - " + pair.getValue());
}
        
    }

    private static HashMap<String,Human> addHumansToMap(String[] people) {
        HashMap<String , Human> allHumans = new HashMap<>();

        for (String person : people) {
            allHumans.put(person, new Human(person));
        }

        return allHumans;
    }
}
