package videos.interediate.pulin.arac.chapter_2.test2;
class Forecast {
    public enum Snow { BLIZZARD, SQUALL, FLURRY }
    public static void main(String[] modelData) {
        System.out.print(Snow.BLIZZARD.ordinal());
        System.out.print(" "+Snow.valueOf("flurry".toUpperCase()).name());
    }
}

public class Example2 {
    String hello;

}
