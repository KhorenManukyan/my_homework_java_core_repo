package videos.interediate.pulin.arac.porcnakan.enums;

public enum SwitchEnums {
    WINTER, SPRING, SUMMER, FALL;

    public static void main(String[] args) {
        SwitchEnums summer = SwitchEnums.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }
    }
}
