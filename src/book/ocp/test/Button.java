package book.ocp.test;

import java.util.Objects;

/*class Button {
    private String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Button button = (Button) o;
        return Objects.equals(text, button.text);
    }

    public int hashCode() {
        return text.hashCode();
    }
}*/

public class Button {
    private String text;
    public int hashCode() {
        return text.hashCode();
    }
    public boolean equals(Object o) {
        if (o instanceof Button) return false;
        Button b = (Button) o;
        return text.equals(b.text);
    }
    public static void main(String[] args) {
        Button b1 = new Button();
        Button b2 = new Button();
        b1.text = "mickey";
        b2.text = "mickey";
        System.out.println(b1.equals(b2));
    }
}
