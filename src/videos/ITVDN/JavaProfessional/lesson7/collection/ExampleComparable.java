package videos.ITVDN.JavaProfessional.lesson7.collection;

public class ExampleComparable implements Comparable {
    String firstName, lastName;
    int studentId = 0;
    double GPA = 0.0;

    @Override
    public int compareTo(Object o) {
        double f = GPA - ((ExampleComparable)o).GPA;
        if (f == 0.0){
            return 0;
        } else if (f<0.0){
            return -1;
        } else return 1;
    }
}
