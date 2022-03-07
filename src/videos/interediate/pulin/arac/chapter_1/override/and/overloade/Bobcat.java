package videos.interediate.pulin.arac.chapter_1.override.and.overloade;

public class Bobcat {
    public void findDen(){ }
}

class BobcatKitten extends Bobcat{
    // Override
    @Override
    public void findDen(){ }
    // Overload
    public void findDen(boolean b){ }
    public void findDen(boolean b, int a){ }
    public void findDen(int a, boolean b){ }
    // simple method
    public int findden() throws Exception{ return 0; }
}
