package videos.ITVDN.javaEssential.lesson8.exceptions.ex_005;

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println("Ob ex");
            e.method();
        }
    }
}

class UserException extends Exception {
    public void method() {
        System.out.println("My ex");
    }
}
