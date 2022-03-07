package videos.interediate.pulin.arac.chapter_1.nested.classes.stattic.nested.classes;

public class Enclosing {
    static class Nested{
        private int price = 6;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}
