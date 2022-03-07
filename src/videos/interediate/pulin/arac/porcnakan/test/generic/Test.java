package videos.interediate.pulin.arac.porcnakan.test.generic;

import java.util.ArrayList;

public class Test {
    public static void addName(Object obj){
        String str = (String) obj;

        ArrayList myList = new ArrayList();
        myList.add(str);
        str = "a";
        str = "v";
    }
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Karen");
        myList.add("Khoren");
        myList.add("Karine");
//        myList.add(65);

        myList.stream().filter(c->!c.equals("Khoren")).forEach(System.out::println);

        for (String a : myList){
//            System.out.println(a);
        }
    }
}
