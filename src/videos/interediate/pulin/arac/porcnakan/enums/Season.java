package videos.interediate.pulin.arac.porcnakan.enums;

public enum Season {
    WINTER, SPRING, SUMMER, FALL;

    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER);
        System.out.println(s == Season.SUMMER);
        System.out.println();

        for (Season se : Season.values()) {
            System.out.println(se.name() + " " + se.ordinal());
        }
    }
}
