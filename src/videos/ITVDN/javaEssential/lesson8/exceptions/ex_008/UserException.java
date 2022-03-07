package videos.ITVDN.javaEssential.lesson8.exceptions.ex_008;

public class UserException extends Exception {
    public void method(){
        System.out.println("My exception");
    }
}

class Main{
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println("obrabotka 1");
            e.method();


            try {
                throw e;
            } catch (UserException ex){
                System.out.println("obrabotka 2");
                ex.method();
            } finally {
                System.out.println("finally");
            }
        }
        System.out.println("end");
    }
}
