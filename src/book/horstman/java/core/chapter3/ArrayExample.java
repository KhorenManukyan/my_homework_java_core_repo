package book.horstman.java.core.chapter3;

public class ArrayExample {
    public static void main(String[] args) {
//        int [] v = new int[10];
//        String [] a = new String[10];
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i] = "1");
//        }

        if (args.length == 0 || args[0].equals("-h"))
            System.out.print("Hello,");
        else if (args[0].equals("-g"))
            System.out.print("Goodbye,");
// print the other command-line arguments
        for (int i = 1; i < args.length; i++)
            System.out.print(" " + args[i]);
        System.out.println("!");

    }
}
