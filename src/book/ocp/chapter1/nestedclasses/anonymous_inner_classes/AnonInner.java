package book.ocp.chapter1.nestedclasses.anonymous_inner_classes;

public class AnonInner {
/*
    abstract class SaleTodayOnly{
        abstract int dollarsOff();
    }

    public int admission(int basePrice){
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
  */

/*
    interface SaleTodayOnly{
        int dollarsOff();
    }

    public int admission(int basePrice){
        SaleTodayOnly saleTodayOnly = new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - saleTodayOnly.dollarsOff();
    }
*/


    interface SaleTodayOnly {
        int dollarsOff();
    }

    public int pay() {
        return admission(5, new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        });
    }

    public int admission(int basePrice, SaleTodayOnly saleTodayOnly) {
        return basePrice - saleTodayOnly.dollarsOff();
    }

    public static void main(String[] args) {
        AnonInner anonInner = new AnonInner();
        System.out.println(anonInner.pay());
    }

}




















