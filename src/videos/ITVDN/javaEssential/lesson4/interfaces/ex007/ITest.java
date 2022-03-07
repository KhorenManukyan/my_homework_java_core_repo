package videos.ITVDN.javaEssential.lesson4.interfaces.ex007;

public interface ITest {
    public static final int PRICE = 10;
    public abstract void meth();

    public static int sum(){
        return 2 + 55;
    }

    public default int mull(){
        return 2 * 4;
    }
}
