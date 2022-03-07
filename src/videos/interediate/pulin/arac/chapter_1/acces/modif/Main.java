package videos.interediate.pulin.arac.chapter_1.acces.modif;

import videos.interediate.pulin.arac.chapter_2._1design.an.interfaces.TestBigCat;

public class Main extends TestBigCat {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.aForTest);
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
//        System.out.println(cat.id);
//        System.out.println(cat.aForTest);
    }
}
