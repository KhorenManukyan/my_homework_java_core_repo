package videos.interediate.pulin.arac.chapter_3._7comparator.comporavle;

public class LegacyDuck implements java.lang.Comparable {
    private String name;
    @Override
    public int compareTo(Object o) {
        LegacyDuck d = (LegacyDuck) o;
        return name.compareTo(d.name);
    }
}
