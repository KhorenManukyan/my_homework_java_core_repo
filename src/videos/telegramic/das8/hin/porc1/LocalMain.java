package videos.telegramic.das8.hin.porc1;

public class LocalMain {
    public static void main(String[] args) {
//        GitakanAstichan gitakanAstichan = new GitakanAstichan();
        GitakanAstichan<Integer> karg = new GitakanAstichan<>("Roman", 3);
        int astichan = karg.getAstichan();
        System.out.println(astichan);
        astichan = karg.astichan;
        System.out.println(astichan);
        GitakanAstichan<String > k2 = new GitakanAstichan<>("k2", "doc");
        String ast = k2.astichan;
        System.out.println(ast);
        ast = k2.getAstichan();
        System.out.println(k2.getName() + " " + ast);
        GitakanAstichan<Number> karg2 ;
        Number number = new Integer(58);

        karg.orinak(58+k2.astichan);

        Buka buka = new Buka();
        buka.mibanAnel("sfd");

    }
}

















