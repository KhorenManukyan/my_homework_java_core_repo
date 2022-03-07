package videos.ITVDN.javaEssential.lesson8.exceptions.ex_007;

public class Main {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            System.out.println("Porc bajanel 0 i");
            System.out.println(a/(n - 2));
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("fi");
        }
    }
}
