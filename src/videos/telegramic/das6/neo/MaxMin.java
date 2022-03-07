package videos.telegramic.das6.neo;

public class MaxMin {
    public static void main(String[] args) {
        int[] tver = {1, 2, 3, 82, 97, 10};
        int[] tver2 = {1, 2, 3, 82, 97, 108};
        int max = tver[0];
        for (int j : tver) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(max);

        max = tver2[0];
        for (int j : tver2) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
