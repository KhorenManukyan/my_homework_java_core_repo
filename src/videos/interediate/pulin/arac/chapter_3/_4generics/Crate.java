package videos.interediate.pulin.arac.chapter_3._4generics;

public class Crate<T>{
    private T contents;
    public T emptyCrate(){
        return contents;
    }

    public void packCrate(T contents){
        this.contents = contents;
    }
}
