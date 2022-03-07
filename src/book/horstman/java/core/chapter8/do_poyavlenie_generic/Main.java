package book.horstman.java.core.chapter8.do_poyavlenie_generic;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ArrayList files = new ArrayList();
        String filename= (String) files.get(0);
        Integer fileint = (Integer) files.get(1);
        files.add(1);
        files.add(new File(" "));

    }
}
