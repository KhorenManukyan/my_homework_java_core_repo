package videos.interediate.pulin.arac.chapter_4.using.variables.in.lambdas;

public interface Gorilla {
    String move();
}

class GorillaFamily{
    String walk = "walk";
    void everyonePlay(boolean baby){
        String approach = "amble";

        play(()-> walk);
        play(()-> baby?"hitch a ride":"run");
        play(()->approach);
    }

    static void play(Gorilla g){
        System.out.println(g.move());
    }

}
