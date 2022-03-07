package videos.ITVDN.JavaProfessionalRenewed.lesson1.kod;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SimpleComparableStudent[] myStudents = {
                new SimpleComparableStudent("Yevgeni", 333),
                new SimpleComparableStudent("Andrew", 222),
                new SimpleComparableStudent("Igr", 111),
                new SimpleComparableStudent("Peter", 300),
        };

        Arrays.sort(myStudents);

        for (SimpleComparableStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }

    }
}
