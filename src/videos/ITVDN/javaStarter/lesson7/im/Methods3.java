package videos.ITVDN.javaStarter.lesson7.im;

public class Methods3 {
    public static void main(String[] args) {
        int num1 = 2, num2 = 2;
        String result = compare(num1,num2);
        System.out.println(result);
    }

    private static String compare(int i, int i1) {
        String returnValue;
        if (i < i1){
            returnValue = "i poqra i1";
        } else if (i > i1){
            returnValue = "i meca i1";
        } else {
            returnValue = " i equal i1";
        }
        return returnValue;
    }
}
