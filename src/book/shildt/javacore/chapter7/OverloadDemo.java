package book.shildt.javacore.chapter7;

public class OverloadDemo {
    void test(){
        System.out.println("empty");
    }
    void test(int a){
        System.out.println("a = " + a);
    }
    void test(int a, int b){
        System.out.println("a = " + a + " b = " + b);
    }
    void test(double a){
        System.out.println("a = " + a);
    }





    public static void main(String[] args) {
        OverloadDemo o = new OverloadDemo();
        o.test();
        o.test(2);
        o.test(3,6);
        o.test(4.5);
    }
}
