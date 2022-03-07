package videos.ITVDN.JavaProfessionalRenewed.lesson1.repetition.comparable.ex003;

public class Animal implements Comparable {
    String breed;
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
    public int compareTo(Object o) {
        int tmp = weight - ((Animal)o).weight;
//        if (tmp == 0){
//            tmp = speed - ((Animal)o).speed;
//            return tmp;
//        }
        return tmp;
    }

    @Override
    public String toString() {
        return "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", price=" + price;
    }
}
