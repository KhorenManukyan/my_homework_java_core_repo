package videos.ITVDN.javaEssential.lesson4.interfaces.ex001;

interface Interface {
    void method();
}

class MyClass implements Interface{
    public void method(){
        System.out.println("method");
    }
}
public class Main {
    public static void main(String[] args) {
        Interface myClass = new MyClass();
        myClass.method();
    }
}


