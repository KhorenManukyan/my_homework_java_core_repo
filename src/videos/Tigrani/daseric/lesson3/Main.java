package videos.Tigrani.daseric.lesson3;

public class Main {
    public static void main(String[] args) {
        int x = 158499;
        if (x < 0) {
            if (x % 2 == 0) {
                System.out.println("bacasakan zuyga");
            } else {
                System.out.println("bacasakan kenta");
            }
        } else if (x > 0) {
            if (x % 2 == 0) {
                System.out.println("drakan zuyga");
            } else {
                System.out.println("drakan kenta");
            }
        } else {
            System.out.println("zroya");
        }
    }
}
