package book.shildt.javacore.chapter10.construct;

public class GenCons {
    private double val;
    private double b;
    private double a;

    <T extends Number> GenCons(T arg){
        val = arg.doubleValue();
    }

    <K, B> GenCons(K a, B b){
        this.a = (double) a;
        this.b = (double) b;
        System.out.println(((double) a + (double) b));
    }

    public double getB() {
        return b;
    }
    public double getA() {
        return a;
    }

    void showVal(){
        System.out.println("val: " + val);
    }
}

class ConsDemo{
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5f);
        GenCons test3 = new GenCons(4.0,5.0);


        test.showVal();
        test2.showVal();
        test3.showVal();
        System.out.println(test3.getA());
        System.out.println(test3.getB());
    }
}
