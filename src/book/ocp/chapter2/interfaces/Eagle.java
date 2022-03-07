package book.ocp.chapter2.interfaces;

public class Eagle implements Fly{
    @Override
    public int getWingSpan() throws Exception {
        return 15;
    }

    @Override
    public void land() {
        System.out.println("Eagle is diving fast");
    }
}
