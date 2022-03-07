package videos.telegramic.das6.neo;

public class MaxValueMethodVarargs {
    public static void main(String[] args) {
        System.out.println(getMax(12, 47, 45, 81, 58));
        System.out.println(getMax());
    }

    private static int getMax(int... masivik) {
        if (masivik.length < 1) {
            return Integer.MIN_VALUE;
        }
        int max = masivik[0];
        for (int tiv : masivik) {
            if (max < tiv) {
                max = tiv;
            }
        }
        return max;
    }
}
