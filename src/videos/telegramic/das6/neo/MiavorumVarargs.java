package videos.telegramic.das6.neo;

public class MiavorumVarargs {
    public static void main(String[] args) {
//        String full = miavorum("","asklf", "ksdjf", "kafdjl");
        String telephoneNumber = miavorum("+374", "(55)", "77","42","48");
        System.out.println(telephoneNumber);
    }

//    private static String miavorum(String ... text) {
//        String finalik = "";
//        for (String bar : text){
//            finalik +=" - " + bar;
//        }
//        return finalik.substring(6);
//    }
    private static String miavorum(String ... text){
        String finalik = "";
        for (String tar: text){
            finalik += "-" + tar;
        }
        return finalik.substring(1);
    }
}
