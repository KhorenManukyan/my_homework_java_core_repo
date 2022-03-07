package videos.interediate.pulin.arac.chapter_1.staticc.finall.importt;

//import videos.videos.chapter_2.*;
//import videos.videos.chapter_2._1design.an.interfaces.TestBigCat;

import videos.interediate.pulin.arac.chapter_2._1design.an.interfaces.TestBigCat;

public abstract class Cat {
    final static String name = "The Cat";
    void clean() { }
}
class Lion extends Cat {
    public static void main(String[] args) {
//        Lion.name = "aaa";

        TestBigCat bigCat = new TestBigCat();
        System.out.println(bigCat.b);
        System.out.println(Lion.name);
    }
    @Override
    void clean() { }
}
