package videos.ITVDN.javaStarter.lesson6.im.koder;

import java.util.Scanner;

public class GuessColor {
    public static void main(String[] args) {
        final int NUMBER_OF_STEP = 5;
        int step = 0;
        String color = "white";
        System.out.println("5 angamic porceq gushakel guyn@");
        System.out.println("durs galu hamar havaqeq - exit");

        Scanner scanner = new Scanner(System.in);
        while (step<NUMBER_OF_STEP){
            step++;
            String inputStep = scanner.next();

            if (inputStep.equals("exit")){
                break;
            }

            if (!inputStep.equals(color)){
                if (step == NUMBER_OF_STEP){
                    System.out.println("qayleri limit@ sparvec!!!");
                    break;
                }
                System.out.println("krkin porcir");
                continue;
            }
            System.out.println("Duq gushakeciq guyn@ " + step + " angemic");
            break;
        }

        System.out.println("The end");
    }
}
