package videos.ITVDN.JavaProfessionalRenewed.lesson15.lambda.withauth.lambda;

public class Main {
    public static void fire(Object sender){
        System.out.println("Fire!!!");
    }

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        String message = "Pajar";

       /*
        switcher.addElectricityListener(new ElectricityConsumer() {
            @Override
            public void electricityOn(Object sender) {
                System.out.println(message);
            }
        });
        */

        switcher.addElectricityListener(sender ->System.out.println(message));

        switcher.addElectricityListener(Main::fire);

        switcher.switchOn();
    }
}
