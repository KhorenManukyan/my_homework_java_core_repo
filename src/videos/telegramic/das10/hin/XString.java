package videos.telegramic.das10.hin;

public class XString {
    String x;
    public void setX(String x) throws VayException {
        if (x.contains("x")) throw new VayException();
        this.x = x;
    }

    public String getX(){
        return x;
    }
}
