package videos.ITVDN.JavaProfessionalRenewed.lesson3.hashMap;

import java.util.Locale;

public class Human {
    private String name;

    public Human(String name){
        this.name = name;
    }

    public String toString(){
        return name != null? name.toUpperCase(): null;
    }
}
