package book.shildt.javacore.chapter10.neob.iskl;

public class Exc1 {
    public static void subroutine(){
        try {
            int d = 0;
            int a = 10 / d;
        } catch (ArithmeticException e){
            System.out.println("chi kareli bajanel 0i");
        }
    }
    public static void main(String[] args) {
        Exc1.subroutine();
    }
}
