package book.shildt.javacore.chapter19.comparator;

import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        ts.add("C");
        ts.add("A") ;
        ts.add("B") ;
        ts.add("E") ;
        ts.add("F") ;
        ts.add("D") ;
        for (String t : ts) {
            System.out.print(t + " ");
        }
    }
}
