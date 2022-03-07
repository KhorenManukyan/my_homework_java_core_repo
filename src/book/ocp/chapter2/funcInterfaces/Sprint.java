package book.ocp.chapter2.funcInterfaces;

import videos.interediate.pulin.arac.chapter_2._2purpose.of.an.Kangaroo;

@FunctionalInterface
public interface Sprint {
    public void sprint(Animal animal);
    default void sasa(){};
    static int aaa(){
        return 1;
    }
}

class Tiger implements Sprint{

    @Override
    public void sprint(Animal animal) {
        System.out.println("Animal is sprinting fast! " + animal.toString());
    }

    @Override
    public void sasa() {
        Sprint.super.sasa();
    }
}

@FunctionalInterface
interface Run extends Sprint{}

@FunctionalInterface
interface SprintFaster extends Sprint{
    public void sprint(Animal animal);
}

@FunctionalInterface
interface Skip extends Sprint{
    public default int getHopCount(Kangaroo kangaroo) {return 10;}
    public static void skip(int speed) {}
}

//@FunctionalInterface
//abstract class Ec implements Sprint{}


