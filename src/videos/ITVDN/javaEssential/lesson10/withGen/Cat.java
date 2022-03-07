package videos.ITVDN.javaEssential.lesson10.withGen;

public class Cat {
    String name;

    Cat(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
