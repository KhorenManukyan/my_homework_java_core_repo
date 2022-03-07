package videos.ITVDN.JavaProfessionalRenewed.lesson2.queue;

import java.util.ArrayDeque;

public class ArrayDequeMain {
    public static void main(String[] args) {
        ArrayDeque<String > states = new ArrayDeque<>();

        states.add("Ukraine");
        states.add("France");

        states.push("US");
        states.push("US");

        String sFirst = states.getFirst();
        String sLast = states.getLast();
//        System.out.println(sFirst);
//        System.out.println(sLast);

        while (states.peek() != null){
            System.out.println(states.pop());
        }
        System.out.println(states.size());

        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addFirst(new Person("Nick"));
        for (Person person : people) {
            System.out.println(person.getName());
        }

    }
}
