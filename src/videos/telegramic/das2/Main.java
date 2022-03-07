package videos.telegramic.das2;

public class Main {
    public static void main(String[] args) {
        String text = " ";
        String f = new String("miban");
        char[] arr = {'m','a','s','i','v','i','k'};
        System.out.println(arr);

        f = "" + 5;
        System.out.println(f);
        f = " sfsda " + 3.0;
        System.out.println(f);
        f = "" + true;
        System.out.println(f);

        f = f.concat("pix");
        System.out.println(f);
        f = f.concat("5");
        System.out.println(f);

        System.out.println(f.length());

        f = String.join(" - ","JAVA","DAS","2","1","3","jfakj");
        System.out.println(f);
    }
}












