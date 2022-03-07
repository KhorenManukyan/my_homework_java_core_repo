package book.shildt.javacore.chapter10.operator_throw_s_finaly;

public class ChainExcDemo {
    static void demoProc() {
        NullPointerException nullPointerException = new NullPointerException("vverxnii uroven");
        nullPointerException.initCause(new ArithmeticException("prichina"));
        throw nullPointerException;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e){
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}
