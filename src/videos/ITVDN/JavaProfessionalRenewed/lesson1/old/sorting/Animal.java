package videos.ITVDN.JavaProfessionalRenewed.lesson1.old.sorting;

public class Animal implements Comparable<Animal>{
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price){
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;

    }

    @Override
    public int compareTo(Animal o) {
/*        int tmp = this.speed - ((Animal) o).speed;
//        return tmp;

        if (tmp == 0){
            return this.price - ((Animal) o).price;
        } else {
            return tmp;
        }*/

//        return this.breed.compareTo(((Animal)o).breed);
        return this.breed.compareTo(o.breed);
    }
}
