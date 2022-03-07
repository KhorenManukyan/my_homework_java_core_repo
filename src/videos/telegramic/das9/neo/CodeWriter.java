package videos.telegramic.das9.neo;

public interface CodeWriter {
    public String writeCode();

    default void lovelyWork(){
        System.out.println("I love write the code!!! ");
    }
}
