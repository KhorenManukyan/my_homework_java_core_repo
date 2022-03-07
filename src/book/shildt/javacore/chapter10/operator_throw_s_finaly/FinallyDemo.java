package book.shildt.javacore.chapter10.operator_throw_s_finaly;

public class FinallyDemo {
    static void procA(){
        try {
            System.out.println("procA");
            throw new RuntimeException();
        } finally {
            System.out.println("finally procA");
        }
    }
    static void procB() throws IllegalAccessException {
        try {
            System.out.println("procB");
            throw new IllegalAccessException();
        } finally {
            System.out.println("finally procB");
        }
    }
    static void procC(){
        try {
            System.out.println("procC");
//            throw new RuntimeException();
        } finally {
            System.out.println("finally procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e){
            System.out.println("Exception");
        }
        try {
            procB();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        procC();
    }

}
