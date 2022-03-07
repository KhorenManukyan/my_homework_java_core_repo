package book.ocp.chapter3.generic;

import java.util.ArrayList;
import java.util.List;

public class page109 {
    static void printNames(List list){
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i);
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
//        List names = new ArrayList();
        List<String> names = new ArrayList();
//        names.add(new StringBuilder("Webby"));
        names.add(new String("Webby"));
        printNames(names);
    }
}
