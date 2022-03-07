package book.horstman.java.core.chapter3;

public class IfElseIfExample {
    public static void main(String[] args) {
        int yourSales = 1;
        int target = 2;
        int bonus = 0;
        String performance = "";
        if (yourSales >= 32) {
            performance = "Excellent";
            bonus = 1000;
        } else if(yourSales >= 115.5 * target) {
            performance = "Fine";
            bonus = 500;
        } else if (yourSales >= target){
            performance = "Satisfactory";
            bonus = 100;
        } else {
            System.out.println("You're fired");
        }
        System.out.println(performance);
        System.out.println(bonus);
    }
}
