package videos.interediate.pulin.arac.chapter_2._1design.an.interfaces;

public interface Fly {
    public int getWingSpan() throws Exception;

    public static final int MAX_SPEED = 100;

    public default void land() {
        System.out.println("Animal1 is landing");
    }

    public static double colculateSpeed(float distance, double time) {
        return distance / time;
    }
}

