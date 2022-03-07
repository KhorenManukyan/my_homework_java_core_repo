package book.horstman.java.core.chapter5.inheritance.ex5_1;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

/*    public Employee(String name, double salary, LocalDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }*/

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(hireDay, employee.hireDay);
    }

//    public boolean equals (Object obj){
//        if (this == obj) return true;
//        if (obj == null) return false;
//        if (getClass() != obj.getClass()) return false;
//        Employee other = (Employee) obj;
//        return name.equals(other.name) &&
//                salary == other.salary &&
//                hireDay .equals(other.hireDay);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void riseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }
}























