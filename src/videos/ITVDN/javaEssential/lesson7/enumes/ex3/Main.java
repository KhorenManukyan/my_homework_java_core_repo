package videos.ITVDN.javaEssential.lesson7.enumes.ex3;

public class Main {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;
        day.setValue(333);

        System.out.println(day+ " " +day.getValue());
    }

}
