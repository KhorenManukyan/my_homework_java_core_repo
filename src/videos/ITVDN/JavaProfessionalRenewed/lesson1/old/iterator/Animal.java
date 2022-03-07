package videos.ITVDN.JavaProfessionalRenewed.lesson1.old.iterator;

public class Animal {
    private String breed;
    private int price;

    public Animal(String breed, int price){
        this.breed = breed;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getPrice() {
        price += 1000;
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return breed + " " + price;
    }
}
