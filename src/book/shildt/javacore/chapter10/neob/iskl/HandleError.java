package book.shildt.javacore.chapter10.neob.iskl;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        Random random = new Random();
        for (int i = 0; i <10; i++) {
            b= random.nextInt();
            c=random.nextInt();
            System.out.print(i + "= " + a);
            try {
                a = 12345/ (b/c);
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
