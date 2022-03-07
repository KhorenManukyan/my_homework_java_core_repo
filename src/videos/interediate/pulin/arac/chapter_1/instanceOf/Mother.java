package videos.interediate.pulin.arac.chapter_1.instanceOf;

public interface Mother {
}
class Hippo extends HeavyAnimal implements Mother { }

class Main2{
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        boolean b6 = hippo instanceof Mother;
        System.out.println(b6);
    }
}