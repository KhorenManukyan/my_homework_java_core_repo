package book.horstman.java.core.chapter9.listing9_6;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " name is " + name;
    }
}
