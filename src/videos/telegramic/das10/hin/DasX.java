package videos.telegramic.das10.hin;

public class DasX {
    public static void main(String[] args) {
        try {
            kardal();
        } catch (VayException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        int a = 5, b = 0;
        int[] aa = {};
        try {
            System.out.println(a / b);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } /*catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.err.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }*/ finally {
            System.out.println("finally");
        }
    }

    static void kardal() throws VayException {
        throw new VayException();
    }

}
