package videos.telegramic.das6.neo;

public class Example {
    public static void main(String[] args) {
        int a = 10;
        int b = 2580;
        int c = 50;
        int d = 294;
        int e = 2999;

        int max = getMax(a,b);
        System.out.println(max);
        max = getMax(a,b,c);
        System.out.println(max);
        max = getMax(a,b,c,d);
        System.out.println(max);
        max = getMax(a,b,c,d,e);
        System.out.println(max);
    }

    private static int getMax(int a, int b, int c, int d, int e) {
        return getMax(a,getMax(b,c,d,e));
    }

    private static int getMax(int a, int b, int c, int d) {
        return getMax(a,getMax(b,c,d));
    }

    private static int getMax(int a, int b, int c) {
        return getMax(a,getMax(b,c));
    }

    private static int getMax(int a, int b) {
        return a>b?a:b;
    }
}
