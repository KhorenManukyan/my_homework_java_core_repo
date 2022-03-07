package book.shildt.javacore.chapter8.prakticheski.primer;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight myBox2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol =myBox1.volume();
        System.out.println(vol);
        vol = myBox2.volume();
        System.out.println(vol);
        System.out.println(myBox2.weight);
        myBox1 = myBox2;
        System.out.println(myBox2.volume());

    }
}
