package videos.interediate.pulin.arac.chapter_2._4implementing.polimorphism;

public interface LivesInOcean {
    public void makeSound();
}

class Dolphin implements LivesInOcean{
    @Override
    public void makeSound() {
        System.out.println("whistle");
    }
}

class Whale implements LivesInOcean{
    @Override
    public void makeSound() {
        System.out.println("sing");
    }
}

class Oceanographer{
    public void checkSound(LivesInOcean animal){
        animal.makeSound();
    }
    public static void main(String[] args) {
        Oceanographer o = new Oceanographer();
        o.checkSound(new Dolphin());
        o.checkSound(new Whale());
    }
}
