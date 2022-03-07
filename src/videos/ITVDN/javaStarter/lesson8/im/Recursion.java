package videos.ITVDN.javaStarter.lesson8.im;

public class Recursion {
    public static void main(String[] args) {
        recursion(5);
    }

    static void recursion(int counter) {
        counter--;
        System.out.println("A " + counter);
        if (counter != 0)
            recursion(counter);

        System.out.println(counter);
    }
}
