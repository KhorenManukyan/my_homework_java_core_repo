package videos.telegramic.das7.neo;

public class Main {
    public static void main(String[] args) {
        Color color = new Color();
        color.name = "Red";
        color.code = "#FF0000";

        Pan redPan = new Pan();
        redPan.color = color;

        Teacher teacherWithRedPen = new Teacher();
        teacherWithRedPen.name = "SS";
        teacherWithRedPen.pan = redPan;


    }
}
