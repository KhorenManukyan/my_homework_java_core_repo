package videos.interediate.pulin.arac.chapter_1.enumes;

public enum Seasons {
    WINTER("Low"),
    SPRING("Medium"),
    SUMMER("High"),
    FALL("Medium");
    private String expectedVisitors;

    private Seasons(String expectedVisitors){
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectVisitors(){
        System.out.println(expectedVisitors);
    }
}
