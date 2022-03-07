package book.shildt.javacore.chapter6.prostoiClass;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }
        System.out.println("1-i parunakutyun@");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("2-i parunakutyun@");
        for (int i = 10; i < 20; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
