package book.horstman.java.core.chapter9.listing9_6;

import java.util.HashMap;
import java.util.Map;

/**
 * This program demonstrates the use of a map with key type String
 * @version 11 2021.05.22
 * @author Khoren
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));

        System.out.println(staff);
        staff.remove("567-24-2546");
        System.out.println(staff);
        staff.put("456-62-5527", new Employee("Francesca Miller"));
        System.out.println(staff);
        System.out.println(staff.get("157-62-7935"));

        staff.forEach((k,v)-> System.out.println(k + " " + v));


    }
}
















