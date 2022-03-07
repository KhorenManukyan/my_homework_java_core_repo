package videos.ITVDN.JavaProfessionalRenewed.lesson15.lambda.withauth.lambda;

public class Radio implements ElectricityConsumer{
    private void playMusic(){
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
