package videos.telegramic.das4;

public class BUFFNeo {
    public static void main(String[] args) {
        String x = "arjeq";
        x = x.replace("a","");
//        System.out.println(x);

        StringBuilder builder = new StringBuilder("text");
        x = builder.toString();
        x = x.concat(" nor text");
        builder.append(" nor text").append(" vay").append(" 11").append("a");
        System.out.println(x);
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder);
    }
}
