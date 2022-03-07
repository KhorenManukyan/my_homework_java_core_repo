package videos.ITVDN.javaEssential.lesson2.ex007_constructors;

public class Animal {
    private int age;
    private int height;
    public Animal(){
        this(338,33);
    }
/*

    public Animal(){
        age = 12;
        height = 34;
    }
*/

    public Animal(int age){
        this.age = age;
        height = 40;
    }

    public Animal(int age, int height){
        this.age = age;
        this.height = height;
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;
    }
}
