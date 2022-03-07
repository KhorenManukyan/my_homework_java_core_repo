package videos.telegramic.das6.neo;

public class MaxNumWithRecursion {
    public static void main(String[] args) {
        int[] masiv = {2, 34, -64, 32, -69, 45};
        int xMax = getMax(0, masiv[0], masiv);
        System.out.println(xMax);
    }

    private static int getMax(int id, int max, int[] masiv) {
        if (id == masiv.length ){
            return max;
        }

        if (max < masiv[id]){
            max = masiv[id];
        }

        return getMax(++id, max, masiv);
    }
}
