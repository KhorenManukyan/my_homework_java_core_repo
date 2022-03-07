package videos.ITVDN.javaEssential.lesson8.examples;

public class StackTr {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        method2();
    }
    public static void method2(){
//        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        method3();
    }
    public static void method3(){
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        for (StackTraceElement temp: st){
            System.out.println(temp.getMethodName());
        }
    }
}
