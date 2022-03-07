package book.shildt.javacore.chapter15.lyambda.page468;

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc st = str -> {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }

         return result;
        };
        System.out.println(st.func("Arama"));
    }

}

interface StringFunc{
    String func(String n);
}
