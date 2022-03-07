package videos.telegramic.das11.neo.das23;

import videos.telegramic.das11.neo.das1.Animal;
import videos.telegramic.das8.hin.porc2.Kendani;

public class Main {
    public static void main(String[] args) {
        Bun<Kku> kkviBun = new Bun<>(new Kku());
        Bun<Vochil> vochilBun = new Bun<>(new Vochil());
        kkviBun.kendani.trchel();
//        bunik.kendani.dzaynHanel();
        Bun<Shunik> shunikBun = new Bun<>(new Shunik());
        shunikBun.kendani.voticKcel();
//        Bun<?>[] kendani = {kkviBun, shunikBun, vochilBun};
        miBanAnel(kkviBun);
        miBanAnel(vochilBun);
        miBanAnel(shunikBun);
        Bun<KkviJarang> kkviJarangBun = new Bun<>(new KkviJarang());
        Bun<Animal> animalBun = new Bun<>(new Kku());
        miBanChanel(kkviJarangBun);
        miBanChanel(kkviBun);
        miBanChanel(animalBun);
    }

    private static void miBanChanel(Bun<? super KkviJarang> kkviJarangBun) {
    }

    private static void miBanAnel(Bun<? extends Animal> kkviBun) {

    }


}
