package videos.ITVDN.JavaProfessionalRenewed.lesson1.old.two;

public class Animal {
    private String breed;
    private int price;

    Animal(String breed, int price){
        this.breed = breed;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price += price;
    }

    public String toString(){
        return breed + " " + price;
    }
}
