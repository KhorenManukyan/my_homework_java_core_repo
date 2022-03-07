package videos.telegramic.das5;

public class Main {
    public static void main(String[] args) {
        arjeq();
    }
    static void arjeq(){
        System.out.println(a(1, 2));
        System.out.println(a(1, 24,3,3,5));
    }

    static int a(int sum1, int sum2) {
        int sum = sum1 + sum2;
        return sum;
    }

    static int a(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    static int a(int sum1, int sum2, int sum3) {
        int sum = sum1 + sum2 + sum3;
        return sum;
    }


}
