package videos.telegramic.das3;

import java.util.Arrays;

public class ErkchapArray {
    public static void main(String[] args) {
        int [][] er = {
                {6,2,3,4,5},
                {6,7,1,9,10},
                {11,12,13,14,15}

        };


        for (int i = 0; i < er.length; i++) {
            for (int j = 0; j < er[i].length; j++) {
                System.out.print(er[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------");

        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int[] masiv:er){
            for (int tiv:masiv){
                if (tiv>max){
                    count++;
                    max = tiv;
                }
            }
        }
        System.out.println(max);
        System.out.println("________________________________");

        int xmin = 0;
        int xmax = 0;
        for (int i = 0; i < er.length; i++) {
            for (int j = 0; j < er[i].length; j++) {
                int min = er[xmin][xmax];
                if (min>er[i][j]){
                    xmin = i;
                    xmax = j;
                }
            }
        }
        System.out.println(xmin+ " " + xmax);

    }
}

















