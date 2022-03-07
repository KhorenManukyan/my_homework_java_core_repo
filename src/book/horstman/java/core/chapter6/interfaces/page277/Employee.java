package book.horstman.java.core.chapter6.interfaces.page277;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void riseSalary(double byPercent){
        double rise = salary * byPercent/100;
        salary += rise;
    }

    public int compareTo(Employee employee){
        return Double.compare(salary, employee.salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}
