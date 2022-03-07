package videos.ITVDN.JavaProfessionalRenewed.lesson1.old.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Animal> arrList = new ArrayList<>();
        arrList.add(new Animal("Sphynx", 10000));
        arrList.add(new Animal("Malamute", 20000));

        Iterator<Animal> iterator = arrList.iterator();

        while (iterator.hasNext()){
            Animal temp = iterator.next();
            System.out.println(temp.getPrice());
        }
    }
}
