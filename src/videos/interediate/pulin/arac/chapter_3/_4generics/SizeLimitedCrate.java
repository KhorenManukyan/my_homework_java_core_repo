package videos.interediate.pulin.arac.chapter_3._4generics;

public class SizeLimitedCrate <T, U>{
    private T contents;
    private U sizeLimit;
    public SizeLimitedCrate(T contents, U sizeLimit){
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }
}
