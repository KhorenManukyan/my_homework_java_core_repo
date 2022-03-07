package book.shildt.javacore.chapter10.operator_throw_s_finaly;

public class ThrowDemo {
    static void demoProc(){
        try {
            throw new NullPointerException();
        } catch (NullPointerException e){
            System.out.println(1);
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e){
            System.out.println("mainum");
        }
    }
}
