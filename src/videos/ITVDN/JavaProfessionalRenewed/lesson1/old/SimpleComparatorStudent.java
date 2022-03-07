package videos.ITVDN.JavaProfessionalRenewed.lesson1.old;

import java.util.Arrays;

public class SimpleComparatorStudent implements Comparable {
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


    @Override
    public int compareTo(Object o) {
        if (this.group > ((SimpleComparatorStudent)o).group) {
            return 1;
        } else if (this.group < ((SimpleComparatorStudent) o).group) {
            return -1;
        } else {
            return 0;
        }
    }

}

class Main {
    public static void main(String[] args) {
        SimpleComparatorStudent[] myStudents = {
                new SimpleComparatorStudent("Yevgeni", 333),
                new SimpleComparatorStudent("Andrew", 222),
                new SimpleComparatorStudent("Igr", 111),
                new SimpleComparatorStudent("Peter", 300),
        };

        Arrays.sort(myStudents);

        for (SimpleComparatorStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }
    }
}





















