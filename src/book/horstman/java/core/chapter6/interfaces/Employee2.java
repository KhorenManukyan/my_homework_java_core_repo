package book.horstman.java.core.chapter6.interfaces;

public class Employee2 implements Comparable<Employee2> {
    double salary;

    @Override
    public int compareTo(Employee2 employee2) {
        return Double.compare(salary, employee2.salary);
    }
}
