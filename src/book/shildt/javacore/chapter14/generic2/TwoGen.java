package book.shildt.javacore.chapter14.generic2;

public class TwoGen <T, V>{
    T ob1;
    V ob2;

    TwoGen(T ob1, V ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showTypes(){
        System.out.println("Tип Т: "+ ob1.getClass().getName());
        System.out.println("Tип Т: "+ ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }
}
