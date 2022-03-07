package videos.telegramic.das10.hin;

public class Main {
    public static void main(String[] args) {
        XString xString = new XString();
        try {
            xString.setX("axa");
            System.out.println(xString.getX());
        } catch (VayException e) {
            e.printStackTrace();
        }
    }
}
