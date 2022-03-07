package book.ocp.chapter3.generic;

import videos.interediate.pulin.arac.chapter_3._4generics.Robot;

public class Elephant {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();
        Crate<Zebra> zebraCrate = new Crate<>();
        Robot robot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.packCrate(robot);
        Robot atDestination = robotCrate.emptyCrate();


        Integer numPounds = 15_000;
        SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant, numPounds);

    }

}
class Zebra{

}
