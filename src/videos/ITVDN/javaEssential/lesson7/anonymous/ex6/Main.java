package videos.ITVDN.javaEssential.lesson7.anonymous.ex6;

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance1 = new ConcreteClass() {
            @Override
            public void method() {
                System.out.println("instance1: method() ");
            }
        };

        Interface instance2 = new ConcreteClass(){
            int protectedField = 3;

            @Override
            public void method() {
                System.out.println("instance1: method() ");
            }

            @Override
            public int getValue() {
                return this.protectedField + super.getValue();
            }
        };
        instance1.method();
        instance2.method();

        System.out.println(instance1.getValue() + " " + instance2.getValue());
    }
}
