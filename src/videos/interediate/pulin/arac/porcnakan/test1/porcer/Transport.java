package videos.interediate.pulin.arac.porcnakan.test1.porcer;
/*
public class Transport {
    static interface Vehicle {
    }

    static class Bus implements Vehicle {
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        boolean n = null instanceof Bus;
        boolean v = bus instanceof Vehicle;
        boolean b = bus instanceof Bus;
        System.out.println(n + " " + v + " " + b);
    }
}*/
public class Transport {
    static interface Vehicle {}
    static class Bus implements Vehicle {}
    static class Van extends Bus {}
    public static void main(String[] args) {
        Bus bus = new Van();
        Van van = new Van();
        Van[] vans = new Van[0];
        boolean b = bus instanceof Vehicle;
        boolean v = van instanceof Vehicle;
        boolean a = vans instanceof Vehicle[];
        System.out.println(b + " " + v + " " + a);
    }
}