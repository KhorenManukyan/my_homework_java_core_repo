package book.shildt.javacore.chapter14.generic3;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> integerStats = new Stats<>(inums);
        double v = integerStats.average();
        System.out.println("Cpeднee значение iob равно•" + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> doubleStats = new Stats<>(dnums);
        double w = doubleStats.average();
        System.out.println("Cpeднee значение dob равно•" + w);

        Float[] fnums = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats<Float> floatStats = new Stats<>(fnums);
        double x = floatStats.average();
        System.out.println("Cpeднee значение fob равно•" + x);
        System.out.print("Cpeдниe значения iob и dob ");

        if (integerStats.sameAvg(doubleStats)){
            System.out.println("paвны.");
        } else {
            System.out.println("oтличaютcя.");
        }
        System.out.print("Cpeдниe значения iob и fob ");

        if (integerStats.sameAvg(floatStats)){
            System.out.println("paвны.");
        } else {
            System.out.println("oтличaютcя.");
        }
    }
}
