package videos.interediate.pulin.arac.chapter_3._4generics;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();

        Crate<Zebra> zebra = new Crate<>();

        Robot joeBot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.packCrate(joeBot);

        Robot adDestination = robotCrate.emptyCrate();

        Integer numPound = 15_000;
        SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant,numPound                                                                                                                                        );
    }
}
