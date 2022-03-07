package videos.ITVDN.javaEssential.lesson7.enumes.ex2;

public class Main {
    public static void main(String[] args) {
        Day today = Day.SATURDAY;
        switch (today){
            case MONDAY:
                System.out.println("Mon");
                break;
            case TUESDAY:
                System.out.println("Tues");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            default:
                System.out.println("chka, esor " + today);
        }
    }
}
