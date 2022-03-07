package videos.ITVDN.JavaProfessionalRenewed.lesson15.lambda.withauth.lambda;


import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<ElectricityConsumer> list = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener){
        list.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener){
        list.remove(listener);
    }

    public void switchOn(){
        System.out.println("Viklyuchatel vklyuchon");

        for (ElectricityConsumer c:list){
            c.electricityOn(this);
        }
    }
}


















