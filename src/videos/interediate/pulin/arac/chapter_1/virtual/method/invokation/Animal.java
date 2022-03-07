package videos.interediate.pulin.arac.chapter_1.virtual.method.invokation;

public abstract class Animal {
    public abstract void feed();
}

class Cow extends Animal {
    @Override
    public void feed() {
        addHay();
    }
    private void addHay() { }
}

class Bird extends Animal{

    @Override
    public void feed() {

    }

    private void addSeed(){

    }
}

class Lion extends Animal{
    @Override
    public void feed() {
        addMeat();
    }

    private void addMeat(){

    }
}