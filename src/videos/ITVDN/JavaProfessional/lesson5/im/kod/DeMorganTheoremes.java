package videos.ITVDN.JavaProfessional.lesson5.im.kod;

public class DeMorganTheoremes {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (!a || !b){
            System.out.println("!A || !B = " +(!a || !b));
        } else {
            System.out.println("!A || !B = " +(!a || !b));
        }

        if (!(a && b)){
            System.out.println("!(A && B) = " + !(a && b));
        } else {
            System.out.println("!(A && B) = " + !(a && b));
        }
    }
}
