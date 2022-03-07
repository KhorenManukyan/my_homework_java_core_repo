package videos.telegramic.das7.neo.animal;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.voice();
//        this.toString();
    }

    void voice(){
        System.out.println("vaaaaayy");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
