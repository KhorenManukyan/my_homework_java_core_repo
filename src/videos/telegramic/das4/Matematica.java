package videos.telegramic.das4;

public class Matematica {
    public static void main(String[] args) {
        int inchvor_tiv = -95;
        inchvor_tiv = Math.abs(inchvor_tiv);
        System.out.println(inchvor_tiv);
        int armat = (int)Math.sqrt(inchvor_tiv);
        System.out.println(armat);
        double xoranardArmat = Math.cbrt(inchvor_tiv);
        int tiv = (int) xoranardArmat;
        System.out.println(tiv);
        double astichan = Math.pow(5,8);
        System.out.println(astichan);
        int ti = Math.min(3,5);
        System.out.println(ti);

        ti = (int) Math.signum(ti);
        System.out.println(ti);

        System.out.println(Math.round(5.4));
        System.out.println(Math.rint(5.4));
//        System.out.println(Math.);
    }
}




























