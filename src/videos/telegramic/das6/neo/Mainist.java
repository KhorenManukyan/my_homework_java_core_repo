package videos.telegramic.das6.neo;

public class Mainist {
    public static void main(String[] args) {
        String text = "aakjsdfs akjfsfkjsa sjdkfhaj jahfkaj";
        System.out.println(text.length());
        text = text.replace(" ", "");

        System.out.println(text.length());
        System.out.println("*********************************");
        tpel_tareri_qanaky(text,"a");
        tpel_tareri_qanaky(text,"u");
        tpel_tareri_qanaky(text,"f");

        System.out.println("*********************************");

        text = "aakjsdfs akjfsfkjsa sjdkfhaj jahfkaj";
        text = text.replace("a", "aa");
        System.out.println(text);
        text = text.replace(" ", "");

        System.out.println(text.length());

        System.out.println("*********************************");

        
    }

    private static void tpel_tareri_qanaky(String text, String tar) {
        text = "aakjsdfs akjfsfkjsa sjdkfhaj jahfkaj";
        text = text.replace(tar, tar+tar);
        text = text.replace(" ", "");

        System.out.println(text.length());

    }
}
























