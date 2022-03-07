package videos.ITVDN.javaEssential.lesson10.withGen;

public class WithGen<T> {
    T obj;

    WithGen(T obj){
        this.obj = obj;
    }

    void display(){
        System.out.println(obj);
    }

}
