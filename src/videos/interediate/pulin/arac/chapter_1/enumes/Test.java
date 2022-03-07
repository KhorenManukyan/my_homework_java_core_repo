package videos.interediate.pulin.arac.chapter_1.enumes;

public class Test {
    public static void main(String[] args) {
/*        Seasons.SUMMER.printExpectVisitors();
        Season season = Season.SUMMER;*/

        for (Seasons seasons: Seasons.values()){
            seasons.printExpectVisitors();
        }
//        System.out.println(Season.SUMMER);
//        System.out.println(season == Season.SUMMER);

        /*
        for (Season s:Season.values()) {
            System.out.println(s.name() + " " + s.ordinal());
        }*/

//        Season s1 = Season.valueOf("SUMMER");
//        Season s2 = Season.valueOf("summer");
//        System.out.println(s1);
//        System.out.println(s2);
/*        switch (season){
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");

        }*/
    }
}
