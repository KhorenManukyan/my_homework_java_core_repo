package videos.ITVDN.JavaProfessionalRenewed.lesson1.kod;

public class Animal {
    private String breed;
    int weight;
    int speed;
    int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed + " " + weight + " " + speed + " " + price;
    }
}
