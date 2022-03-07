package videos.telegramic.das3;

public class Main {
    public static void main(String[] args) {
        int[] g = {5, 7, 948, 484, 16};
        tvyal:
        for (int l = 5; l < 7; l++) {
            massivLoop:
            for (int tiv : g) {
                for (int i = 1; i < 33; i++) {
                    System.out.println(i);
                    if (i % 9 == 0) {
                        break tvyal;
                    }
                    if (i%5==0){
                        continue tvyal;
                    }
                    System.out.println(l);
                }
            }
        }
    }
}
