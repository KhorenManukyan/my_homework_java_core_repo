package book.shildt.javacore.chapter19.comparator;

import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String> {
    public int compare(String a1, String a2){
        int i,j;
        return a1.compareToIgnoreCase(a2);
    }
}
