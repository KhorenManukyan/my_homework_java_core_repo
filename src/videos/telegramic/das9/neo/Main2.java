package videos.telegramic.das9.neo;

public class Main2 {
    public static void main(String[] args) {
        long f = Hashvich.GUMARUM.getResult(5,6);
        System.out.println(f);

//        Hashvich.GUMARUM.
        Hashvich[] h = Hashvich.values();
        for(Hashvich a: h){
            System.out.println(a);
        }
    }
}
