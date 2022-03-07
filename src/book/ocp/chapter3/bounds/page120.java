package book.ocp.chapter3.bounds;

import java.util.List;

public class page120 {
    public static void main(String[] args) {

    }
}

interface Flyer {
    void fly();
}

class HangGlider implements Flyer{
    @Override
    public void fly() {

    }

    private void anyFlyer(List<Flyer> flyers){}

    private void groupOfFlyers(List<? extends Flyer> flyers){}
}

class Goose implements Flyer{
    @Override
    public void fly() {

    }
}
