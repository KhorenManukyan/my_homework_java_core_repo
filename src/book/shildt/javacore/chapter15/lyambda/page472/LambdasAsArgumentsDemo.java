package book.shildt.javacore.chapter15.lyambda.page472;

public class LambdasAsArgumentsDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lyambda povishyayet efektivnost java";
        String outStr;

        System.out.println("Tro isxodnaya stroka: " + inStr);

        outStr = stringOp(str->str.toUpperCase(),inStr);
        System.out.println("Eto stroka propisonnami bukvami: " + outStr);

        outStr = stringOp(str->{
            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' '){
                    result += str.charAt(i);
                }
            }
            return result;
        },inStr);

        System.out.println("Eto stroka s ydalennim probelam: " + outStr);

        StringFunc reverse = str ->{
            String result = "";
            for (int i = str.length() -1; i >=0 ; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Eto obrashennaya stroka: " + stringOp(reverse, inStr));
    }
}























