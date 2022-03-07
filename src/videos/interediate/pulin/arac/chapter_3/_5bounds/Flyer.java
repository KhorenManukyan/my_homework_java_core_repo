package videos.interediate.pulin.arac.chapter_3._5bounds;

import java.util.List;

public interface Flyer {
    void fly();
}

class HangGlider implements Flyer{
    @Override
    public void fly() {

    }
}

class Goose implements Flyer{
    @Override
    public void fly() {

    }

    private void anyFlyer(List<Flyer> flyer){}
    private void groupOfFlyers(List<? extends Flyer> flyer){}
}
