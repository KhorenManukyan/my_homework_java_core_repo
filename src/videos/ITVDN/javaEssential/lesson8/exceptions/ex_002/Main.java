package videos.ITVDN.javaEssential.lesson8.exceptions.ex_002;

public class Main {
    public static void main(String[] args) {
        Exception ex = new Exception("My exception");
        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("Obrabotka exception");
            System.out.println(e.getMessage());
        }
    }
}
