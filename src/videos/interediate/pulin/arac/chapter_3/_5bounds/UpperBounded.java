package videos.interediate.pulin.arac.chapter_3._5bounds;

import java.util.ArrayList;
import java.util.List;

public class UpperBounded {
    public static void main(String[] args) {

        ArrayList<? extends Number> list = new ArrayList<Integer>();
        List<? super Bird> birds = new ArrayList<>();
        birds.add(new Sparrow());
        birds.add(new Bird());
    }

    public static long total (List<? extends Number> list){
        long count = 0;
        for(Number number : list){
            count += number.longValue();
        }
        return count;
    }

    static class Sparrow extends Bird{

    }

    static class Bird{

    }
}
