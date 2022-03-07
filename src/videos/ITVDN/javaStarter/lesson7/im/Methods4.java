package videos.ITVDN.javaStarter.lesson7.im;

public class Methods4 {
    public static void main(String[] args) {
        String sentence = "Khoren";
        System.out.println(function(sentence));
    }

    private static String function(String sentence) {
        if (sentence.equals("fool")) {
            return "duq mutqagrel eq antuylatreli bar";
        }

        String a = "Hello " + sentence + " jan";
        return a;
    }
}
