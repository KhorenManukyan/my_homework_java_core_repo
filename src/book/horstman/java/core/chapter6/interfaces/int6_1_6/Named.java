package book.horstman.java.core.chapter6.interfaces.int6_1_6;

public interface Named {
    default String getName(){
        return getClass().getName() + " " + hashCode();
    }
}
