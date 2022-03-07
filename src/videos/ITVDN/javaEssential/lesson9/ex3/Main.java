package videos.ITVDN.javaEssential.lesson9.ex3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(12);
        Car car2 = new Car(12);
        Car car3 = new Car(15);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
