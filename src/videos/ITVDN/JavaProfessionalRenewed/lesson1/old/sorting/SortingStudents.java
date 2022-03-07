package videos.ITVDN.JavaProfessionalRenewed.lesson1.old.sorting;

import java.util.Arrays;

public class SortingStudents {
    public static void main(String[] args) {
        int[] marks = {7, 8, 9, 3, 0, 11};
        String [] students = {"Yevgeni", "Khoren", "Andrew", "Alex", "Khoren"};

        Arrays.sort(marks);
        Arrays.sort(students);

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        for (String student : students) {
            System.out.print(student + " ");
        }
    }
}
