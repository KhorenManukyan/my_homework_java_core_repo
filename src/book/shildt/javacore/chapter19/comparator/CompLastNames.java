package book.shildt.javacore.chapter19.comparator;

import java.util.Comparator;

public class CompLastNames implements Comparator<String> {
    public int compare(String a1, String a2){
        int i, j;
        i = a1.lastIndexOf(' ');
        j = a2.lastIndexOf(' ');
        return a1.substring(i).compareToIgnoreCase(a2.substring(j));
    }
}
