package videos.Tigrani.daseric.lesson14;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args)  {
        Example1 e = new Example1();
        try {
            System.out.println(Arrays.toString(e.evenArrayFromOneToN(17)));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    int[] evenArrayFromOneToN(int n) throws Exception {
        if(n <= 1){
            throw new Exception("the input number should be natural and greater then 1");
        }

        int[] result = new int[(n+1)/2];

        for (int i = 0; i < result.length; i++){
            result[i] = 1+i*2;
        }
        return result;
    }
}
