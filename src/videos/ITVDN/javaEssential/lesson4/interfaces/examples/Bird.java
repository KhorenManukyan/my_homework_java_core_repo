package videos.ITVDN.javaEssential.lesson4.interfaces.examples;

public abstract class Bird implements Creator{
    public void live(){
        System.out.println("I can live!!!");
    }
    public abstract void move();
}
