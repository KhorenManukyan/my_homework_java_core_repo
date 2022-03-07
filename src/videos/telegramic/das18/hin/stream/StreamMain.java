package videos.telegramic.das18.hin.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("mek1");
        list.add("erku 2");
        list.add("Ereq....3");
        list.add("4");

        list.stream().forEach(System.out::println);
        System.out.println("----------------------");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("----------------------");
        list.stream().sorted((x,y)->x.length()-y.length()).forEach(System.out::println);

        for(int i =0;i<list.size()-1;i++){
            int x = list.get(i).length();
            int y = list.get(i + 1).length();
            if (x<y){
                String temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, list.get(i));
                i = 0;
            }
        }
    }
}
