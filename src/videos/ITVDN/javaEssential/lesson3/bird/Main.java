package videos.ITVDN.javaEssential.lesson3.bird;

public class Main {
    public static void main(String[] args) {
        Bird s = new Strauss();
        Bird p = new Penguin();
        Bird f = new Swallow();

        Bird[] arr = {s, p, f};
        for (Bird temp: arr){
            temp.move();
        }
    }
}
