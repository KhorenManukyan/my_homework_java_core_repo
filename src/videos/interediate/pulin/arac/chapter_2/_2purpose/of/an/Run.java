package videos.interediate.pulin.arac.chapter_2._2purpose.of.an;

import videos.interediate.pulin.arac.chapter_2._1design.an.interfaces1.Sprint;

public interface Run extends Sprint {
}

interface SprintFaster extends Sprint {
    public void sprint(Animal animal);
}

interface Skip extends Sprint {
    public default int getHopCount(Kangaroo kangaroo) {
        return 10;
    }

    public static void skip(int speed) {
    }
}
