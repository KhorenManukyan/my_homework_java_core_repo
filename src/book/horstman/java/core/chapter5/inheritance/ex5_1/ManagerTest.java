package book.horstman.java.core.chapter5.inheritance.ex5_1;

/**
 * В этой программе демонстрируется наследование
 *
 * @author Khoren
 * @version 11 2021-04-03
 */
public class ManagerTest {

    public static void main(String[] args) {
        Employee employee = new Employee("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 5000, 1989,10,1);
        staff[2] = new Employee("Tommy Tester", 4000, 1990,3,15);

        for (Employee e: staff){
            System.out.println("narne=" + e. getName ()
                    + ",salary=" + e.getSalary());
        }
        System.out.println(boss instanceof Manager);
        System.out.println(boss.equals(employee));
        System.out.println(System.out);
    }

}
