package videos.ITVDN.javaEssential.lesson7.anonymous.ex5;

public class Main {
    public static void main(String[] args) {
        Interface interface1 = new Interface() {
            int field = 0;

            @Override
            public void method() {
                field = 100;
            }

            @Override
            public int getValue() {
                return field;
            }
        };

        Interface interface2 = new Interface() {
            int field = -1;

            @Override
            public void method() {
                field = interface1.getValue();
            }

            @Override
            public int getValue() {
                return field;
            }
        };
/*        Interface interface3 = new Interface() {
            @Override
            public void method() {

            }

            @Override
            public int getValue() {
                return 0;
            }
        };
        Interface interface4 = new Interface() {
            @Override
            public void method() {

            }

            @Override
            public int getValue() {
                return 0;
            }
        };*/
        interface1.method();
        interface2.method();

        System.out.println(interface1.getValue() + " " + interface2.getValue());
    }
}
