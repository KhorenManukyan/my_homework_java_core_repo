package book.shildt.javacore.chapter9.interfaces;

public class TestInterface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
