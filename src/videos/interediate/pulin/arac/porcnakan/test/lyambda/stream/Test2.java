package videos.interediate.pulin.arac.porcnakan.test.lyambda.stream;

public class Test2 {
    public void fnOfTest(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Test2 tt = new Test2();
        Runnable1 run = tt::fnOfTest;
        run.fnRunnable("HHHHH");
    }

}
