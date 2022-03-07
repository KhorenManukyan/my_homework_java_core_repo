package videos.interediate.pulin.arac.porcnakan.test.generic;

public class Box<T> {
    T animal;

    public Box(T animal) {

        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
