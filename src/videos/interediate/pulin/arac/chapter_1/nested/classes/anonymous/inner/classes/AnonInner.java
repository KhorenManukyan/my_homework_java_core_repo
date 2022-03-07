package videos.interediate.pulin.arac.chapter_1.nested.classes.anonymous.inner.classes;

public class AnonInner {
    /*abstract class*/interface SaleTodayOnly{
         /*abstract*/ int dollarsOff();
    }

    public int admission(int basePrice){
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
}
