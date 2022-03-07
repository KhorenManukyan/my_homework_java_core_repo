package videos.telegramic.das8.neo;

public interface CodeWriter {
    public String writeCode();

    default void lovelyWork(){
        System.out.println("I love write the code!!! ");
    }
}
