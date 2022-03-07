package videos.Tigrani.daseric.lesson14;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(firstNum);
        System.out.println(secondNum);
        fibanace(17);
    }
    static int firstNum = 0;
    static int secondNum = 1;
    static int result;
    static void fibanace(int n){
        if (n>0){
            result = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = result;
            n--;
            System.out.println(result);
            fibanace(n);
        }

    }
}
