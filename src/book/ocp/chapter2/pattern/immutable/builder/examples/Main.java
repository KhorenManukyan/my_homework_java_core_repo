package book.ocp.chapter2.pattern.immutable.builder.examples;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 GB", "2")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();


        Set<Computer> computers = new HashSet<>();
        computers.add(computer);
        computers.forEach(System.out::println);


    }
}
