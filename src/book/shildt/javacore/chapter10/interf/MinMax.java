package book.shildt.javacore.chapter10.interf;

public interface MinMax <T extends Comparable<T>>{
    T min();
    T max();
}
