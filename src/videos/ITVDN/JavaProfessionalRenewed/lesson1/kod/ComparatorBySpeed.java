package videos.ITVDN.JavaProfessionalRenewed.lesson1.kod;

import java.util.Comparator;

public class ComparatorBySpeed implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)o1).speed - ((Animal)o2).speed;
    }
}
