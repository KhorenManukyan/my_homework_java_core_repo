package videos.telegramic.das8.hin.porc2;

public class LocalMainX {
    public static void main(String[] args) {
        Vandak<Kendani> kendaniVandak = new Vandak<>(new Kendani("xexch"));
        Vandak<Cat> catVandak = new Vandak<>(new Cat("Murzik"));
        Vandak<Dog> dogVandak = new Vandak<>(new Dog("Hafo"));
Vandak<Gayl> gaylVandak = new Vandak<>(new Gayl("BAaa"));
        Vandak<?> esIncha = new Vandak<>(new Kendani("xexch"));
        Vandak<Ker> ker = new Vandak<>(new Ker());
        tpelKendaniAnuny(kendaniVandak);
        tpelKendaniAnuny(catVandak);
        tpelKendaniAnuny(gaylVandak);
//        tpelKendaniAnuny(ker);
        tpelTesak(dogVandak);
        tpelTesak(kendaniVandak);

        Aysinqn<Integer> aysinqn = new Aysinqn<>();

    }

    private static void tpelKendaniAnuny(Vandak<? extends Kendani> kendaniVandak) {
        System.out.println("Vandakum e gtnvum = " + kendaniVandak.kendani.name);
    }
    private static void tpelTesak(Vandak<? super Dog> kendaniVandak) {
        System.out.println("Class : - " + kendaniVandak.kendani.getClass().getSimpleName());
    }
}
