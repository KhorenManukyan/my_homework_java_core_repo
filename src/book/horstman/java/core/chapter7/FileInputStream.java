package book.horstman.java.core.chapter7;

import java.io.FileNotFoundException;

public class FileInputStream extends Throwable{
    private String name;
    public FileInputStream(String name) throws NullPointerException {
        this.name = name;
        throw new NullPointerException();
    }
}
