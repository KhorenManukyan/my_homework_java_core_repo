package videos.ITVDN.JavaProfessionalRenewed.lesson1.repetition.comparable.ex003;

import java.util.ArrayList;
import java.util.List;

public class ReverseExample {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            arrList.add(i);
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arrList.size(); i++) {
            int j = arrList.size() - i - 1;
            System.out.print(arrList.get(j) + " ");
        }
    }
}
