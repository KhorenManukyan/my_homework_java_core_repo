package videos.interediate.pulin.arac.chapter_1.abstractt.classs;

public abstract class Cat {
    int v = 33;
    abstract void clean(String v);
}

abstract class Lion extends Cat{
    abstract void color();
    void sound(){
        System.out.println("lion");
    }
}

class Pantera extends  Lion{

    @Override
    void color() {
        System.out.println("color");
    }


    @Override
    void clean(String  v) {
        System.out.println("color "+ v);
    }
}

class Main{
    public static void main(String[] args) {
//        Cat cat = new Cat()
        Lion cat = new Pantera();


        Pantera p = new Pantera();
        p.clean("White");
        p.color();
        p.sound();
        cat.sound();


    }
}
