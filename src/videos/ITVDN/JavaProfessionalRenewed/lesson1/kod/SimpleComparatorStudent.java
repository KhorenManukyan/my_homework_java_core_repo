package videos.ITVDN.JavaProfessionalRenewed.lesson1.kod;

import java.util.Arrays;
import java.util.Comparator;

public class SimpleComparatorStudent{
    private String firstName;
    private int group;

    public SimpleComparatorStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + " " + group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    /*    @Override
    public int compareTo(Object o) {
        if (this.group > ((SimpleComparableStudent)o).group) {
            return 1;
        } else if (this.group < ((SimpleComparableStudent) o).group) {
            return -1;
        } else {
            return 0;
        }
    }*/


}

class SimpleComStudent implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String firstName1 = ((SimpleComparatorStudent)o1).getFirstName();
        String firstName2 = ((SimpleComparatorStudent)o2).getFirstName();
        return firstName1.compareTo(firstName2);
    }
}

class Main4 {
    public static void main(String[] args) {
        SimpleComparatorStudent[] myStudents = {
                new SimpleComparatorStudent("Yevgeni", 333),
                new SimpleComparatorStudent("Andrew", 222),
                new SimpleComparatorStudent("Igr", 111),
                new SimpleComparatorStudent("Peter", 300),
        };

        Arrays.sort(myStudents, new SimpleComStudent());

        for (SimpleComparatorStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }
    }
}
