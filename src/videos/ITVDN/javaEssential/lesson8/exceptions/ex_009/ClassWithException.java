package videos.ITVDN.javaEssential.lesson8.exceptions.ex_009;

public class ClassWithException {
    public void throwInner() throws Exception {
        throw new Exception("This is a inner Exception");
    }

    public void catchInner() throws Exception {
        try {
            this.throwInner();
        } catch (Exception e) {
            throw new Exception("This is a vneshnee exception",e);
        }
    }
}

class Main{
    public static void main(String[] args) {
        ClassWithException instance = new ClassWithException();
        try {
            instance.catchInner();
        } catch (Exception e) {
            System.out.println("ex caught " + e.getMessage());
            System.out.println("ex cause " + e.getCause());
        }
    }
}