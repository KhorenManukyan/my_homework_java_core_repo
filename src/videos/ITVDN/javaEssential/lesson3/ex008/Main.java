package videos.ITVDN.javaEssential.lesson3.ex008;

public class Main {
    public static void main(String[] args) {

        SomeClass instance = new SomeClass();
        instance.method();
        System.out.println(instance.publicField);

        SomeInterface instanceUp = instance;
        instanceUp.method();

        SomeClass instanceDown = (SomeClass) instanceUp;
        instanceDown.method();
        System.out.println(instanceDown.publicField);
    }
}
