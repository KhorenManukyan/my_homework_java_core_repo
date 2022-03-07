package book.shildt.javacore.chapter9.interfaces;

public class Client implements Callback{
    @Override
    public void callback(int param) {
        System.out.println("Meтoд callback(), "
                + " вызываемый со значением " + param);
    }
}
