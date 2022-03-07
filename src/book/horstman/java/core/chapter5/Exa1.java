package book.horstman.java.core.chapter5;

public class Exa1 extends Exa{
    int f;
    Exa1(int a, int b, int f){
        super(a,b);
        this.f = f;
    }

    public Exa1(int a, int f) {
        super(a);
        this.f = f;
    }
}
