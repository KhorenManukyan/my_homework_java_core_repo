package videos.ITVDN.javaEssential.lesson10.withGen;

public class Main {
    public static void main(String[] args) {
        WithGen<Integer> withGen1= new WithGen<>(50);
        WithGen<String> withGen2= new WithGen<>("Test");
        WithGen<String> withGen5= new WithGen<>("Test");
        WithGen<Cat> withGen3= new WithGen<>(new Cat("Bob"));
withGen2 = withGen5;
        withGen1.display();
        withGen2.display();
        withGen3.display();
    }
}
