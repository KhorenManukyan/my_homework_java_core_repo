package videos.ITVDN.JavaProfessionalRenewed.lesson2.list.arrayList.workingTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getTimeMsoffInsert(new ArrayList<>()));
        System.out.println(getTimeMsoffInsert(new LinkedList<>()));
    }

    private static long getTimeMsoffInsert(List list) {
        Date currentTime = new Date();
        insert10000(list);

        Date newTime = new Date();
        long msDolay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is: "+ msDolay+ " is ms");
        return msDolay;
    }

    private static void insert10000(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add( new Object());
        }
    }
}
