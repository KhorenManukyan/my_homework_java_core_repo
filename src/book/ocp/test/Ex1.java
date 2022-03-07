package book.ocp.test;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<String> rug = new ArrayList<>();
        rug.add("circle");
        rug.add("square");
        System.out.println(rug);
        System.out.println(rug.toString());
    }
}
