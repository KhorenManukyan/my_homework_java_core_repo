package videos.ITVDN.javaEssential.lesson10.ex3;

public class MyClass {
    public <T> void method(T argument){
        T variable = argument;
        System.out.println(variable);
    }
}

class Main{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method(111);
        myClass.method("Vlad");

    }
}
