package videos.ITVDN.javaStarter.lesson4.im;

public class Ternary {
    public static void main(String[] args) {
/*        int a = 7, b = 3, max ;
        max = (a<b) ? a : b;
        System.out.println((a < b) ? a : b);
        System.out.println(max);*/

/*
        int a = 3, b = 5, d = -7, max;
        max = (b < a) ? (a = b) : (d = a);
        System.out.println(max);
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        */
/*
        int a = 4;
        double b = 5.6;
        int max;
        max = (a<b)?a: (int) b;
        System.out.println(max);
        */


        double quantity = 10;
        double price = 100;
        double discount = 0.75;
        double count ;

        count = quantity>10?quantity*price*discount:quantity*price;
        System.out.println(count);

    }
}
