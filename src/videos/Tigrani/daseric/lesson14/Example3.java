package videos.Tigrani.daseric.lesson14;

public class Example3 {
     public static void main(String[] args) {
        fibannache(17);
    }


    static void fibannache(int n) {
        int firstN = 0;
        int secondN = 1;
        int result;
        System.out.println(firstN);
        System.out.println(secondN);
        for (int i = 0; i < n; i++) {
            result = firstN + secondN;
            firstN = secondN;
            secondN = result;
            System.out.println(result);
        }
    }
}
