package videos.interediate.pulin.arac.porcnakan.test1.porcer;

import java.util.Collection;

class Sticker {
/*    public int hashCode(Object o) {
        return new Random().nextInt() ;
    }
    public boolean equals(Object o) {
        return true;
    }*/

    static interface Vehicle {}
    static class Bus implements Vehicle {}
    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println(null instanceof Bus);
        System.out.println(bus instanceof Vehicle);
        System.out.println(bus instanceof Bus);
        System.out.println(bus instanceof Collection);
    }
}