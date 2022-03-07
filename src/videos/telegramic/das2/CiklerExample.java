package videos.telegramic.das2;

import java.util.Arrays;

public class CiklerExample {
    public static void main(String[] args) {
        String x = "Das sovori !!!";
        int angam = 10;

        while (angam > 0) {
//            System.out.println(angam + " - " + x);
            angam--;
        }
//        System.out.println("------------------------------");

/*        while (x.length() > 5) {
            x = x.substring(1);
//            System.out.println(x);
        }*/

        String[] masiv0 = x.split(" ");
        int index = 0;
        while (index < masiv0.length) {
//            System.out.println(masiv0[index]);
            index++;
        }
//        System.out.println(index);

        int[] tverimasiv = {1, 2, 3, 7, 8};
        int ind = 0;
        while (ind < tverimasiv.length) {
//            System.out.print(tverimasiv[ind] + " ");
            ind++;
        }

//        System.out.println(ind);

        do {
//            System.out.println("vaa");
        } while (false);

        for (int i = 0; i < tverimasiv.length; i++) {
//            System.out.print(tverimasiv[i] + " ");
        }

        for (int tiv: tverimasiv) {
//            System.out.print(tiv);
        }

        String xx = "asadjfhhgahgkljdhakdj";
        char[] c = xx.toCharArray();
        for (char saf: c) {
//            System.out.println(saf);
        }


    }
}



















