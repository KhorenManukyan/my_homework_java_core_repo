package book.ocp.chapter3.bounds;

import java.util.ArrayList;
import java.util.List;

public class page119 {
    public static void main(String[] args) {
//        ArrayList<Number> list = new ArrayList<Integer>();

        List<? extends Number> list = new ArrayList<Integer>();
    }

    public static long total(List<? extends Number> list){
        long count = 0;

        for (Number number: list){
            count += number.longValue();
        }
        return count;
    }
}
