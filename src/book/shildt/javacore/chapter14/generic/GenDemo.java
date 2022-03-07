package book.shildt.javacore.chapter14.generic;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<>(48);
        Gen<Double> d = new Gen<>(23.4);
        d.showType();
        System.out.println(d.getOb());
        iOb.showType();
        int aa = iOb.getOb();
        System.out.println("znachenie: "+aa);
        Gen<String > stringGen = new Gen<>("test");
        stringGen.showType();
        String str = stringGen.getOb();
        System.out.println("znachenie: "+str);
//        int aaa = iOb.setOb(new Integer(44));
    }
}
