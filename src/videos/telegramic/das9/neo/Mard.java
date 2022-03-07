package videos.telegramic.das9.neo;

public class Mard {
    String name;
    int age;

    public Mard(String name, int age){
        this.name = name;
        this.age = age;
        harcakanMethod();
    }

    public void harcakanMethod(){
        System.out.println("Harcakan method Mard classum : " + name + " = " + age);
    }
}
