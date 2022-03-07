package book.ocp.chapter1.enumes;

public enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private String expectedVisitors;

    private Season(String expectedVisitors) {
        System.out.println(expectedVisitors);;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}

class Main {
    public static void main(String[] args) {
        Season s = Season.WINTER;
  /*      System.out.println(Season.SUMMER);
        System.out.println(s == Season.SUMMER);
        System.out.println(s.equals(Season.SUMMER));*/

/*        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        switch (s) {
            case WINTER:
                System.out.println("s");
                break;
            case SPRING:
                System.out.println("s");
                break;
        }

        System.out.println("===========================");
        Season.WINTER.printExpectedVisitors();*/
    }
}
