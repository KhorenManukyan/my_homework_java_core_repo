package book.shildt.javacore.chapter9.interfaces;

public class AIntfClass {
    interface NestedIf{
        boolean isNotNegative(int x);
    }
}

class BIntfClass implements AIntfClass.NestedIf{

    @Override
    public boolean isNotNegative(int x) {
        return x < 0?false:true;
    }
}
