package videos.ITVDN.javaStarter.lesson4.im;

import java.util.Scanner;

public class TernaryString {
    public static void main(String[] args) {
        String login = "Hello ";
        System.out.println("mutqagreq login@");
        Scanner scanner = new Scanner(System.in);
        String userLogin = scanner.next();
        login += userLogin.equals("Khoren")?"Administrator":"User";
        System.out.println(login);
    }
}
