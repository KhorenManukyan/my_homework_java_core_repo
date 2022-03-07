package videos.interediate.pulin.arac.chapter_1.enumes;

public enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b){
        System.out.println("constructing");
    }
}
