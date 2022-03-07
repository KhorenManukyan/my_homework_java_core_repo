package videos.telegramic.das9.neo;

public abstract class Employee extends Mard {
    String salary;
    public Employee(String name, int age) {
        super(name, age);
    }
    public Employee(String name, int age, String salary) {
        super(name, age);
        this.salary = salary;
    }
    public Employee() {
        super("a",4);
    }

    public abstract void work();
}
