package book.shildt.javacore.chapter15.methodReferance.page479;

public class MyStringOps {

    String strReverse(String str){
        String result = "";
        for (int i = str.length() -1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo2 {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String intStr = "Lyambda";
        String outStr;

        MyStringOps myStringOps = new MyStringOps();

        outStr = stringOp(myStringOps::strReverse,intStr);
        System.out.println(intStr);
        System.out.println(outStr);
    }
}
