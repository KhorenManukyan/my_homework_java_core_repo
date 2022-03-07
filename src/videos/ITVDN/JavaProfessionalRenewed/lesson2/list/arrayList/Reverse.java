package videos.ITVDN.JavaProfessionalRenewed.lesson2.list.arrayList;

import java.io.IOException;
import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
/*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            System.out.println("mutqagreq arjeq@ [" + i + "]");
            String s = reader.readLine();
            arrayList.add(s);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            int j = arrayList.size() - i - 1;
            System.out.print(i + " ");
            System.out.print(j + " ");
            System.out.print(arrayList.get(j) + " ");

        }*/
        System.out.println("/////////////////////////////////////");
        String a = "vaspur";
        for (int i = 0; i < a.length(); i++) {
            char[] s = a.toCharArray();
            int d = s.length -i-1;
            System.out.print(s[d]);
        }
    }

}
