package videos.telegramic.das3;

import java.io.OutputStream;
import java.util.Arrays;

public class Das_String {
    public static void main(String[] args) {
        char[] carizm = {'B', 'a', 'r', 'e', 'v'};
        String bar = "Ba[rev[";
        bar += "rob";
//        bar = new String(carizm, 2, 3);
        System.out.println(bar);

        char[] norCharism = bar.toCharArray();
        System.out.println(Arrays.toString(norCharism).replace("[","1"));

        String miban = "BArev herosnerin ev mnacacin!";
        System.out.println(miban.replace("herosnerin" , "..."));

        System.out.println(miban.toCharArray().length);

        String datark = "";
        String chvoroshvac = null;

        System.out.println(datark.isEmpty()?"datark":"datark che");
    }
}

















