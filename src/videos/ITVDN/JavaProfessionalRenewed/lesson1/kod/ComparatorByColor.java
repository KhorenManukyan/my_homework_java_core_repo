package videos.ITVDN.JavaProfessionalRenewed.lesson1.kod;

import java.util.Comparator;

public class ComparatorByColor implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.weight - o2.weight;
    }
}
