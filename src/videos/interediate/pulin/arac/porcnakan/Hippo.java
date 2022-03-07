package videos.interediate.pulin.arac.porcnakan;

public class Hippo {
    private String name;
    private double weight;

    public Hippo(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + weight;
    }

    public static void main(String[] args) {
        Hippo h1 = new Hippo("Harry", 3111);
        System.out.println(h1);
    }
}
