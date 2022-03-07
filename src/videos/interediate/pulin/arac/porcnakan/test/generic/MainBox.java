package videos.interediate.pulin.arac.porcnakan.test.generic;

class Animal {

}

class Robot{
    @Override
    public String toString() {
        return "555";
    }


}

public class MainBox {
    public static void main(String[] args) {
        Box<Animal> boxOfAnimal = new Box<>(new Animal());
        Box<Robot> boxOfRobot = new Box<>(new Robot());
        Robot robot = new Robot();

    }
}
