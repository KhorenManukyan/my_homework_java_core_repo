package videos.telegramic.das4;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
     public static void main(String[] args) {
        Random random = new Random();
        int tiv = random.nextInt(40)+1;
        System.out.println(tiv) ;
        System.out.println(random.nextInt(98)-56);

        int[] mas = new int[50];
        for (int i = 0; i< mas.length; i++){
            mas[i] = random.nextInt(100);

        }
         System.out.println(Arrays.toString(mas));
    }
}
