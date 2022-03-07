package videos.Tigrani.daseric.lesson14;

import java.io.IOException;

public class Example4 {
    public static void main(String[] args) {
        Example4 rrr = new Example4();
        try {
            rrr.eee(33);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void eee(int a) throws IOException {
        if (a < 55) {
            throw new IOException();
        }
    }
}

class ddddddds extends Example4 {
    void eee(int a) throws IOException{
        System.out.println(a);
    }
}
