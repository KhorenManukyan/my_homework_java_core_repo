package videos.ITVDN.JavaProfessionalRenewed.lesson2.list.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            System.out.println("mutqagreq arjeq@ [" + i + "]");
            String s = reader.readLine();
            arrayList.add(s);
        }

        for (int i = 0; i < 3; i++) {
            String s = arrayList.remove(arrayList.size()-1);
            arrayList.add(0,s);
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
