package videos.ITVDN.javaEssential.lesson8.exceptions.ex_013;
public class MyExceptionA extends Exception{
    public MyExceptionA(String message){
        super(message);
    }
}

class MyExceptionB extends MyExceptionA {
    public MyExceptionB(String message){
        super(message);
    }
}

class Main{
    public static void main(String[] args) {
        try {
            throw new MyExceptionA("MyExceptionA");
        } catch (MyExceptionB myExceptionB) {
            System.out.println(myExceptionB.getMessage());
        } catch (MyExceptionA myExceptionA) {
            System.out.println(myExceptionA.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
