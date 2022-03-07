package book.ocp.examples;

public class Main {

    static void foo(Animal animal){
        animal.move();
    }
    public static void main(String[] args) {
        foo(new Dog());

//        System.out.println(pow(16, 4));



        Main m1 = new Main();
        Main m2 = new Main();
        boolean b = m1 instanceof Main;
        System.out.println(b);

    }
  /*  {
        System.out.println(1);
        {
            System.out.println(2);

            {
                System.out.println(3);


            }
        }
    }

    static {
        System.out.println("S1");
        {
            System.out.println("S2");

            {
                System.out.println("S3");


            }
        }
    }
    public videos.telegramic.Main(){
        System.out.println("K1");
        {
            System.out.println("K2");

            {
                System.out.println("K3");


            }
        }
    }

    public static void main(String[] args) {
        videos.telegramic.Main main = new videos.telegramic.Main();

        {
            System.out.println("M1");
        }
        *//*float a = 0.0f;
        long b = 1999999999777777779l;

        a = b;
        System.out.println(a);*//*

        System.out.println("videos.telegramic.Main");
    }*/
}
