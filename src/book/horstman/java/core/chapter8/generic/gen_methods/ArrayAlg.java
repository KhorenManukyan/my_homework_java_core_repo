package book.horstman.java.core.chapter8.generic.gen_methods;

public class ArrayAlg {
    public static <T> T getMiddle(T a,T b, T c){
        return a;
    }

    public static void main(String[] args) {
//        String middle = ArrayAlg.<String>getMiddle("John");
        String middle = ArrayAlg.<String>getMiddle("John", "Q.","Public");
        String middle1 = ArrayAlg.getMiddle("John", "Q.","Public");
        Double middle2 = (Double) ArrayAlg.getMiddle(3.14, 1729, 0);
        String middle3 = (String) ArrayAlg.getMiddle ( "Hello", 0, null);
    }
}
