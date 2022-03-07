package book.shildt.javacore.chapter14.generic1;

public class NonGen {
    Object ob;

    NonGen(Object ob){
        this.ob = ob;
    }

    Object getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Oбъeкт оЬ относится к типу " + ob.getClass() .getName());
    }
}
