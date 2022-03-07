package videos.telegramic.das2;

public class ArrayWhile {
    public static void main(String[] args) {
        int[] masiv = {10, 15, 10, 15, 0};
        int[][] erkmassiv = {
                {1, 2, 3},
                {2},
                {1, 2, 3, 5, 4, 7, 8}
        };
        int s = 0;
        int j = 0;
        while (s< erkmassiv.length){
            j = 0;
            while (j< erkmassiv[s].length){
                System.out.print(erkmassiv[s][j]);
                j++;
            }
            System.out.println();
            s++;
        }

/*        System.out.println(erkmassiv[2][2]);
        int i = 0;
        while (i< masiv.length){
            System.out.println(masiv[i]);
            ++i;
        }*/

        int i = 0;
        int tiv = 0;
        int newValue = 0;
        while (i < masiv.length) {
            tiv = masiv[i];
            newValue += tiv;
            i++;
        }
        System.out.println(newValue);
        System.out.println(i);

        int a = 3;
        int count = 0;
        i = 0;
        while (i < masiv.length) {
            if (masiv[i] % a == 0) {
                count += masiv[i];
            }
            i++;
        }
        System.out.println(count);
        i = 0;

        for (int[] arr: erkmassiv){
            for (int mass: arr){
                System.out.print(mass + " ");
            }
            System.out.println();
        }
    }
}
