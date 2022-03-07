package book.horstman.java.core.chapter6.interfaces.page277;

import book.horstman.java.core.chapter5.kod.Manager;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Топу Tester", 38000);

        Comparable<Employee> comparable = new Employee("Harry Hacker", 35000);
        if (comparable instanceof Manager){
            System.out.println("11111111");
        } else {
            System.out.println("000000000000");
        }
        Arrays.sort(staff);

        for (Employee employee : staff) {
            System.out.println("name = " + employee.getName() + ", salary = " + employee.getSalary());
        }
    }
}
