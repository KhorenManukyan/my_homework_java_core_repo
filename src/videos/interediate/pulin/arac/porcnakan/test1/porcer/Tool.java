package videos.interediate.pulin.arac.porcnakan.test1.porcer;

/*public class Tool {
    void use() { } // r1
}
class Hammer extends Tool {
     void use() { } // r2
    public void bang() { } // r3
}*/

/*
class Tool {
    void use() { } // r1
}
class Hammer extends Tool {
    private void use(String s) { } // r2
    public void bang() { } // r3
}*/

class Tool {
//    default void use() { } // r1
}
class Hammer extends Tool {
    public void use() { } // r2
    public void bang() { } // r3
}