package book.ocp.chapter1.coding.toString;

public class Hippo {
    private String name;
    private int weight;

    public Hippo(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + weight;
    }

    public static void main(String[] args) {
        Hippo hippo = new Hippo("Harry", 3100);
        System.out.println(hippo);
    }
}
