package book.shildt.javacore.chapter8.override.method;

public class Binheritance extends Ainheritance {
    int k;

    Binheritance(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

//    @Override
//    void show() {
//        super.show();
//        System.out.println(k);
//    }

    void showAA(String s){
        super.showAA();
        System.out.println(s);
        System.out.println(i + " " + j);
    }
}
