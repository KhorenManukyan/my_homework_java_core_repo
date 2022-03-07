package videos.telegramic.das7.hin.interfaces.and.enums;

import videos.telegramic.das7.hin.abstracts.Animal;

public class Mard extends Animal implements MtacoxEak,QayloxEak,ShnchoxEak {
    String name;
    SocMakardak socMakardak;
    Pashton pashton;

    public Mard(String name, SocMakardak socMakardak, Pashton pashton) {
        this.name = name;
        this.socMakardak = socMakardak;
        this.pashton = pashton;
    }

    public Mard(SocMakardak socMakardak, Pashton pashton) {
        this.socMakardak = socMakardak;
        this.pashton = pashton;
    }

    public Mard(SocMakardak socMakardak){
        this.socMakardak = socMakardak;
        this.pashton = Pashton.ANHAYT;
    }
    @Override
    public void makeASound() {

    }

    @Override
    public void shnchumE() {

    }

    @Override
    public void mtacel() {

    }

    @Override
    public void qaylel() {

    }
}
