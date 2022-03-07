package videos.interediate.pulin.arac.chapter_4.test4;

import java.util.function.*;

class Tourist {
    public Tourist(double distance) {
        this.distance = distance;
    }

    public double distance;
}

public class Lifeguard {
    private void saveLife(Predicate<Tourist> canSave, Tourist
            tourist) {
        System.out.print(canSave.test(tourist) ? "Saved" : "Toofar"); // y1
    }

    public final static void main(String... sand) {
        new Lifeguard().saveLife(s -> s.distance < 4, new
                Tourist(2)); // y2
    }
}
