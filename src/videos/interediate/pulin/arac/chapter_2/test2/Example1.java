package videos.interediate.pulin.arac.chapter_2.test2;

enum DaysOff {
    Thanksgiving, PresidentsDay, ValentinesDay
}

class Vacation {
    public static void main(String... unused) {
        final DaysOff input = DaysOff.Thanksgiving;
        switch (input) {
            default:
            case ValentinesDay:
                System.out.print("1");
            case PresidentsDay:
                System.out.print("2");
        }
    }
}

public class Example1 {

}
