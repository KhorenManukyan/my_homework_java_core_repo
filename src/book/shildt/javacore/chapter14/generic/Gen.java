package book.shildt.javacore.chapter14.generic;

public class Gen<T> {
    T ob;

    public Gen(T ob){
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }

    void setOb(T ob){
        this.ob = ob;
    }

    void showType(){
        System.out.println("Tip T yavalyaetsya: " + ob.getClass().getSimpleName());
    }
}
