package videos.Tigrani.daseric.lesson12;

public class Dog extends Animal{

    @Override
    public void voice(){
        System.out.println("the voice of Dog");
    }

    public void voice(String a){
        System.out.println("the voice of a");
    }

    public void voice(String a, int b){
        System.out.println("the voice of a b");
    }
}
