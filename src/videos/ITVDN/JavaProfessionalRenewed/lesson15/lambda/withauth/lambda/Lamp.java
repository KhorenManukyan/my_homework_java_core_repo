package videos.ITVDN.JavaProfessionalRenewed.lesson15.lambda.withauth.lambda;

public class Lamp implements ElectricityConsumer{

    private void lightOn(){
        System.out.println("Lamp vklyuchon");
    }
    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
