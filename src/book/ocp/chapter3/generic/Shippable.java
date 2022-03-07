package book.ocp.chapter3.generic;

import videos.interediate.pulin.arac.chapter_3._4generics.Robot;

public interface Shippable <T>{
    void ship(T t);
}

class ShippableRobotCrate implements Shippable<Robot>{
    @Override
    public void ship(Robot robot) {

    }

    public static <T> T identity(T t){
        return t;
    }

    public static <T> void sink(T t){}
}

class ShippableAbstractCrate<U> implements Shippable<U>{
    @Override
    public void ship(U u) {

    }
}
