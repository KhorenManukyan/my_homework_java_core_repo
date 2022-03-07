package videos.interediate.pulin.arac.porcnakan.test.lyambda.stream;

@FunctionalInterface
public interface Runnable {
    boolean run(int a , int b);

    default void run2() {

    }

    static void fn() {

    }

    private int a() {
        return 9;
    }
}

class Test {
    public static void main(String[] args) {
        Runnable ref = (a,b) -> {
            if (a>b){
                System.out.println(a);
            } else {
                System.out.println(b);
            }
            return false;
        };

        ref.run(7,4);
    }
}
