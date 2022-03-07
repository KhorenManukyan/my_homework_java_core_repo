package book.shildt.javacore.chapter10.bazovie.tipi;

public class Gen <T>{
    T ob;

    Gen(T ob){
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }
}

class RawDemo{
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);
        Gen<String > strob = new Gen<>("Test");
        Gen raw = new Gen(new Double(98.6));
        double d = (double) raw.getOb();
        System.out.println(d);
        int i = (int) raw.getOb();
        System.out.println(i);
    }
}
