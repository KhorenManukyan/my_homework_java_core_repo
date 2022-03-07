package book.shildt.javacore.chapter15.methodReferance.page478;

public class MyStringOps {

    static String strReverse(String str){
        String result = "";
        for (int i = str.length() -1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo{
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String intStr = "Lyambda";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse,intStr);
        System.out.println(intStr);
        System.out.println(outStr);
    }
}
