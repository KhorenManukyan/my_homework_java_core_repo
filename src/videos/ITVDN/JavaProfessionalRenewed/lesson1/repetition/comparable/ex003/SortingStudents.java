package videos.ITVDN.JavaProfessionalRenewed.lesson1.repetition.comparable.ex003;

import java.util.Arrays;

public class SortingStudents {
    public static void main(String[] args) {
        int[] marks = {1,57,3,7,12,5};
        String [] students = {"bbbbb","111", "qqq","Alex", "aaaa",  "fffff"};
        Arrays.sort(marks);
        Arrays.sort(students);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
    }
}
