package videos.ITVDN.JavaProfessionalRenewed.lesson1.kod;

public class SimpleComparableStudent implements Comparable<SimpleComparableStudent>{
    private String firstName;
    private int group;

    public SimpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }



    @Override
    public String toString(){
        return firstName + " " + group;
    }

    @Override
    public int compareTo(SimpleComparableStudent o) {
//        return group - o.group;
        return o.firstName.compareTo(firstName);
    }
}
