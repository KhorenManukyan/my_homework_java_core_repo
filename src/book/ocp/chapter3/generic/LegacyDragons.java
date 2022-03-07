package book.ocp.chapter3.generic;

import java.util.ArrayList;
import java.util.List;

class Dragon { }
class Unicorn{}
public class LegacyDragons{
    public static void main(String[] args) {
        List unicorns = new ArrayList();
        unicorns.add(new Unicorn());
        printDragon(unicorns);
    }

    private static void printDragon(List<Dragon> dragons) {
        for (Dragon dragon : dragons) {
            System.out.println(dragon);
        }
    }
}

