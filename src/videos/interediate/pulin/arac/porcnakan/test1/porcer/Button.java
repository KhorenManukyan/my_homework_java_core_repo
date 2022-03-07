package videos.interediate.pulin.arac.porcnakan.test1.porcer;

/*public class Button {
    private String text;
    public int hashCode() {
        return text.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}*/

public class Button {
    private String text;
    public int hashCode() {
        return text.hashCode();
    }
    public boolean equals(Object o) {
        if (!(o instanceof Button)) return false;
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

