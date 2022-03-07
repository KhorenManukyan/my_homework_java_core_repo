package videos.telegramic.das7.hin.interfaces.and.enums;

public class Main {
    public static void main(String[] args) {
        Mard mard = new Mard(SocMakardak.HARUST);
        Mard mard1 = new Mard(SocMakardak.NORMAL, Pashton.DEVEL);

        Mard[] joxovurd = {new Mard("Hopar", SocMakardak.NORMAL, Pashton.HASHVAPAH),
                new Mard("Samo", SocMakardak.HARUST, Pashton.DEVEL),
                new Mard("Armine", SocMakardak.HARUST, Pashton.HZOR_MI_BAN),
                new Mard("Gvo", SocMakardak.MIJIN, Pashton.HASHVAPAH),
                new Mard("Zvo", SocMakardak.TENC, Pashton.HASHVAPAH),
        };

        System.out.println(Aybbuben.A.getArjeq());
        System.out.println("///////////////////////////////////");

        System.out.println(Hashvel.Gumar.hashvel(5f,10f));





        System.out.println("///////////////////////////////////");


        for (Mard mard2 : joxovurd) {
            switch (mard2.socMakardak) {
                case SHAT_HARUST:
                    System.out.println(mard2.name +
                            " karox e gnel tuyn meqena, qani vor inq@ pashtonov " +
                            mard2.pashton + " e!!!!");
                    break;
                case HARUST:
                    System.out.println(mard2.name +
                            " karox e gnel tuyn meqena, qani vor inq@ pashtonov " +
                            mard2.pashton + " e!!!!");
            }
        }

    }
}
