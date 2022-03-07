package videos.interediate.pulin.arac.porcnakan.test.generic;

import java.util.ArrayList;

public class Wildcard {

    public static void main(String[] args) {
        ArrayList<Number> myList = new ArrayList<>();
        myList.add(1.0);
        myList.add(1.1);
        myList.add(1.2);

        printList(myList);
    }
    public static void printList(ArrayList<? super Integer> myList){
        for (Object o: myList){
            System.out.println(o);
        }
    }
}
