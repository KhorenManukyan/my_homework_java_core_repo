package videos.ITVDN.javaEssential.lesson1.im.ex_001_class_declaration;

public class Car {
    private String model;
    private int maxSpeed;
    private int year;
    private int speed;

    public Car(){

    }

    public Car(String model, int maxSpeed, int year, int speed){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.speed = speed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
}