package videos.ITVDN.javaEssential.lesson8.exceptions.ex_006;

import book.horstman.java.core.chapter7.FileInputStream;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserEx();
        } catch (UserEx userEx) {
            System.out.println("obrabotka");
            userEx.meth();

            try {
                FileInputStream fa = new FileInputStream("C:\\NonExistentFile.log");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
