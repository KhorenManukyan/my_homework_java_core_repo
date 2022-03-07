package videos.ITVDN.javaEssential.lesson2.animal;

public class Cat {
    private String name;
    private int age;

    public Cat(){
        this.name = "Boris";
        this.age = 14;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
}
