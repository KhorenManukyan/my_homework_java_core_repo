package videos.Tigrani.daseric.lesson12;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog();
        animals[1] = new Chicken();
        animals[2] = new Tiger();
        animals[3] = new Cat();
        animals[4] = new Dog();

        Animal cat = new Cat();
        cat.voice();
//        System.out.println(cat);
        System.out.println("_____________________________");
        Dog d = new Dog();
        d.voice();
        d.voice("aaaaaaa");
        d.voice("aa",1);


        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
