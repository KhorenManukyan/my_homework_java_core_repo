package videos.telegramic.das9.neo;

public class Main {
    public static void main(String[] args) {
        Mard mard = new Mard("Khoren", 30);
        Lvl orinakLvl = Lvl.valueOf("JUNIOR");
        Lvl[] masiv = Lvl.values();
        System.out.println(orinakLvl.getAshxatavardz());

        System.out.println(orinakLvl.status);
        for (Lvl arr:masiv){
            System.out.println(arr.status);
        }

        switch (orinakLvl) {
            case JUNIOR:
            case MIDDLE:
            case SENIOR:
            case STUDENT:
        }
    }
}
