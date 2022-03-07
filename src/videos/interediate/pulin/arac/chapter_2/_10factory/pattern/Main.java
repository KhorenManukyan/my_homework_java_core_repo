package videos.interediate.pulin.arac.chapter_2._10factory.pattern;

public class Main {
    public static void main(String[] args) {
//        final Food food = new Fish(1);
        final Food food = FoodFactory.getFood("zebra");
        food.consumed();
    }
}
