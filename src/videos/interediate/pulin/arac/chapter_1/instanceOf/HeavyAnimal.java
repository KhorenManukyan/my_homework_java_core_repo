package videos.interediate.pulin.arac.chapter_1.instanceOf;

public class HeavyAnimal {
}
//
//class Hippo extends HeavyAnimal {
//}

class Elephant extends HeavyAnimal {
}

class Main {
    public static void main(String[] args) {
//        HeavyAnimal hippo = new Hippo();
//        boolean b1 = hippo instanceof Hippo;
//        boolean b2 = hippo instanceof HeavyAnimal;
//        boolean b3 = hippo instanceof Elephant;

        HeavyAnimal hippo = new Hippo();
        boolean b4 = hippo instanceof Object;
        Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object;

//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);

        System.out.println(b4);
        System.out.println(b5);

/*        Hippo anotherHippo = new Hippo();
        boolean b9 = anotherHippo instanceof Elephant;
        System.out.println(b9);*/

    }
}

