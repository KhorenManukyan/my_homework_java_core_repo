package videos.interediate.pulin.arac.chapter_1.nested.classes.local.classes;

public class Test {
    public void isItFinal() {
        int one = 20;
        int two = one;
        two++;
        int three;
        if ( one == 4) three = 3;
        else three = 4;
        int four = 4;
        class Inner { }
        four = 5;
    }
}
