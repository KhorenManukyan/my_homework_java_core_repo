package book.shildt.javacore.chapter9.interfaces.interfaces_variables;

public class Main {
    public static void main(String[] args) {
        Question q = new Question();
        AskMe.answer(q.ask());
        AskMe.answer(q.ask());
        AskMe.answer(q.ask());
        AskMe.answer(q.ask());
    }
}
