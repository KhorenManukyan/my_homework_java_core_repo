package book.shildt.javacore.chapter10.sravnenie;

public class Gen <T>{
    T ob;

    Gen(T ob){
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }
}

class Gen2<T> extends Gen<T>{
    Gen2(T ob){
        super(ob);
    }
}

class HierDemo3{
    public static void main(String[] args) {
        Gen<Integer> integerGen = new Gen<>(88);
        Gen2<Integer> integerGen2 = new Gen2<>(99);
        Gen2<String> stringGen2 = new Gen2<>("Test");
        if (integerGen2 instanceof Gen2<?>){
            System.out.println("Oбъeкт iOb2 является --- Gen2");
        }
        if (integerGen2 instanceof Gen<?>){
            System.out.println("Oбъeкт iOb2 является --- Gen");
        }
        if (stringGen2 instanceof Gen2<?>){
            System.out.println("Oбъeкт iOb2 является --- Gen2");
        }
        if (stringGen2 instanceof Gen<?>){
            System.out.println("Oбъeкт iOb2 является --- Gen");
        }
        if (integerGen instanceof Gen2<?>){
            System.out.println("Oбъeкт iOb2 является --- Gen");
        }
        if (integerGen instanceof Gen<?>){
            System.out.println("Oбъeкт iOb2 является --- Gen");
        }


    }
}

















