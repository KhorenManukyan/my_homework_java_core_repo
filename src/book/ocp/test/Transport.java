package book.ocp.test;

public class Transport {
    static interface Vehicle {}
    static class Bus implements Vehicle {}

    private static int numShovels;
    private int numRakes;

    public static int getNumShovels() {
        return numShovels;
    }


    public static void main(String[] args) {

        Bus bus = new Bus();
        boolean n = null instanceof Bus;
        boolean v = bus instanceof Vehicle;
        boolean b = bus instanceof Bus;
        System.out.println(n + " " + v + " " + b);
    }
}
