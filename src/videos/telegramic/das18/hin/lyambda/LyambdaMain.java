package videos.telegramic.das18.hin.lyambda;

public class LyambdaMain {
    public static void main(String[] args) {
        Orinak orinak = (x, y) -> x/y;
        System.out.println(orinak.hashvel(8,4));
        Orinak orinak1 = (x, y) -> x>y?x:y;
        switch ((int)orinak1.hashvel(5,10)){
            case 5 -> System.out.println("H");
            case 15 -> System.out.println("T");
            default -> System.out.println("Vayyyyy");
        }
    }
}

interface Orinak{
    public double hashvel(double x, double y);
}
