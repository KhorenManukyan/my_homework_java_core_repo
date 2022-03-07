package videos.ITVDN.javaEssential.lesson8.exceptions.ex_004;

public class Main {
    public static void main(String[] args) {
        try {
            MyClass myClass = new MyClass();
            myClass.myMethod();
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class MyClass{
    public void myMethod() throws Exception {
        Exception ex = new Exception("My Exception");
        throw ex;
    }
}
