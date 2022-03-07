package book.horstman.java.core.chapter6.interfaces;

public class Employee1 implements Comparable{
    int salary;
    @Override
    public int compareTo(Object o) {
        Employee1 employee1 = (Employee1) o;
        return Integer.compare(salary, employee1.salary);
    }
}
