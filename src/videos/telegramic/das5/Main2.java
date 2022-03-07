package videos.telegramic.das5;

public class Main2 {
    public static void main(String[] args) {
        arjeq();
    }

    private static void arjeq() {
        System.out.println(methRecurce(3));
    }


    private static int methRecurce(int num) {
        return num != 1 ? num + methRecurce(num - 1):1;
    }
}
