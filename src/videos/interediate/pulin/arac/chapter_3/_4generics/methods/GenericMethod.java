package videos.interediate.pulin.arac.chapter_3._4generics.methods;

import videos.interediate.pulin.arac.chapter_3._4generics.Crate;

public class GenericMethod {
    public static <T> Crate<T> ship(T t){
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }

    public static <T> void sink(T t){ }

    public static <T> T identity (T t){
        return t;
    }

    
}
