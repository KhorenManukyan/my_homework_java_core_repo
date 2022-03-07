package videos.telegramic.das3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("347892374 429387498 afkjhalkh");
        while (scanner.hasNextInt()){
            System.out.println(scanner.next());
        }
    }
}
