package videos.Tigrani.daseric.lesson18;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String [] textArray = {"a", "b", "c"};
        Integer [] intArray = {7, 8, 9};
        Float [] floatArray = {4.5f, 9.6f, 7.3f};

        Map<User, String > userStringMap = new HashMap<>();

        userStringMap.put(new User(), "test");
        userStringMap.put(new User(), "test");
        userStringMap.put(new User(), "test");
        userStringMap.put(new User(), "test");
        userStringMap.put(new User(), "test");
        userStringMap.put(new User(), "test");
        userStringMap.put(new User(), "test");
        userStringMap.put(new User(), "test");
        userStringMap.put(new User(), "test");

        System.out.println(userStringMap);
    }
}
