package videos.telegramic.das6.neo;

public class RecurcMethod {
    public static void main(String[] args) {
        int minchev = 5;
        int gumar = hashvich(minchev);
        System.out.println(gumar);
    }

    private static int hashvich(int minchev) {
        System.out.println(" huma minch = " + minchev);
        return minchev == 0?minchev:minchev + hashvich(minchev-1);
    }
}
