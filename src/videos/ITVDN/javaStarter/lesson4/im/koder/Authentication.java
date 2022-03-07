package videos.ITVDN.javaStarter.lesson4.im.koder;

import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        String login = "Khoren";
        String password = "password";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Մուտքագրեք լոգինը");
        String userLogin = scanner.next();

        if (login.equals(userLogin)){
            System.out.println("mutqagreq parol@");
            String userPassword = scanner.next();
            if (password.equals(userPassword)){
                System.out.println("Barev " + userLogin + ". Duq mutq gorceciq hamakarg");
            } else {
                System.out.println("sxal password");
            }
        } else {
            System.out.println("Tvyal user@ goyutyun chuni");
        }
    }
}
