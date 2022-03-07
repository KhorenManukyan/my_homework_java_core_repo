package videos.ITVDN.javaEssential.lesson9.ex3;

public class Car {
    private int id;

    public Car(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = (int)(3784333 * result * id);
        return result;
    }
}
