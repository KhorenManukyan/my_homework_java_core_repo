package book.horstman.java.core.chapter6.interfaces.clonable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("John Q. Public", 50000);
        original.setHireDay(2000,1,1);
        Employee copy = original.clone();
        copy.riseSalary(10);
        copy.setHireDay(2002,12,31);
        System.out.println("original = " + original);
        System.out.println("copy = " + copy);

    }
}
