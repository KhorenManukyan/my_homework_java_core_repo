package videos.ITVDN.javaEssential.lesson8.exceptions.ex_003;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("obrabotka");
            System.out.println(e.getMessage());
        }
    }
}
