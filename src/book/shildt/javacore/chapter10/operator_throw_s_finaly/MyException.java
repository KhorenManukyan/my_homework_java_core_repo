package book.shildt.javacore.chapter10.operator_throw_s_finaly;

public class MyException extends Exception {
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    public String toString() {
        return "My Ex detail ";
    }
}

class ExceptionDemo {

    public static void compute(int a) throws MyException {
        System.out.println("vizvan method compute");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("normalnoe zavershenie");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
